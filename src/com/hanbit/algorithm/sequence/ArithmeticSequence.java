package com.hanbit.algorithm.sequence;

import java.util.Scanner;

public class ArithmeticSequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// System.out.println("단수를 입력해주세요.");
		// int j = s.nextInt();

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				int result = j * i;
				System.out.print(String.format("%d*%d=%d \t", j, i, result));
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				int result = j * i;
				System.out.print(String.format("%d*%d=%d \t", j, i, result));
			}
			System.out.println();
		}

	}
}
