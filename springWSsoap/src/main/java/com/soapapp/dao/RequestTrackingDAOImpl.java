package com.soapapp.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.soapapp.entity.WSRequestData;

@Transactional
@Repository
public class RequestTrackingDAOImpl implements RequestTrackingDAO{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	


	public boolean addRequest(WSRequestData reqData) {
		hibernateTemplate.save(reqData);
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<WSRequestData> getReqData(Date date) {
		Object[] params  = {date};
		List<WSRequestData> data = (List<WSRequestData>) hibernateTemplate.find("from WSRequestData where date = ?", params);
		return data;
	}

}
