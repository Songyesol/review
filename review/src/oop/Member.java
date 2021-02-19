package oop;

public abstract class Member {

	//캡슐화(은닉화)
	private String name;
	String id;

	//getter : read
	//setter : write
	
	
	public Member() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	//추상메서드가 하나라도 있다면 추상클래스로 선언해야한다.
	public abstract void sal() ; 

	public void print() {
		System.out.println(name);
	}

}