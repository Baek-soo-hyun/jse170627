package com.hanbit.algorithm.grade;

import java.util.Scanner;

public class Ranking {
	public static void main(String[] args) {
		System.out.println("##### 성적 랭킹 #####");
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[3];
		String[] names = new String[3];
		int[] scoreRanking = new int[3];
		String[] nameRanking = new String[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("이름을 입력하세요.");
			names[i] = scan.next();
			System.out.println("점수를 입력하세요.");
			scores[i] = scan.nextInt();
		}
		/*
		 * 가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오. 예를 들어, a=4, b=7, c=1을 입력했다면...
		 * 7,4,1이 되겠습니다.
		 */

		if (scores[0] > scores[1] && scores[0] > scores[2]) {
			if (scores[1] > scores[2]) {
				scoreRanking[0] = 0;
				scoreRanking[1] = 1;
				scoreRanking[2] = 2;
			} else {
				scoreRanking[0] = 0;
				scoreRanking[1] = 2;
				scoreRanking[2] = 1;
			}
		}
		if (scores[1] > scores[0] && scores[1] > scores[2]) {
			if (scores[0] > scores[2]) {
				scoreRanking[0] = 1;
				scoreRanking[1] = 0;
				scoreRanking[2] = 2;
			} else {
				scoreRanking[0] = 1;
				scoreRanking[1] = 2;
				scoreRanking[2] = 0;
			}
		} else if (scores[2] > scores[0] && scores[2] > scores[1]) {
			if (scores[0] > scores[1]) {
				scoreRanking[0] = 2;
				scoreRanking[1] = 0;
				scoreRanking[2] = 1;
			} else {
				scoreRanking[0] = 2;
				scoreRanking[1] = 1;
				scoreRanking[2] = 0;
			}
		}
		System.out.println("1등: " + names[scoreRanking[0]] + ", 점수: " + scores[scoreRanking[0]]);
		System.out.println("2등: " + names[scoreRanking[1]] + ", 점수: " + scores[scoreRanking[1]]);
		System.out.println("3등: " + names[scoreRanking[2]] + ", 점수: " + scores[scoreRanking[2]]);
	}
}
