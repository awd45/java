package MiddleTest;

public class Ex4 {

	public static void main(String[] args) {
		//Ŭ���� ����
		student std1 = new student();
		
		//Ŭ������ ��� ������ ���� ==> ��ü��, �������, ��ü��.�޼���()
		std1.name="����";
		std1.assignmentScore=91;
		std1.examScore=88;
		System.out.println(std1);
		
		student std2 = new student();
		std2.name="�ڱ��̸�";
		std2.assignmentScore=88;
		std2.examScore=66;
		System.out.println(std2.toString());

	}

}
