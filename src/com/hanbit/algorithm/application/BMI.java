package com.hanbit.algorithm.application;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args){
	      Scanner s = new Scanner(System.in);
	      System.out.print("BMI=weight/(height*height)\n");
	      System.out.print("Enter your height. (m)\n");
	      double height=s.nextDouble();
	      System.out.print("Enter your weight. (kg)\n");
	      double weight=s.nextDouble();
	      double bmi=weight/(height*height);
	      System.out.print(String.format("나의 체질량지수(BMI): %f \n",bmi));
	      String result="";
	      if(bmi>=30.0){
	         result="비만";
	      }else if(bmi>=25.0){
	         result="과체중";
	      }else if(bmi>=18.5){
	         result="정상";
	      }else{
	         result="저체중";
	      }
	      System.out.print(String.format("나의 체중상태는 %s 입니다.",result));
	}
}
