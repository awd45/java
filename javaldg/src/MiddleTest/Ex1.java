package MiddleTest;

import java.util.Scanner;

public class Ex1 {
public static void main(String[] arges){

	//조건문 연습문제
	double grade;	// 평점
	int toeicscore;	// 토익 점수
	
	
	// Scanner 클래스 사용
         Scanner scan = new Scanner(System.in);
	// 평점을 입력 받는다
         System.out.print("평점을 입력하세요: ");
         grade = scan.nextDouble();
	// 토익 점수를 입력 받는다
	System.out.print("TOEIC 점수를 입력하세요: ");
	toeicscore = scan.nextInt();
	
	//조건
	if(toeicscore >=700){
		if(grade >=4.0){
			System.out.println("면접대상자임");
		}else if(grade >=3.5){
			System.out.println("서류전형대상자임");
		}else if(grade >=3.0){
			System.out.println("필기시험대상자임");	
		}else if(grade >=3.0){
			System.out.println("지원할수없음");
		}
	} else {
		System.out.println("지원할수없음");
		
	}

}
}


