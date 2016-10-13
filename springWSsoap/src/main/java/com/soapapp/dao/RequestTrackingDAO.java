package com.soapapp.dao;

import java.sql.Date;
import java.util.List;

import com.soapapp.entity.WSRequestData;

public interface RequestTrackingDAO {
	
	public boolean addRequest(WSRequestData reqData);
	public List<WSRequestData> getReqData(Date date);

}
