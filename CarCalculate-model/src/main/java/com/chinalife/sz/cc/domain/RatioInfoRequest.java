package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 优惠明细
 */
public class RatioInfoRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7463204363399277017L;
	private String claimAdjustValue;
	private String actuarialAutonomyRatio;
	private String actuarialChannelRatio;
	private String underwriteAdjustRatio;
	private String underwriteAutonomyRatio;
	private String underwriteChannelRatio;
	private String defaultTotalRatio;
	private String artificialAutonomyRatio;
	private String artificialChannelRatio;
	private String finalRatio;
	private String artificialAdjustRatio;
	private String FinalRatioD;
	private String FinalRatioU;
	private String ratioId;
	private String artificialUnderwriteRatio;
	private String sendMotifyPremium;
	private String sendMotifyRatio;
	private String artificialUnderwritePremium;
	private String ActuarialPremium;
	private String DefaultPremium;
	private String ActuarialRatio;
	private String PeccancyAdjustValue;


	@Override
	public String toString() {
		return "RatioInfoRequest{" +
				"claimAdjustValue='" + claimAdjustValue + '\'' +
				", actuarialAutonomyRatio='" + actuarialAutonomyRatio + '\'' +
				", actuarialChannelRatio='" + actuarialChannelRatio + '\'' +
				", underwriteAdjustRatio='" + underwriteAdjustRatio + '\'' +
				", underwriteAutonomyRatio='" + underwriteAutonomyRatio + '\'' +
				", underwriteChannelRatio='" + underwriteChannelRatio + '\'' +
				", defaultTotalRatio='" + defaultTotalRatio + '\'' +
				", artificialAutonomyRatio='" + artificialAutonomyRatio + '\'' +
				", artificialChannelRatio='" + artificialChannelRatio + '\'' +
				", finalRatio='" + finalRatio + '\'' +
				", artificialAdjustRatio='" + artificialAdjustRatio + '\'' +
				", FinalRatioD='" + FinalRatioD + '\'' +
				", FinalRatioU='" + FinalRatioU + '\'' +
				", ratioId='" + ratioId + '\'' +
				", artificialUnderwriteRatio='" + artificialUnderwriteRatio + '\'' +
				", sendMotifyPremium='" + sendMotifyPremium + '\'' +
				", sendMotifyRatio='" + sendMotifyRatio + '\'' +
				", artificialUnderwritePremium='" + artificialUnderwritePremium + '\'' +
				", ActuarialPremium='" + ActuarialPremium + '\'' +
				", DefaultPremium='" + DefaultPremium + '\'' +
				", ActuarialRatio='" + ActuarialRatio + '\'' +
				", PeccancyAdjustValue='" + PeccancyAdjustValue + '\'' +
				'}';
	}

	public String getClaimAdjustValue() {
		return claimAdjustValue;
	}

	public void setClaimAdjustValue(String claimAdjustValue) {
		this.claimAdjustValue = claimAdjustValue;
	}

	public String getActuarialAutonomyRatio() {
		return actuarialAutonomyRatio;
	}

	public void setActuarialAutonomyRatio(String actuarialAutonomyRatio) {
		this.actuarialAutonomyRatio = actuarialAutonomyRatio;
	}

	public String getActuarialChannelRatio() {
		return actuarialChannelRatio;
	}

	public void setActuarialChannelRatio(String actuarialChannelRatio) {
		this.actuarialChannelRatio = actuarialChannelRatio;
	}

	public String getUnderwriteAdjustRatio() {
		return underwriteAdjustRatio;
	}

	public void setUnderwriteAdjustRatio(String underwriteAdjustRatio) {
		this.underwriteAdjustRatio = underwriteAdjustRatio;
	}

	public String getUnderwriteAutonomyRatio() {
		return underwriteAutonomyRatio;
	}

	public void setUnderwriteAutonomyRatio(String underwriteAutonomyRatio) {
		this.underwriteAutonomyRatio = underwriteAutonomyRatio;
	}

	public String getUnderwriteChannelRatio() {
		return underwriteChannelRatio;
	}

	public void setUnderwriteChannelRatio(String underwriteChannelRatio) {
		this.underwriteChannelRatio = underwriteChannelRatio;
	}

	public String getDefaultTotalRatio() {
		return defaultTotalRatio;
	}

	public void setDefaultTotalRatio(String defaultTotalRatio) {
		this.defaultTotalRatio = defaultTotalRatio;
	}

	public String getArtificialAutonomyRatio() {
		return artificialAutonomyRatio;
	}

	public void setArtificialAutonomyRatio(String artificialAutonomyRatio) {
		this.artificialAutonomyRatio = artificialAutonomyRatio;
	}

	public String getArtificialChannelRatio() {
		return artificialChannelRatio;
	}

	public void setArtificialChannelRatio(String artificialChannelRatio) {
		this.artificialChannelRatio = artificialChannelRatio;
	}

	public String getFinalRatio() {
		return finalRatio;
	}

	public void setFinalRatio(String finalRatio) {
		this.finalRatio = finalRatio;
	}

	public String getArtificialAdjustRatio() {
		return artificialAdjustRatio;
	}

	public void setArtificialAdjustRatio(String artificialAdjustRatio) {
		this.artificialAdjustRatio = artificialAdjustRatio;
	}

	public String getFinalRatioD() {
		return FinalRatioD;
	}

	public void setFinalRatioD(String finalRatioD) {
		FinalRatioD = finalRatioD;
	}

	public String getFinalRatioU() {
		return FinalRatioU;
	}

	public void setFinalRatioU(String finalRatioU) {
		FinalRatioU = finalRatioU;
	}

	public String getRatioId() {
		return ratioId;
	}

	public void setRatioId(String ratioId) {
		this.ratioId = ratioId;
	}

	public String getArtificialUnderwriteRatio() {
		return artificialUnderwriteRatio;
	}

	public void setArtificialUnderwriteRatio(String artificialUnderwriteRatio) {
		this.artificialUnderwriteRatio = artificialUnderwriteRatio;
	}

	public String getSendMotifyPremium() {
		return sendMotifyPremium;
	}

	public void setSendMotifyPremium(String sendMotifyPremium) {
		this.sendMotifyPremium = sendMotifyPremium;
	}

	public String getSendMotifyRatio() {
		return sendMotifyRatio;
	}

	public void setSendMotifyRatio(String sendMotifyRatio) {
		this.sendMotifyRatio = sendMotifyRatio;
	}

	public String getArtificialUnderwritePremium() {
		return artificialUnderwritePremium;
	}

	public void setArtificialUnderwritePremium(String artificialUnderwritePremium) {
		this.artificialUnderwritePremium = artificialUnderwritePremium;
	}

	public String getActuarialPremium() {
		return ActuarialPremium;
	}

	public void setActuarialPremium(String actuarialPremium) {
		ActuarialPremium = actuarialPremium;
	}

	public String getDefaultPremium() {
		return DefaultPremium;
	}

	public void setDefaultPremium(String defaultPremium) {
		DefaultPremium = defaultPremium;
	}

	public String getActuarialRatio() {
		return ActuarialRatio;
	}

	public void setActuarialRatio(String actuarialRatio) {
		ActuarialRatio = actuarialRatio;
	}

	public String getPeccancyAdjustValue() {
		return PeccancyAdjustValue;
	}

	public void setPeccancyAdjustValue(String peccancyAdjustValue) {
		PeccancyAdjustValue = peccancyAdjustValue;
	}
}
