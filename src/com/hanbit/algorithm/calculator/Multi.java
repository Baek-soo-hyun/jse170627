package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Multi {
	public static void main(String[] args) {
		System.out.print("Multi\n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자\n");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자\n");
		int b = scanner.nextInt();
		int c = a * b;
		System.out.print("결과:" + c);
	}
}
