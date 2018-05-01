package javastudy1;

//point 클래스
class Point{
	private int x, y;
	//기본생성자 생략 ==> 컴파일러에 의해 자동으로 설정
	
	public void set(int x, int y){//메서드 정의 
		this.x = x;
		this.y = y;
	}
	public void showPoint(){//메서드 정의
		System.out.println(x + "," + y);
	}
}

//상속받을 ColorPoint 클래스

class ColorPoint extends Point{//하위 extends 상위
	//하위클래스에서만 사용할 추가 기능 확장
	private String color;
	void setColor(String color){
		this.color = color;
	}
	void showColorPoint(){
		System.out.println(color);
		showPoint();//상위에 있는 메서드 호출
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
	//객체 생성
		Point p = new Point();
		p.set(1, 2); //set 호출
		p.showPoint(); //자기 클래스내에서꺼만 호출
		
		//객체 생성==>상속받은객체
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); //Point클래스(상위)에 있는 호출
		cp.setColor("red"); //ColorPoint에 있는것 호출
		cp.showColorPoint();

	}

}

