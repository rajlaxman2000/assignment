package com.soapapp.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_soap_request")
public class WSRequestData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
		
	@Column(name = "request_str")
	private String requestString;
	
	@Column(name = "date")
	private Date date;
	
	public WSRequestData(){
		
	}

	public WSRequestData(int id, String requestString, Date date) {
		super();
		this.id = id;
		this.requestString = requestString;
		this.date = date;
	}
	
	public WSRequestData(String requestString, Date date) {
		this.requestString = requestString;
		this.date = date;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WSRequestData [id=" + id + ", requestString=" + requestString + ", date=" + date + "]";
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the requestString
	 */
	public String getRequestString() {
		return requestString;
	}

	/**
	 * @param requestString the requestString to set
	 */
	public void setRequestString(String requestString) {
		this.requestString = requestString;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}