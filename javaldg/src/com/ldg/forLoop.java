package com.ldg;

public class forLoop {

	public static void main(String[] args) {

		
		int sum = 0;
		
		String yearwwek = "201614w";
		
		String test = yearwwek.substring(0, 4);
		
		System.out.println(test);	
		
	
		
		for (int i = 1; i <= 20; i++) {
			
			// 3의 배수를 찾는다
			if(i%3 == 0){
				System.out.println(i+ " 는 3의 배수입니다"+ sum + "플러스" + i + "작업을 진행합니다");
				sum = sum + i; 
			}else{
				System.out.println(i+"는 3의 배수가 아닙니다.");
			}
		}
		System.out.println("최종 3의 배수의 합 결과는 "+ sum +"입니다");
	}

}
