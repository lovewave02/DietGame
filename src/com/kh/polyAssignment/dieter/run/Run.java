package com.kh.polyAssignment.dieter.run;

import java.util.Scanner;

import com.kh.polyAssignment.dieter.controller.TrainerManager;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		TrainerManager tm = new TrainerManager();
		
		System.out.print("Ʈ���̳� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		tm.strtPt(name);
		
	}

}
