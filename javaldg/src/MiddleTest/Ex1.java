package MiddleTest;

import java.util.Scanner;

public class Ex1 {
public static void main(String[] arges){

	//���ǹ� ��������
	double grade;	// ����
	int toeicscore;	// ���� ����
	
	
	// Scanner Ŭ���� ���
         Scanner scan = new Scanner(System.in);
	// ������ �Է� �޴´�
         System.out.print("������ �Է��ϼ���: ");
         grade = scan.nextDouble();
	// ���� ������ �Է� �޴´�
	System.out.print("TOEIC ������ �Է��ϼ���: ");
	toeicscore = scan.nextInt();
	
	//����
	if(toeicscore >=700){
		if(grade >=4.0){
			System.out.println("�����������");
		}else if(grade >=3.5){
			System.out.println("���������������");
		}else if(grade >=3.0){
			System.out.println("�ʱ����������");	
		}else if(grade >=3.0){
			System.out.println("�����Ҽ�����");
		}
	} else {
		System.out.println("�����Ҽ�����");
		
	}

}
}


