package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 新增设备实际价值请求信息
 */
public class CardeviceRealPriceRequest  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 649203887018220818L;
	private String RequestType;
	private String PurchasePrice;
	private String EnrollDate;
	private String FirstDate;
	private String ComCode;
	private String StartDate;
	private String RelationFlag;
	private String TmkFlag;
	private String UseNatureCode;
	private String CarKindCode;
	private String SeatCount;
	private String VehicleTonnage;
	public String getRequestType() {
		return RequestType;
	}

	public void setRequestType(String requestType) {
		RequestType = requestType;
	}

	@Override
	public String toString() {
		return "CardeviceRealPriceRequest{" +
				"RequestType='" + RequestType + '\'' +
				", PurchasePrice='" + PurchasePrice + '\'' +
				", EnrollDate='" + EnrollDate + '\'' +
				", FirstDate='" + FirstDate + '\'' +
				", ComCode='" + ComCode + '\'' +
				", StartDate='" + StartDate + '\'' +
				", RelationFlag='" + RelationFlag + '\'' +
				", TmkFlag='" + TmkFlag + '\'' +
				", UseNatureCode='" + UseNatureCode + '\'' +
				", CarKindCode='" + CarKindCode + '\'' +
				", SeatCount=" + SeatCount +
				", VehicleTonnage='" + VehicleTonnage + '\'' +
				'}';
	}

	public String getPurchasePrice() {
		return PurchasePrice;
	}

	public void setPurchasePrice(String purchasePrice) {
		PurchasePrice = purchasePrice;
	}

	public String getEnrollDate() {
		return EnrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		EnrollDate = enrollDate;
	}

	public String getFirstDate() {
		return FirstDate;
	}

	public void setFirstDate(String firstDate) {
		FirstDate = firstDate;
	}

	public String getComCode() {
		return ComCode;
	}

	public void setComCode(String comCode) {
		ComCode = comCode;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getRelationFlag() {
		return RelationFlag;
	}

	public void setRelationFlag(String relationFlag) {
		RelationFlag = relationFlag;
	}

	public String getTmkFlag() {
		return TmkFlag;
	}

	public void setTmkFlag(String tmkFlag) {
		TmkFlag = tmkFlag;
	}

	public String getUseNatureCode() {
		return UseNatureCode;
	}

	public void setUseNatureCode(String useNatureCode) {
		UseNatureCode = useNatureCode;
	}

	public String getCarKindCode() {
		return CarKindCode;
	}

	public void setCarKindCode(String carKindCode) {
		CarKindCode = carKindCode;
	}

	public String getSeatCount() {
		return SeatCount;
	}

	public void setSeatCount(String seatCount) {
		SeatCount = seatCount;
	}

	public String getVehicleTonnage() {
		return VehicleTonnage;
	}

	public void setVehicleTonnage(String vehicleTonnage) {
		VehicleTonnage = vehicleTonnage;
	}



}