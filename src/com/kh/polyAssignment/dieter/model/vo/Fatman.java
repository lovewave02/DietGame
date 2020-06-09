package com.kh.polyAssignment.dieter.model.vo;

public class Fatman extends Dieter {
	
	public Fatman(int weight, int bodyfat, int pay,String member) {
		super(weight, bodyfat, pay, member);
	}

	@Override
	public void mention() {
		System.out.println("과체중인 사람이 말합니다 _저 오늘부터 야채만 먹을거에요!");
	}
	
	public void eat() {
		System.out.println("과체중인 회원이 등장했습니다.");
		System.out.println("과체중인 사람이 말합니다_감자도 야채맞죠?");
	}
	
	public void exercise() {
		System.out.println("과체중인 사람이 고함을 지르며 운동을 해서 체중이 줄었습니다.");
		super.setWeight(getWeight() - ((int)(Math.random() * getWeight())));
		
		if (super.getWeight() < 30) {
			System.out.println("저체중으로 실려갑니다. 과한 다이어트는 독입니다. 연봉이 감소합니다");
			
		} else if ((super.getBodyfat()) - ((int)(Math.random() * getBodyfat())) <= 30) {
			System.out.println("해냈습니다 당신은 미친몸매를 얻었습니다. 인간으로써 당신을 존경합니다. 연봉이 증가합니다");
			
		} else {
			System.out.println("체중은 줄었습니다만, 모든것을 다 얻지는 못했습니다. 체지방률은 천천히 줄여나가요. 연봉이 증가합니다");
		}
		
	}
}
