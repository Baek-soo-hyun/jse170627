package com.hanbit.algorithm.grade;

import java.util.Scanner;

public class GradeReport2 {
	public static void main(String[] args) {
		// name, kor, eng, math
		// total, avg,
		// 홍길동 : B

		// definition (선언)
		Scanner s = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0;
		String grade = "", result = "";

		// input (입력)
		System.out.print("Enter Name\n");
		String name = s.next();
		System.out.print("Enter Korean\n");
		kor = s.nextInt();
		System.out.print("Enter English\n");
		eng = s.nextInt();
		System.out.print("Enter Math\n");
		math = s.nextInt();

		// operation(연산)
		total = kor + eng + math;
		avg = total / 3;

		/*
		 * if(avg>=90) { grade = "A"; } else if(avg>=80) { grade = "B"; } else
		 * if(avg>=70) { grade = "C"; } else if(avg>=60) { grade = "D"; } else
		 * if(avg>=50) { grade = "E"; } else { grade = "F"; }
		 */

		switch (avg / 10) {
		case 10:
		case 9:
			result = "장학금 대상입니다.";
			break;
		case 8:
			result = "3학점 이수";
			break;
		case 7:
			result = "2학점 이수";
			break;
		case 6:
			result = "2학점 이수";
			break;
		case 5:
			result = "재수강";
			break;
		default:
			result = "학사 경고";
			break;
		}

		// output (출력)

		System.out.print("********************************\n");
		System.out.print("이름       총점   평균   등급   \n");
		System.out.print("--------------------------------\n");
		System.out.print(String.format("| %s | %d |  %d  |  %s  |\n", name, total, avg, result));
		System.out.print("********************************\n");
	}
}
