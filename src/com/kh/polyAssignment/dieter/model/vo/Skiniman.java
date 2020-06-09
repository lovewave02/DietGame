package com.kh.polyAssignment.dieter.model.vo;

public class Skiniman extends Dieter {
	
	public Skiniman(int weight, int bodyfat, int pay, String member) {
		super(weight, bodyfat, pay, member);
	}

	@Override
	public void mention() {
		System.out.println("��ü���� ȸ���� �����߽��ϴ�.");
		System.out.println("��ü���� ����� ���մϴ� _���� ����°͸�ŭ ����� �ֳ���?");
	}
	
	public void eat() {
		System.out.println("��ü���� ����� ���մϴ�_��ҷ��� ���� ���԰ھ��.");
	}
	
	public void exercise() {
		System.out.println("��ü���� ����� ������ ������ ��ǳ�Ļ�� ��� �����ؼ� ü���� �Ҿ���ϴ�.");
		super.setWeight(getWeight() + ((int)(Math.random() * getWeight())));
		
		if (super.getWeight() > 100) {
			System.out.println("��ǥ�� �ʰ��޼��߽��ϴ�. �ູ�� ��ü���� �Ǿ����ϴ�.�þ�ϴ�.");
			
		} else if ((super.getBodyfat()) + ((int)(Math.random() * getBodyfat())) <= 30) {
			System.out.println("�س½��ϴ� ����� ��ģ���Ÿ� ������ϴ�. �ΰ����ν� ����� �����մϴ�. ������ �þ�ϴ�");
		} else {
			System.out.println("ü���� �þ����ϴٸ�, ������ �� ������ ���߽��ϴ�. ü������� õõ�� �ٿ�������. ������ �þ�ϴ�");
		}
		
	}
}
