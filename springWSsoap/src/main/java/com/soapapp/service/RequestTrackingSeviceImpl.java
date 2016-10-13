package com.soapapp.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soapapp.dao.RequestTrackingDAO;
import com.soapapp.entity.Animal;
import com.soapapp.entity.ProcessResponse;
import com.soapapp.entity.WSRequestData;

@Service
public class RequestTrackingSeviceImpl implements RequestTrackingService {

	private static final Map<String, String> animalDataMap;
	
	private static final String duplicateMsg = "Duplicate Request";
   
	static{
		animalDataMap = new HashMap<String, String>();
		animalDataMap.put("lion", "africa");
		animalDataMap.put("tiger", "india");
		animalDataMap.put("kangaroo", "australia");
		animalDataMap.put("panda", "america");
		animalDataMap.put("snakes", "malaysia");
		animalDataMap.put("rhino", "india");
    }
    
	@Autowired
	private RequestTrackingDAO requestTracDao;
	
	public ProcessResponse process(List<String> names) {
		
		ProcessResponse response = new ProcessResponse();
		
		StringBuilder reqString = new StringBuilder();
		for(String name:names){
			reqString.append(name).append(",");
		}		
		
		Date curDate = new Date(new java.util.Date().getTime());
		
		List<WSRequestData> data = getReqData(curDate);
		
		boolean result = chkDuplicate(reqString.toString(),data);
		
		if(!result){
			save(new WSRequestData(reqString.toString(), curDate));
			response.setAnimals(findOriginCountry(names));
		}else{
			response.setErrorMsg(duplicateMsg);
		}
		
		return response;
	}
	
	private List<Animal> findOriginCountry(List<String> names){
		List<Animal> animals = new ArrayList<Animal>();		
		for(String name:names){
			Animal animal = new Animal();
				animal.setName(name);
				animal.setOriginCountry(animalDataMap.get(name));
			animals.add(animal);
		}
		return animals;
	}
	
	private boolean chkDuplicate(String reqString, List<WSRequestData> todayRequsts){
		boolean result  =  false;
		for(WSRequestData dbReqData : todayRequsts){
			if(dbReqData.getRequestString().equalsIgnoreCase(reqString)){
				result = true;
				break;
			}
		}
		return result;
	}


	public WSRequestData save(WSRequestData reqData) {
		requestTracDao.addRequest(reqData);
		return null;
	}

	public List<WSRequestData> getReqData(Date date) {
		List<WSRequestData> reqDataList = requestTracDao.getReqData(date);
		return reqDataList;
	}
	
	
	
}
