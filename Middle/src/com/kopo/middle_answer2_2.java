package com.kopo;

import java.util.Scanner;

public class middle_answer2_2 {

	public static void main(String[] args) {
		
		//객체인스턴스화
		
		middle_answer2_1_class acct = new middle_answer2_1_class(); // 기본생성자로 객체 만듬
		//setter로 접근
		acct.setBalance(10000);
		
		acct.setOwnername("자기이름");
		acct.setAcountnumber(101);
		acct.deposit(3000);
		//결과출력
		System.out.println(acct);
		
		//생성자로 객체 생성
		middle_answer2_1_class acct1 = new middle_answer2_1_class("자기이름", 102, 10000);
		acct1.deposit(5000);
		//결과출력
		System.out.println(acct1);
		
		//그 박에 작업
		acct.withdraw(4000);
		acct1.withdraw(5000);
		System.out.println(acct);
		System.out.println(acct1);
		
		middle_answer2_1_class acct2 = new middle_answer2_1_class();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		acct2.setOwnername(name);
		System.out.println("계좌번호입력하세요");
		int number = scan.nextInt();
		acct2.setAcountnumber(number);
		System.out.println("입금 금액 ");
		int money = scan.nextInt();
		acct2.deposit(money);
		
		System.out.println(acct2);
		

	}

}
