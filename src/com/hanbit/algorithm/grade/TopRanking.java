package com.hanbit.algorithm.grade;

import java.util.Scanner;

public class TopRanking {
	public static void main(String[] args) {
		int sum = 0, avg = 0, max = 0, min = 100; // 이것은 배열로 전환
		int[] arr = { sum, avg, max, min };
		Scanner s = new Scanner(System.in);

		System.out.println("1반의 총 학생 수는 명 명?");
		int amount = s.nextInt();
		int[] avgStudent = new int[amount];
		for (int i = 0; i < avgStudent.length; i++) {
			System.out.println("학생의 평균 점수를 입력하세요.(100점 만점)");
			avgStudent[i] = s.nextInt();
		}

		// 이번에는 length가 동적인 배열을 선언해야 합니다.
		// 그리고 그 수만큼 for loop이 돌고 점수를
		// 입력 받습니다.
		// 현재는 1등 점수와 꼴찌 점수를 구하는 로직만 구합니다.

		for (int i = 0; i < avgStudent.length; i++) {
			sum += avgStudent[i];
		}
		arr[0] = sum;
		arr[1] = sum / amount;

		for (int i = 0; i < avgStudent.length; i++) {
			if (avgStudent[i] > max) {
				max = avgStudent[i];
				arr[2] = max;
			}
		}
		for (int i = 0; i < avgStudent.length; i++) {
			if (avgStudent[i] < min) {
				min = avgStudent[i];
				arr[3] = min;
			}
		}

		System.out.println("1반의 평균 점수는 " + arr[1]);
		System.out.println("최대 점수는 " + arr[2]);
		System.out.println("최소 점수는 " + arr[3]);
	}
}
