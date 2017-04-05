package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 *历史数据复用接口请求Javabean
 * @author MarsCheng
 *
 */

public class PolicyDataReuseRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1276217850963900430L;
	//请求类型
	private String requestType;
	//保单号
	private String policyNo;
	//操作员
	private String operator;
	//商业险保险起期
	private String startDate;
	//保险止期
	private String endDate;
	//交强险保险起期
	private String bzStartDate;
	//交强险保险止期
	private String bzEndDate;
	//是否关联
	private String relationFlag;
	//电销标识
	private String tmkFlag;
	//归属机构
	private String comCode;

	@Override
	public String toString() {
		return "PolicyDataReuseRequest{" +
				"requestType='" + requestType + '\'' +
				", policyNo='" + policyNo + '\'' +
				", operator='" + operator + '\'' +
				", startDate='" + startDate + '\'' +
				", endDate='" + endDate + '\'' +
				", bzStartDate='" + bzStartDate + '\'' +
				", bzEndDate='" + bzEndDate + '\'' +
				", relationFlag='" + relationFlag + '\'' +
				", tmkFlag='" + tmkFlag + '\'' +
				", comCode='" + comCode + '\'' +
				'}';
	}

	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getBzStartDate() {
		return bzStartDate;
	}
	public void setBzStartDate(String bzStartDate) {
		this.bzStartDate = bzStartDate;
	}
	public String getBzEndDate() {
		return bzEndDate;
	}
	public void setBzEndDate(String bzEndDate) {
		this.bzEndDate = bzEndDate;
	}
	public String getRelationFlag() {
		return relationFlag;
	}
	public void setRelationFlag(String relationFlag) {
		this.relationFlag = relationFlag;
	}
	public String getTmkFlag() {
		return tmkFlag;
	}
	public void setTmkFlag(String tmkFlag) {
		this.tmkFlag = tmkFlag;
	}
	public String getComCode() {
		return comCode;
	}
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	
	
}