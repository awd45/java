package MiddleTest;

public class Ex6 {

	public static void main(String[] args) {
		//����Ŭ���� ���� ==> ����Ŭ���� ���뵵 ���� ��� ����
		
		UnderStudent1 std5= new UnderStudent1();
		std5.setName("�ڱ��̸�");
		std5.setClubName("���α׷���");
		System.out.println(std5);
		
		
		//����Ŭ���� ==>�����ڷ� ���ؼ� 0
		UnderStudent1 std6 = new UnderStudent1("ȫ�浿", 10, 40, "����");
		System.out.println(std6);

	}

}
