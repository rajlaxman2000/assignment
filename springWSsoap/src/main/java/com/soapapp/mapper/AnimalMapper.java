package com.soapapp.mapper;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.soapapp.entity.ProcessResponse;
import com.soapapp.ws.Animal;
import com.soapapp.ws.AnimalResponse;

@Component
public class AnimalMapper{
	
	public static final String msg = "Data not available for the given animal";
	
	public List<String> buildServiceRequest(List<String> names){
		
		for(String name:names){
			name.toLowerCase();
		}		
		Collections.sort(names);
		return names;
		
	}
	public AnimalResponse buildWSResponse(ProcessResponse serviceResponse){
		AnimalResponse response = new AnimalResponse();
		if(!StringUtils.isEmpty(serviceResponse.getErrorMsg())){
			response.setErrorMsg(serviceResponse.getErrorMsg());
		}else{
			List<Animal>  wsAnimals = response.getAnimal();
			for(com.soapapp.entity.Animal animal:serviceResponse.getAnimals()){
				Animal animalWS = new Animal();
					animalWS.setName(animal.getName());
					if(!StringUtils.isEmpty(animal.getOriginCountry())){
						animalWS.setCountryOfOrigin(animal.getOriginCountry());
					}else{
					animalWS.setErrorMsg(msg);
					}
					wsAnimals.add(animalWS);
			}
		}
		return response;
	}
	
	
	public AnimalResponse buildWSResponse(){
		AnimalResponse response = new AnimalResponse();
			response.setErrorMsg("There seems to service Error, Please try later");
		return response;
	}
	
	public AnimalResponse buildWSResponse(Exception ex){
		AnimalResponse response = new AnimalResponse();
			response.setErrorMsg("There seems to service Error, Please try later");
			System.err.println(ex);
		return response;
	}

}
