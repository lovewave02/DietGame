package com.kh.polyAssignment.dieter.model.vo;

public class Fatman extends Dieter {
	
	public Fatman(int weight, int bodyfat, int pay,String member) {
		super(weight, bodyfat, pay, member);
	}

	@Override
	public void mention() {
		System.out.println("��ü���� ����� ���մϴ� _�� ���ú��� ��ä�� �����ſ���!");
	}
	
	public void eat() {
		System.out.println("��ü���� ȸ���� �����߽��ϴ�.");
		System.out.println("��ü���� ����� ���մϴ�_���ڵ� ��ä����?");
	}
	
	public void exercise() {
		System.out.println("��ü���� ����� ������ ������ ��� �ؼ� ü���� �پ����ϴ�.");
		super.setWeight(getWeight() - ((int)(Math.random() * getWeight())));
		
		if (super.getWeight() < 30) {
			System.out.println("��ü������ �Ƿ����ϴ�. ���� ���̾�Ʈ�� ���Դϴ�. ������ �����մϴ�");
			
		} else if ((super.getBodyfat()) - ((int)(Math.random() * getBodyfat())) <= 30) {
			System.out.println("�س½��ϴ� ����� ��ģ���Ÿ� ������ϴ�. �ΰ����ν� ����� �����մϴ�. ������ �����մϴ�");
			
		} else {
			System.out.println("ü���� �پ����ϴٸ�, ������ �� ������ ���߽��ϴ�. ü������� õõ�� �ٿ�������. ������ �����մϴ�");
		}
		
	}
}
