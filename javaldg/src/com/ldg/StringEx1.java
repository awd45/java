package com.ldg;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		//문자열은 ==> 배열처럼 인덱스번호를 가지면서 저장이된다.
		String a ="Hello";
		String b =new String("java");
		
		System.out.println(a.length());
		System.out.println(a.substring(0, 2));
		System.out.println(a.charAt(3));
		String s[] = a.split(" , ");
		//문자열을 ,로 구분해서 배열에 저장
		for(int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
		
		//문자열 + 배열을 활용한 영문을 입력하면 한글로 변경
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복", "미래"};
		
		//사용자로 입력받아서 사용
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("영문단어입력>>");
			String s1=scanner.nextLine();
			if(s1.equals("exit")){
				break; //s1은 내가입력한문자 가 exit라면 중단
			}
			for(int i=0; i<eng.length; i++){
				//배열 길이만큼 반복
				if(eng[i].equals(s1)){
					//배열에 저장된 값과 내가 입력한 값
					System.out.println(kor[i]);
					break;
				}
			}

			char ch = ' ';
	System.out.println("문자를 하나 입력하세요>>");
	String input = scanner.nextLine();
	ch=input.charAt(0);
	
	if('a'<=ch && ch<='z'){
		ch=(char) (ch-32);
	}else if ('A'<=ch && ch <='Z'){
		ch=(char) (ch+32);
	}System.out.println(ch);
	 break;
		}
	
	char ch1=' ';
	System.out.println("문자를 입력하세요>>");
	String input = scanner.nextLine();
	ch1=input.charAt(0);
	
	 if('a'<=ch1 && ch1<='z'){
		 ch1=(char) (ch1-32);
		 
	 }else if ('A'<=ch1 && ch1 <='Z'){
		 ch1=(char) (ch1+32);
	 }
	System.out.println(ch1);
	System.out.println(input.toUpperCase());
	//toLowerCase() : 소문자로
		
	}
}


