package com.hanbit.algorithm.member;

import java.util.Scanner;

public class SSN2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "", ssn = "", sYear = "", gender = "";
		int year = 0, age = 0, gap = 0;

		System.out.println("이름을 입력하세요.");
		name = s.next();
		System.out.println("주민등록번호를 입력하세요.");
		ssn = s.next();
		year = Integer.parseInt(ssn.substring(0, 2));
		char ch = ssn.charAt(7);
		if (17 - year >= 0) {
			age = 2017 - (year + 2000);
		} else {
			age = 2017 - (year + 1900);
		}
		switch (ch) {
		case '1':
		case '3':
			gender = "남";
			break;
		case '2':
		case '4':
			gender = "여";
			break;
		case '5':
		case '6':
			gender = "외국인";
			break;
		default:
			gender = "주민등록번호를 다시 입력하세요.";
		}
		System.out.print("***********************\n");
		System.out.print(String.format("  이름      나이     성별  \n"));
		System.out.print("-----------------------\n");
		System.out.print(String.format(" %s    %d세     %s\n", name, age, gender));
		System.out.print("************************\n");
	}
}
