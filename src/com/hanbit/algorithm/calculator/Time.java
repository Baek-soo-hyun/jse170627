package com.hanbit.algorithm.calculator;

import java.util.Scanner;

/*
초를 시간과 분으로 바꾸어주는 프로그램입니다.
초를 입력해주세요.
60000
60000초 = 16시간 40분 0초
*/
public class Time {
	public static void main(String[] args) {
		System.out.print("초를 입력해주세요.");
		Scanner s = new Scanner(System.in);
		int second = s.nextInt();
		int minute = 0;
		int hour = 0;
		
		if(second%60>=3) {
			
		}
		else {
			if(second%3600==1) {
				
			}
		}
		System.out.println(String.format("%d시간 %d분 %d초",hour,minute,second));
	}
}
