package com.hanbit.algorithm.member;

import java.util.Scanner;

public class Login {

	public static final String USER_ID = "kim";
	public static final String USER_PW = "kim";

	public static void main(String[] agrs){
		System.out.print("로그인입니다.\n");
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("아이디를 입력해주세요");
			String id=s.next();
			if(id.equals(USER_ID)){
			break;
			}
			else {
			System.out.print("존재하지 않는 아이디입니다.\n");
			}
		}
		while(true){
			System.out.print("비밀번호를 입력해주세요\n");
			String pw=s.next();
			if(pw.equals(USER_ID)){
			break;	
			}
			else{
			System.out.print("비밀번호가 일치하지 않습니다.\n");
			}
		}
		System.out.print("로그인 성공\n");	
	}
}
	
