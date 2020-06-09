package com.kh.polyAssignment.dieter.controller;

import com.kh.polyAssignment.dieter.model.vo.Dieter;
import com.kh.polyAssignment.dieter.model.vo.Fatman;
import com.kh.polyAssignment.dieter.model.vo.Skiniman;
import com.kh.polyAssignment.dieter.model.vo.Trainer;

public class TrainerManager {

	public void strtPt(String name) {
		
		Trainer t = new Trainer(name);
		
		System.out.println(t.getName() + "님께서 PT를 시작하셨습니다.");
		
		Dieter t1 = new Fatman(120, 60, 20000, "고도비만");
		
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
				System.out.println("무리한 트레이닝의 결과로 연봉이 삭감되었습니다.");
				t.setPay(t1.getPay() - 100000);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { 
					e.printStackTrace();
				}
			} else {
				System.out.println("계속 좋은결과를 낸다면 크게 성공할 수 있습니다.");
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
		
		Dieter d1 = new Skiniman(45, 40, 20000, "마른비만");
		
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
				System.out.println("그는 과체중을 넘어섰지만 기뻐합니다. 연봉은 문제없습니다.");
				t.setPay(t1.getPay() + 100000);
			} else {
				System.out.println("계속 좋은결과를 낸다면 크게 성공할 수 있습니다.");
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
