package com.kopo;

import java.util.Scanner;

public class middle_answer2_2 {

	public static void main(String[] args) {
		
		//��ü�ν��Ͻ�ȭ
		
		middle_answer2_1_class acct = new middle_answer2_1_class(); // �⺻�����ڷ� ��ü ����
		//setter�� ����
		acct.setBalance(10000);
		
		acct.setOwnername("�ڱ��̸�");
		acct.setAcountnumber(101);
		acct.deposit(3000);
		//������
		System.out.println(acct);
		
		//�����ڷ� ��ü ����
		middle_answer2_1_class acct1 = new middle_answer2_1_class("�ڱ��̸�", 102, 10000);
		acct1.deposit(5000);
		//������
		System.out.println(acct1);
		
		//�� �ڿ� �۾�
		acct.withdraw(4000);
		acct1.withdraw(5000);
		System.out.println(acct);
		System.out.println(acct1);
		
		middle_answer2_1_class acct2 = new middle_answer2_1_class();
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = scan.next();
		acct2.setOwnername(name);
		System.out.println("���¹�ȣ�Է��ϼ���");
		int number = scan.nextInt();
		acct2.setAcountnumber(number);
		System.out.println("�Ա� �ݾ� ");
		int money = scan.nextInt();
		acct2.deposit(money);
		
		System.out.println(acct2);
		

	}

}
