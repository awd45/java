package MiddleTest;

public class student1 {
// 멤버변수들 ==> 멤버변수(=필드) + 생성자 + 매서드로 구성
	private String name;
	private int assignmentScore;
	private int examScore; //private은 외부에 접근 못함 private은 setter와 getter가 있어야한다.
	
	
	//생성자 => 매개변수가 없는 기본 생성자 1개, 매개변수 3개 source -> generate construct using fields에서 모든선택해제하고 생성 1개, 다시 모두체크하고 생성1개
	//선택모두해제한것
	public student1() {
		super();
	}
	//선택모두선택한것
	public student1(String name, int assignmentScore, int examScore) {
		super();
		this.name = name;
		this.assignmentScore = assignmentScore;
		this.examScore = examScore;
	}
	
	
	
	//setter/getter 우클릭후 source -> generate setter and getter 모두 선택하고 생성한다.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAssignmentScore() {
		return assignmentScore;
	}

	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}

	public int getExamScore() {
		return examScore;
	}

	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	
	
	
	//성적 메서드 처리
	public char getGrade(){
		char letterGrade=' ';
		double total;
		total = assignmentScore *0.4 + examScore*0.6;
		if(total >=90){
			letterGrade = 'A';
		}else if (total >=80){
			letterGrade = 'B';
		}else if (total >=70){
			letterGrade = 'C';
		}else if (total >=60){
			letterGrade = 'D';
		}else {
			letterGrade = 'F';
		}
		return letterGrade;
	}
	
	

	//결과물 출력하는 toString() 메서드
	public String toString(){
		String str="";
		str += "이름" +  name + "\n";
		str += "과제점수" + assignmentScore + "\n";
		str += "시험점수" + examScore + "\n";
		str += "학점" + getGrade() + "\n";
		return str;
	}
}
