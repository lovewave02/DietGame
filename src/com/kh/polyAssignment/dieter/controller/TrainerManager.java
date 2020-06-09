package com.kh.polyAssignment.dieter.controller;

import com.kh.polyAssignment.dieter.model.vo.Dieter;
import com.kh.polyAssignment.dieter.model.vo.Fatman;
import com.kh.polyAssignment.dieter.model.vo.Skiniman;
import com.kh.polyAssignment.dieter.model.vo.Trainer;

public class TrainerManager {

	public void strtPt(String name) {
		
		Trainer t = new Trainer(name);
		
		System.out.println(t.getName() + "�Բ��� PT�� �����ϼ̽��ϴ�.");
		
		Dieter t1 = new Fatman(120, 60, 20000, "����");
		
		t1.mention();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		if(t1 instanceof Fatman) {
			((Fatman)t1).eat();
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		if(t1 instanceof Fatman) {
			((Fatman)t1).exercise();
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		if(t1 instanceof Fatman) {
			if (t1.getWeight() < 30) {
				System.out.println("������ Ʈ���̴��� ����� ������ �谨�Ǿ����ϴ�.");
				t.setPay(t1.getPay() - 100000);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { 
					e.printStackTrace();
				}
			} else {
				System.out.println("��� ��������� ���ٸ� ũ�� ������ �� �ֽ��ϴ�.");
				t.setPay(t1.getPay() + 50000);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { 
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(t);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		Dieter d1 = new Skiniman(45, 40, 20000, "������");
		
		d1.mention();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		if(d1 instanceof Skiniman) {
			((Skiniman)d1).eat();
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		if(d1 instanceof Skiniman) {
			((Skiniman)d1).exercise();
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		if(t1 instanceof Skiniman) {
			if (t1.getWeight() > 100) {
				System.out.println("�״� ��ü���� �Ѿ���� �⻵�մϴ�. ������ ���������ϴ�.");
				t.setPay(t1.getPay() + 100000);
			} else {
				System.out.println("��� ��������� ���ٸ� ũ�� ������ �� �ֽ��ϴ�.");
				t.setPay(t1.getPay() + 100000);
			}
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		System.out.println(t);
		
		
		
	}
	
}
