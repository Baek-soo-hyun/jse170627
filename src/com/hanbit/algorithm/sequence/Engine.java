package com.hanbit.algorithm.sequence;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("0.종료 1.시작 2.BMI\n");
			String menu = scan.next();
			switch (menu) {
			case "0":
				System.out.println("시스템 종료!!");
				return;
			case "1":
				System.out.println("시스템 시작!!");
				break;
			case "2":
				System.out.println("BMI 시작!!");
				break;
			}
		}
	}
}
