package com.temp;

import com.temp.FieldDetails.DataType;

public class RMUDevice {

	@FieldDetails(sno=1,paramName="Temperature 1",noOfBytes=4,dataType=DataType.Hexadecimal,remarks="Devided by 100")
	private String temp1;
	
	@FieldDetails(sno=2,paramName="Temperature 2",noOfBytes=4,dataType=DataType.Hexadecimal,remarks="Devided by 100")
	private String temp2;
	
	@FieldDetails(sno=3,paramName="Reserver",noOfBytes=4,dataType=DataType.IEEE754Float)
	private String reserver;
	
	@FieldDetails(sno=4,paramName="RMU Status",noOfBytes=4,dataType=DataType.Hexadecimal)
	private String rmuStatus;
	
	@FieldDetails(sno=5,paramName="Field Person Phone No:1",noOfBytes=13,dataType=DataType.ASCII)
	private String fieldPersonPhone1;
	
	@FieldDetails(sno=6,paramName="Field Person Phone No:2",noOfBytes=13,dataType=DataType.ASCII)
	private String fieldPersonPhone2;
	
	@FieldDetails(sno=7,paramName="SMS Server Number",noOfBytes=13,dataType=DataType.ASCII)
	private String smsServerNumber;
	
	@FieldDetails(sno=8,paramName="Reserved",noOfBytes=4,dataType=DataType.Hexadecimal)
	private String reserved;
	
	@FieldDetails(sno=9,paramName="AC Reserved run hours",noOfBytes=4,dataType=DataType.Hexadecimal)
	private String acReservedRunHours;
	
	private String rawString;
	
	public RMUDevice(){
		
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RMUDevice [temp1=" + temp1 + ", temp2=" + temp2 + ", reserver=" + reserver + ", rmuStatus=" + rmuStatus
				+ ", fieldPersonPhone1=" + fieldPersonPhone1 + ", fieldPersonPhone2=" + fieldPersonPhone2
				+ ", smsServerNumber=" + smsServerNumber + ", reserved=" + reserved + ", acReservedRunHours="
				+ acReservedRunHours + ",\n rawString=" + rawString + "]";
	}



	/**
	 * @return the temp1
	 */
	public String getTemp1() {
		return temp1;
	}

	/**
	 * @param temp1 the temp1 to set
	 */
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}

	/**
	 * @return the temp2
	 */
	public String getTemp2() {
		return temp2;
	}

	/**
	 * @param temp2 the temp2 to set
	 */
	public void setTemp2(String temp2) {
		this.temp2 = temp2;
	}

	/**
	 * @return the reserver
	 */
	public String getReserver() {
		return reserver;
	}

	/**
	 * @param reserver the reserver to set
	 */
	public void setReserver(String reserver) {
		this.reserver = reserver;
	}

	/**
	 * @return the rmuStatus
	 */
	public String getRmuStatus() {
		return rmuStatus;
	}

	/**
	 * @param rmuStatus the rmuStatus to set
	 */
	public void setRmuStatus(String rmuStatus) {
		this.rmuStatus = rmuStatus;
	}

	/**
	 * @return the fieldPersonPhone1
	 */
	public String getFieldPersonPhone1() {
		return fieldPersonPhone1;
	}

	/**
	 * @param fieldPersonPhone1 the fieldPersonPhone1 to set
	 */
	public void setFieldPersonPhone1(String fieldPersonPhone1) {
		this.fieldPersonPhone1 = fieldPersonPhone1;
	}

	/**
	 * @return the fieldPersonPhone2
	 */
	public String getFieldPersonPhone2() {
		return fieldPersonPhone2;
	}

	/**
	 * @param fieldPersonPhone2 the fieldPersonPhone2 to set
	 */
	public void setFieldPersonPhone2(String fieldPersonPhone2) {
		this.fieldPersonPhone2 = fieldPersonPhone2;
	}

	/**
	 * @return the smsServerNumber
	 */
	public String getSmsServerNumber() {
		return smsServerNumber;
	}

	/**
	 * @param smsServerNumber the smsServerNumber to set
	 */
	public void setSmsServerNumber(String smsServerNumber) {
		this.smsServerNumber = smsServerNumber;
	}

	/**
	 * @return the reserved
	 */
	public String getReserved() {
		return reserved;
	}

	/**
	 * @param reserved the reserved to set
	 */
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	/**
	 * @return the acReservedRunHours
	 */
	public String getAcReservedRunHours() {
		return acReservedRunHours;
	}

	/**
	 * @param acReservedRunHours the acReservedRunHours to set
	 */
	public void setAcReservedRunHours(String acReservedRunHours) {
		this.acReservedRunHours = acReservedRunHours;
	}

	/**
	 * @return the rawString
	 */
	public String getRawString() {
		return rawString;
	}

	/**
	 * @param rawString the rawString to set
	 */
	public void setRawString(String rawString) {
		this.rawString = rawString;
	}
	
	
	
	
	
}
