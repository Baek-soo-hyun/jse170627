package com.hanbit.algorithm.member;

import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = s.next();
		System.out.println("주민등록번호를 입력하세요.");
		String ssn = s.next();
		int year = Integer.parseInt(ssn.substring(0, 2));
		char ch = ssn.charAt(7);
		String gender = "";

		/*
		 * if (gap>=0) { age = 2017 - (2000 + year) + 1; } else { age = 2017 -
		 * (1900 + year) + 1; }
		 */

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
			System.out.println("다시 입력해주세요.");
			break;
		}
		System.out.println("*********************");
		System.out.println("이름   나이   성별");
		System.out.println("---------------------");
		System.out.println(String.format("%s   %d세   %s", name,
				((17 - year) >= 0) ? 2017 - (2000 + year) + 1 : 2017 - (1900 + year) + 1, gender));
		System.out.println("*********************");

		// **************
		// 이름 나이 성별
		// --------------
		// 홍길동 20세 남
		// **************
	}
}
