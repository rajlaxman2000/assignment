package com.soapapp.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soapapp.entity.ProcessResponse;
import com.soapapp.mapper.AnimalMapper;
import com.soapapp.service.RequestTrackingService;
import com.soapapp.ws.AnimalRequest;
import com.soapapp.ws.AnimalResponse;

@Endpoint
public class SoapWSEndpoint {
	
	
	private static final String NAMESPACE_URI = "http://soapapp.com/ws";
	
	@Autowired
	private RequestTrackingService service;
	
	@Autowired
	private AnimalMapper mapper; 
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "animalRequest")
	@ResponsePayload
	public AnimalResponse getCountry(@RequestPayload AnimalRequest request) {
		
		AnimalResponse tempResponse=null;
		try{
			List<String> names = mapper.buildServiceRequest(request.getAnimalName());
			
			System.out.println(names);
			
			ProcessResponse response = service.process(names);
			
			if(response!=null){			
				tempResponse = mapper.buildWSResponse(response);
			}else{
				tempResponse = mapper.buildWSResponse();	
			}
			
		}catch(Exception ex){
			tempResponse = mapper.buildWSResponse(ex);	
		}
		return tempResponse;
	}
}
