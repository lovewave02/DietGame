package com.kh.polyAssignment.dieter.model.vo;

public class Skiniman extends Dieter {
	
	public Skiniman(int weight, int bodyfat, int pay, String member) {
		super(weight, bodyfat, pay, member);
	}

	@Override
	public void mention() {
		System.out.println("저체중인 회원이 등장했습니다.");
		System.out.println("저체중인 사람이 말합니다 _세상에 살찌는것만큼 쉬운게 있나요?");
	}
	
	public void eat() {
		System.out.println("저체중인 사람이 말합니다_배불러서 더는 못먹겠어요.");
	}
	
	public void exercise() {
		System.out.println("저체중인 사람이 고함을 지르며 폭풍식사와 운동을 병행해서 체중이 불어났습니다.");
		super.setWeight(getWeight() + ((int)(Math.random() * getWeight())));
		
		if (super.getWeight() > 100) {
			System.out.println("목표를 초과달성했습니다. 행복한 과체중이 되었습니다.늘어납니다.");
			
		} else if ((super.getBodyfat()) + ((int)(Math.random() * getBodyfat())) <= 30) {
			System.out.println("해냈습니다 당신은 미친몸매를 얻었습니다. 인간으로써 당신을 존경합니다. 연봉이 늘어납니다");
		} else {
			System.out.println("체중은 늘었습니다만, 모든것을 다 얻지는 못했습니다. 체지방률은 천천히 줄여나가요. 연봉은 늘어납니다");
		}
		
	}
}
