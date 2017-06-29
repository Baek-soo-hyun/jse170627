package com.hanbit.algorithm.calculator;

import java.util.Scanner;

/*이름과 연봉을 입력받아서
연봉***만원을 받으시는 xxx님께서 납부할 세금은 ???만원입니다.
로 출력하는 프로그램을 만들어주세요.
현재 세율은 9.7프로 입니다. 
세율 taxRate=0.097   double rate=0.097; */
public class TaxCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = s.next();
		System.out.println("연봉을 입력해주세요. (만원)");
		int salary = s.nextInt();
		double taxRate = 0;

		if (salary <= 1200) {
			taxRate = 0.08;
		} else if (salary <= 4600) {
			taxRate = 0.17;
		}
		if (salary <= 8800) {
			taxRate = 0.26;
		}
		if (salary > 8800) {
			taxRate = 0.35;
		}

		System.out.println("************************************");
		System.out.println("이름 | 연봉 |   세율   | 납부할 세금");
		System.out.println(String.format("%s | %d 만원 |   %d   | %d 만원", name, salary, (int) (taxRate * 100),
				(int) (salary * taxRate)));
		System.out.println("------------------------------------");
		System.out.println("************************************");
	}
}
