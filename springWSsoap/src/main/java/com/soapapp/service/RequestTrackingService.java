package com.soapapp.service;

import java.sql.Date;
import java.util.List;

import com.soapapp.entity.ProcessResponse;
import com.soapapp.entity.WSRequestData;

public interface RequestTrackingService {

	public WSRequestData save(WSRequestData reqData);
	
	public List<WSRequestData> getReqData(Date date);
	
	public ProcessResponse process(List<String> names);
}
