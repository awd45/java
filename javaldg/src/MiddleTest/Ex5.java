package MiddleTest;

public class Ex5 {

	public static void main(String[] args) {
		
		
		// setter 메서드를 통해서 객체에 접근
		student1 std3 = new student1();
		std3.setName("자기이름");
		std3.setAssignmentScore(99);
		std3.setExamScore(88);
		System.out.println(std3);
		
		//생성자를 통해서 객체 접근
		student1 std4 = new student1("홍길동", 99, 33);
		System.out.println(std4);
				

	}

}
