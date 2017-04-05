package com.chinalife.sz.cc.domain;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 车辆保单数据查询接口请求信息
 * @author MarsCheng
 *
 */

public class CarPolicyResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -824595143515225357L;
	//请求类型
	private String requestType;
	//保单列表
	private CarPolicyQueryResponse[]  carPolicyQueryList;

	@Override
	public String toString() {
		return "CarPolicyResponse{" +
				"requestType='" + requestType + '\'' +
				", carPolicyQueryList=" + Arrays.toString(carPolicyQueryList) +
				'}';
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public CarPolicyQueryResponse[] getCarPolicyQueryList() {
		return carPolicyQueryList;
	}

	public void setCarPolicyQueryList(CarPolicyQueryResponse[] carPolicyQueryList) {
		this.carPolicyQueryList = carPolicyQueryList;
	}

//	public CarPolicyQueryResponse[] getCarPolicyQueryList() {
//		return carPolicyQueryList;
//	}
//
//	public void setCarPolicyQueryList(CarPolicyQueryResponse[] carPolicyQueryList) {
//		carPolicyQueryList = carPolicyQueryList;
//	}


}