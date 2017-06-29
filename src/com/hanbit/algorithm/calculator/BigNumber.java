package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		int big;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("A값을 입력하세요.");
		int a = scan.nextInt();
		System.out.println("B값을 입력하세요.");
		int b = scan.nextInt();
		System.out.println("C값을 입력하세요.");
		int c = scan.nextInt();
		
		/*
		가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오.
		예를 들어, a=4, b=7, c=1를 입력했다면 "7,4,1"이 되겠습니다.
		*/
		
		
		if(a>=b) {
			if(b>=c) {
				System.out.println(String.format("%d,%d,%d",a,b,c));
			}
			else if(b<c) {
				if(b>c) {
				System.out.println(String.format("%d,%d,%d",a,c,b));
				}
				else if(a<c) {
				System.out.println(String.format("%d,%d,%d",c,a,b));	
				}	
			}
		}
		else if(a<b) {
			if(a>=c) {
				System.out.println(String.format("%d,%d,%d",b,a,c));
			}
			else if(a<c) {
				if(b>c) {
				System.out.println(String.format("%d,%d,%d",b,c,a));
				}
				else if(b<c) {
				System.out.println(String.format("%d,%d,%d",c,b,a));	
				}
				
			}
		}
	}
}
