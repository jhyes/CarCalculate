package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 特约
 */
public class EngageDataResponse  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6360977650451952117L;
	private String ClauseCode;
	private String ClauseName;
	private String Content;
	private String RiskCode;


	@Override
	public String toString() {
		return "EngageDataResponse{" +
				"ClauseCode='" + ClauseCode + '\'' +
				", ClauseName='" + ClauseName + '\'' +
				", Content='" + Content + '\'' +
				", RiskCode='" + RiskCode + '\'' +
				'}';
	}

	public String getClauseCode() {
		return ClauseCode;
	}

	public void setClauseCode(String clauseCode) {
		ClauseCode = clauseCode;
	}

	public String getClauseName() {
		return ClauseName;
	}

	public void setClauseName(String clauseName) {
		ClauseName = clauseName;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getRiskCode() {
		return RiskCode;
	}

	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}
}