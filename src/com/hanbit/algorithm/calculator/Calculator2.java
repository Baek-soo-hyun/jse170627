package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num1\n");
		int num1 = s.nextInt();
		System.out.print("Enter opcode\n");
		String opcode = s.next();
		System.out.print("Enter num2\n");
		int num2 = s.nextInt();
		int result = 0;
		if (opcode.equals("+")) {
			result = num1 + num2;
		} else if (opcode.equals("-")) {
			result = num1 - num2;
		} else if (opcode.equals("*")) {
			result = num1 * num2;
		} else {
			result = num1 / num2;
		}
		System.out.print(String.format("%d %s %d = %d", num1, opcode, num2, result));
	}
}
