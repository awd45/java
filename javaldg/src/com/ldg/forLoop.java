package com.ldg;

public class forLoop {

	public static void main(String[] args) {

		
		int sum = 0;
		
		String yearwwek = "201614w";
		
		String test = yearwwek.substring(0, 4);
		
		System.out.println(test);	
		
	
		
		for (int i = 1; i <= 20; i++) {
			
			// 3�� ����� ã�´�
			if(i%3 == 0){
				System.out.println(i+ " �� 3�� ����Դϴ�"+ sum + "�÷���" + i + "�۾��� �����մϴ�");
				sum = sum + i; 
			}else{
				System.out.println(i+"�� 3�� ����� �ƴմϴ�.");
			}
		}
		System.out.println("���� 3�� ����� �� ����� "+ sum +"�Դϴ�");
	}

}
