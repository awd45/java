package com.kopo;

public class middle_answer2_1_class {
	private String ownername;
	private int acountnumber;
	private int balance;
	//필드가 private ==> setter 메서드로 접근
	//필드를 public ==> 객체명.필드=값;

	
	//생성자 ==> 기본 생성자, 매개변수 3개 source > generate using field 아무것도체크하지않고 빈것
	public middle_answer2_1_class() {
		super();
	}
	
	
	//매개변수가 있는 생성자 source > generate using field (all check)
	public middle_answer2_1_class(String ownername, int acountnumber, int balance) {
		super();
		this.ownername = ownername;
		this.acountnumber = acountnumber;
		this.balance = balance;
	}

	
	//getter / setter 메서드 source > generate getter and setter (all check)
	public String getOwnername() {
		return ownername;
	}


	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}


	public int getAcountnumber() {
		return acountnumber;
	}

	public void setAcountnumber(int acountnumber) {
		this.acountnumber = acountnumber;
	}

	public int getBalance() {
		return balance;
	}
	

	public void setBalance(int balance) {
		this.balance = balance;
	}	
	
	//추가 기능 메서드 this는 자기 객체에 있는 balance를 선택하겠다 안써도 상관x
	public void deposit(int amount){
		this.balance = this.balance + amount;
	}
	public void withdraw(int amount){
		this.balance = this.balance - amount;
	}
	
	//결과 출력 메서드
	public String toString(){
		String resultString="";
		resultString += "예금주이름" + getOwnername() +"\n";
		resultString += "계좌번호" + getAcountnumber() + "\n";
		resultString += "잔고" + getBalance() + "\n";
		return resultString;
	}
	
}
