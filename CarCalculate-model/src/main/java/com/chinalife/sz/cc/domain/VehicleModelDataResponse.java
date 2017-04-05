package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 车型查询接口返回的车型信息
 */
public class VehicleModelDataResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8932071129755655383L;
	private String BrandName;
	private String RBCode;
	private String VehicleAlias;
	private String VehicleBrand1;
	private String VehicleStyleDesc;
	private String ImportFlag;
	private String MarketDate;
	private String SeatCount;
	private String VehicleWeight;
	private String VehicleTonnage;
	private String ExhaustCapacity;
	private String TransmissionType;
	private String ABSFlag;
	private String PurchasePrice;
	private String PurchasePriceLower;
	private String PurchasePriceUpper;
	private String PurchasePriceCalculate;
	private String AirBagNum;
	private String AlarmFlag;
	private String IsPriced;
	private String RiskFlag;
	private String VehicleClass;
	private String RefCode1;
	private String RefCode2;
	private String ActualValue;
	private String VINCode;
	private String StopFlag;
	private String CompanyCode;
	private String FamilyCode;
	private String PurchasePriceTax;
	private String KindredPrice;
	private String KindredPriceTax;
	private String EngineDesc;
	private String Batholith;
	private String Rate;
	private String SYXClassID;
	private String SYXClassName;
	private String JQXClassID;
	private String JQXClassName;
	private String RateVehRiskRepair;
	private String RateSpecializeRepair;
	private String ComplexSearch;
	private String RateException;
	private String RateVehRiskChange;
	private String PurchasePriceRate;
	private String ModelCode;
	private String ModelName;
	private String ModelDesc;
	private String StandarName;
	private String RiskDesc;
	private String FamilyName;
	private String WeightMax;
	private String FullWeightMin;
	private String SeatMin;
	private String SeatMax;
	private String Power;
	private String StrGtxq;
	private String Remark;
	private String SearchCode;
	private String SearchSequenceNo;
	private String FuleType;
	private String fuelCode;
	private String fuelName;
    private String platModelCode;
	private String platModelName;
    private String errorMessage;



	@Override
	public String toString() {
		return "VehicleModelDataResponse{" +
				"BrandName='" + BrandName + '\'' +
				", RBCode='" + RBCode + '\'' +
				", VehicleAlias='" + VehicleAlias + '\'' +
				", VehicleBrand1='" + VehicleBrand1 + '\'' +
				", VehicleStyleDesc='" + VehicleStyleDesc + '\'' +
				", ImportFlag='" + ImportFlag + '\'' +
				", MarketDate='" + MarketDate + '\'' +
				", SeatCount='" + SeatCount + '\'' +
				", VehicleWeight='" + VehicleWeight + '\'' +
				", VehicleTonnage='" + VehicleTonnage + '\'' +
				", ExhaustCapacity='" + ExhaustCapacity + '\'' +
				", TransmissionType='" + TransmissionType + '\'' +
				", ABSFlag='" + ABSFlag + '\'' +
				", PurchasePrice='" + PurchasePrice + '\'' +
				", PurchasePriceLower='" + PurchasePriceLower + '\'' +
				", PurchasePriceUpper='" + PurchasePriceUpper + '\'' +
				", PurchasePriceCalculate='" + PurchasePriceCalculate + '\'' +
				", AirBagNum='" + AirBagNum + '\'' +
				", AlarmFlag='" + AlarmFlag + '\'' +
				", IsPriced='" + IsPriced + '\'' +
				", RiskFlag='" + RiskFlag + '\'' +
				", VehicleClass='" + VehicleClass + '\'' +
				", RefCode1='" + RefCode1 + '\'' +
				", RefCode2='" + RefCode2 + '\'' +
				", ActualValue='" + ActualValue + '\'' +
				", VINCode='" + VINCode + '\'' +
				", StopFlag='" + StopFlag + '\'' +
				", CompanyCode='" + CompanyCode + '\'' +
				", FamilyCode='" + FamilyCode + '\'' +
				", PurchasePriceTax='" + PurchasePriceTax + '\'' +
				", KindredPrice='" + KindredPrice + '\'' +
				", KindredPriceTax='" + KindredPriceTax + '\'' +
				", EngineDesc='" + EngineDesc + '\'' +
				", Batholith='" + Batholith + '\'' +
				", Rate='" + Rate + '\'' +
				", SYXClassID='" + SYXClassID + '\'' +
				", SYXClassName='" + SYXClassName + '\'' +
				", JQXClassID='" + JQXClassID + '\'' +
				", JQXClassName='" + JQXClassName + '\'' +
				", RateVehRiskRepair='" + RateVehRiskRepair + '\'' +
				", RateSpecializeRepair='" + RateSpecializeRepair + '\'' +
				", ComplexSearch='" + ComplexSearch + '\'' +
				", RateException='" + RateException + '\'' +
				", RateVehRiskChange='" + RateVehRiskChange + '\'' +
				", PurchasePriceRate='" + PurchasePriceRate + '\'' +
				", ModelCode='" + ModelCode + '\'' +
				", ModelName='" + ModelName + '\'' +
				", ModelDesc='" + ModelDesc + '\'' +
				", StandarName='" + StandarName + '\'' +
				", RiskDesc='" + RiskDesc + '\'' +
				", FamilyName='" + FamilyName + '\'' +
				", WeightMax='" + WeightMax + '\'' +
				", FullWeightMin='" + FullWeightMin + '\'' +
				", SeatMin='" + SeatMin + '\'' +
				", SeatMax='" + SeatMax + '\'' +
				", Power='" + Power + '\'' +
				", StrGtxq='" + StrGtxq + '\'' +
				", Remark='" + Remark + '\'' +
				", SearchCode='" + SearchCode + '\'' +
				", SearchSequenceNo='" + SearchSequenceNo + '\'' +
				", FuleType='" + FuleType + '\'' +
				", fuelCode='" + fuelCode + '\'' +
				", fuelName='" + fuelName + '\'' +
				", platModelCode='" + platModelCode + '\'' +
				", platModelName='" + platModelName + '\'' +
				'}';
	}
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getPlatModelName() {
		return platModelName;
	}

	public void setPlatModelName(String platModelName) {
		this.platModelName = platModelName;
	}

	public String getPlatModelCode() {
		return platModelCode;
	}

	public void setPlatModelCode(String platModelCode) {
		this.platModelCode = platModelCode;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public String getRBCode() {
		return RBCode;
	}

	public void setRBCode(String RBCode) {
		this.RBCode = RBCode;
	}

	public String getVehicleAlias() {
		return VehicleAlias;
	}

	public void setVehicleAlias(String vehicleAlias) {
		VehicleAlias = vehicleAlias;
	}

	public String getVehicleBrand1() {
		return VehicleBrand1;
	}

	public void setVehicleBrand1(String vehicleBrand1) {
		VehicleBrand1 = vehicleBrand1;
	}

	public String getVehicleStyleDesc() {
		return VehicleStyleDesc;
	}

	public void setVehicleStyleDesc(String vehicleStyleDesc) {
		VehicleStyleDesc = vehicleStyleDesc;
	}

	public String getImportFlag() {
		return ImportFlag;
	}

	public void setImportFlag(String importFlag) {
		ImportFlag = importFlag;
	}

	public String getMarketDate() {
		return MarketDate;
	}

	public void setMarketDate(String marketDate) {
		MarketDate = marketDate;
	}

	public String getSeatCount() {
		return SeatCount;
	}

	public void setSeatCount(String seatCount) {
		SeatCount = seatCount;
	}

	public String getVehicleWeight() {
		return VehicleWeight;
	}

	public void setVehicleWeight(String vehicleWeight) {
		VehicleWeight = vehicleWeight;
	}

	public String getVehicleTonnage() {
		return VehicleTonnage;
	}

	public void setVehicleTonnage(String vehicleTonnage) {
		VehicleTonnage = vehicleTonnage;
	}

	public String getExhaustCapacity() {
		return ExhaustCapacity;
	}

	public void setExhaustCapacity(String exhaustCapacity) {
		ExhaustCapacity = exhaustCapacity;
	}

	public String getTransmissionType() {
		return TransmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		TransmissionType = transmissionType;
	}

	public String getABSFlag() {
		return ABSFlag;
	}

	public void setABSFlag(String ABSFlag) {
		this.ABSFlag = ABSFlag;
	}

	public String getPurchasePrice() {
		return PurchasePrice;
	}

	public void setPurchasePrice(String purchasePrice) {
		PurchasePrice = purchasePrice;
	}

	public String getPurchasePriceLower() {
		return PurchasePriceLower;
	}

	public void setPurchasePriceLower(String purchasePriceLower) {
		PurchasePriceLower = purchasePriceLower;
	}

	public String getPurchasePriceUpper() {
		return PurchasePriceUpper;
	}

	public void setPurchasePriceUpper(String purchasePriceUpper) {
		PurchasePriceUpper = purchasePriceUpper;
	}

	public String getPurchasePriceCalculate() {
		return PurchasePriceCalculate;
	}

	public void setPurchasePriceCalculate(String purchasePriceCalculate) {
		PurchasePriceCalculate = purchasePriceCalculate;
	}

	public String getAirBagNum() {
		return AirBagNum;
	}

	public void setAirBagNum(String airBagNum) {
		AirBagNum = airBagNum;
	}

	public String getAlarmFlag() {
		return AlarmFlag;
	}

	public void setAlarmFlag(String alarmFlag) {
		AlarmFlag = alarmFlag;
	}

	public String getIsPriced() {
		return IsPriced;
	}

	public void setIsPriced(String isPriced) {
		IsPriced = isPriced;
	}

	public String getRiskFlag() {
		return RiskFlag;
	}

	public void setRiskFlag(String riskFlag) {
		RiskFlag = riskFlag;
	}

	public String getVehicleClass() {
		return VehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		VehicleClass = vehicleClass;
	}

	public String getRefCode1() {
		return RefCode1;
	}

	public void setRefCode1(String refCode1) {
		RefCode1 = refCode1;
	}

	public String getRefCode2() {
		return RefCode2;
	}

	public void setRefCode2(String refCode2) {
		RefCode2 = refCode2;
	}

	public String getActualValue() {
		return ActualValue;
	}

	public void setActualValue(String actualValue) {
		ActualValue = actualValue;
	}

	public String getVINCode() {
		return VINCode;
	}

	public void setVINCode(String VINCode) {
		this.VINCode = VINCode;
	}

	public String getStopFlag() {
		return StopFlag;
	}

	public void setStopFlag(String stopFlag) {
		StopFlag = stopFlag;
	}

	public String getCompanyCode() {
		return CompanyCode;
	}

	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
	}

	public String getFamilyCode() {
		return FamilyCode;
	}

	public void setFamilyCode(String familyCode) {
		FamilyCode = familyCode;
	}

	public String getPurchasePriceTax() {
		return PurchasePriceTax;
	}

	public void setPurchasePriceTax(String purchasePriceTax) {
		PurchasePriceTax = purchasePriceTax;
	}

	public String getKindredPrice() {
		return KindredPrice;
	}

	public void setKindredPrice(String kindredPrice) {
		KindredPrice = kindredPrice;
	}

	public String getKindredPriceTax() {
		return KindredPriceTax;
	}

	public void setKindredPriceTax(String kindredPriceTax) {
		KindredPriceTax = kindredPriceTax;
	}

	public String getEngineDesc() {
		return EngineDesc;
	}

	public void setEngineDesc(String engineDesc) {
		EngineDesc = engineDesc;
	}

	public String getBatholith() {
		return Batholith;
	}

	public void setBatholith(String batholith) {
		Batholith = batholith;
	}

	public String getRate() {
		return Rate;
	}

	public void setRate(String rate) {
		Rate = rate;
	}

	public String getSYXClassID() {
		return SYXClassID;
	}

	public void setSYXClassID(String SYXClassID) {
		this.SYXClassID = SYXClassID;
	}

	public String getSYXClassName() {
		return SYXClassName;
	}

	public void setSYXClassName(String SYXClassName) {
		this.SYXClassName = SYXClassName;
	}

	public String getJQXClassID() {
		return JQXClassID;
	}

	public void setJQXClassID(String JQXClassID) {
		this.JQXClassID = JQXClassID;
	}

	public String getJQXClassName() {
		return JQXClassName;
	}

	public void setJQXClassName(String JQXClassName) {
		this.JQXClassName = JQXClassName;
	}

	public String getRateVehRiskRepair() {
		return RateVehRiskRepair;
	}

	public void setRateVehRiskRepair(String rateVehRiskRepair) {
		RateVehRiskRepair = rateVehRiskRepair;
	}

	public String getRateSpecializeRepair() {
		return RateSpecializeRepair;
	}

	public void setRateSpecializeRepair(String rateSpecializeRepair) {
		RateSpecializeRepair = rateSpecializeRepair;
	}

	public String getComplexSearch() {
		return ComplexSearch;
	}

	public void setComplexSearch(String complexSearch) {
		ComplexSearch = complexSearch;
	}

	public String getRateException() {
		return RateException;
	}

	public void setRateException(String rateException) {
		RateException = rateException;
	}

	public String getRateVehRiskChange() {
		return RateVehRiskChange;
	}

	public void setRateVehRiskChange(String rateVehRiskChange) {
		RateVehRiskChange = rateVehRiskChange;
	}

	public String getPurchasePriceRate() {
		return PurchasePriceRate;
	}

	public void setPurchasePriceRate(String purchasePriceRate) {
		PurchasePriceRate = purchasePriceRate;
	}

	public String getModelCode() {
		return ModelCode;
	}

	public void setModelCode(String modelCode) {
		ModelCode = modelCode;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public String getModelDesc() {
		return ModelDesc;
	}

	public void setModelDesc(String modelDesc) {
		ModelDesc = modelDesc;
	}

	public String getStandarName() {
		return StandarName;
	}

	public void setStandarName(String standarName) {
		StandarName = standarName;
	}

	public String getRiskDesc() {
		return RiskDesc;
	}

	public void setRiskDesc(String riskDesc) {
		RiskDesc = riskDesc;
	}

	public String getFamilyName() {
		return FamilyName;
	}

	public void setFamilyName(String familyName) {
		FamilyName = familyName;
	}

	public String getWeightMax() {
		return WeightMax;
	}

	public void setWeightMax(String weightMax) {
		WeightMax = weightMax;
	}

	public String getFullWeightMin() {
		return FullWeightMin;
	}

	public void setFullWeightMin(String fullWeightMin) {
		FullWeightMin = fullWeightMin;
	}

	public String getSeatMin() {
		return SeatMin;
	}

	public void setSeatMin(String seatMin) {
		SeatMin = seatMin;
	}

	public String getSeatMax() {
		return SeatMax;
	}

	public void setSeatMax(String seatMax) {
		SeatMax = seatMax;
	}

	public String getPower() {
		return Power;
	}

	public void setPower(String power) {
		Power = power;
	}

	public String getStrGtxq() {
		return StrGtxq;
	}

	public void setStrGtxq(String strGtxq) {
		StrGtxq = strGtxq;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getSearchCode() {
		return SearchCode;
	}

	public void setSearchCode(String searchCode) {
		SearchCode = searchCode;
	}

	public String getSearchSequenceNo() {
		return SearchSequenceNo;
	}

	public void setSearchSequenceNo(String searchSequenceNo) {
		SearchSequenceNo = searchSequenceNo;
	}

	public String getFuleType() {
		return FuleType;
	}

	public void setFuleType(String fuleType) {
		FuleType = fuleType;
	}

	public String getFuelCode() {
		return fuelCode;
	}

	public void setFuelCode(String fuelCode) {
		this.fuelCode = fuelCode;
	}

	public String getFuelName() {
		return fuelName;
	}

	public void setFuelName(String fuelName) {
		this.fuelName = fuelName;
	}


}