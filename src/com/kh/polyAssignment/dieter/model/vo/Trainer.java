package com.kh.polyAssignment.dieter.model.vo;

public class Trainer {

	private String name;
	private int pay = 2000000;
	
	public Trainer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return name + "님의 현재 연봉은 " + pay + "입니다.";
	}
	
}
