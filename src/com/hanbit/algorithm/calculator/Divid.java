package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Divid {
	public static void main(String[] args) {
		System.out.print("Divid\n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번 째 숫자 입력\n");
		int a = scanner.nextInt();
		System.out.print("두번 째 숫자 입력\n");
		int b = scanner.nextInt();
		int c = a / b;
		System.out.print("결과:" + c);
	}
}
