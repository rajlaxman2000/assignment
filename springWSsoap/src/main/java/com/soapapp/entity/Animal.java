package com.soapapp.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	@Column(name = "name")
	private String name;
	
	@Column(name = "orgin_country")
	private String originCountry;

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the originCountry
	 */
	public String getOriginCountry() {
		return originCountry;
	}

	/**
	 * @param originCountry the originCountry to set
	 */
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	
	
	
	

}