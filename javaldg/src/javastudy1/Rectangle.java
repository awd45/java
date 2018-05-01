package javastudy1;

public class Rectangle {
	int width; //필드 ==> 생략하면 default
	int height;
	int getArea() {
		return width*height;
	}
	//기본생성자
	public Rectangle(){
		
	}

	public Rectangle(int w, int h){
		width=w;
		height=h;
	}
	
	
}
