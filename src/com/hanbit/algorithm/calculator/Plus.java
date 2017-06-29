package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		System.out.print("Plus\n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력\n");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자 입력\n");
		int b = scanner.nextInt();
		int c = a + b;
		System.out.print("결과:" + c);
	}
}
