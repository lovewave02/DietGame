package com.kh.polyAssignment.dieter.model.vo;

public class Dieter {

	private int weight;
	private int bodyfat;
	private int pay;
	private String member;
	
	public Dieter() {}
	
	public Dieter(int weight, int bodyfat, int pay, String member) {
		this.weight = weight;
		this.bodyfat = bodyfat;
		this.pay = pay;
		this.member = member;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getWeight() {
		return weight;
	}

	public int getBodyfat() {
		return bodyfat;
	}

	public String getMember() {
		return member;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setBodyfat(int bodyfat) {
		this.bodyfat = bodyfat;
	}

	public void setMember(String member) {
		this.member = member;
	}
	
	public void mention() {
		System.out.println("저 다이어트 할거에요 평~생");
	}
	
}
