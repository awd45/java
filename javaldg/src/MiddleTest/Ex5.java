package MiddleTest;

public class Ex5 {

	public static void main(String[] args) {
		
		
		// setter �޼��带 ���ؼ� ��ü�� ����
		student1 std3 = new student1();
		std3.setName("�ڱ��̸�");
		std3.setAssignmentScore(99);
		std3.setExamScore(88);
		System.out.println(std3);
		
		//�����ڸ� ���ؼ� ��ü ����
		student1 std4 = new student1("ȫ�浿", 99, 33);
		System.out.println(std4);
				

	}

}
