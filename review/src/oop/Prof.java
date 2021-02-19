package oop;

public class Prof extends Member  {
	//교수
	
	String dept;

	@Override //상속받은 메서드를 재정의
	public void sal() {
		System.out.println("교수급여");
	}

	@Override
	public void print() {
		super.print();
		System.out.println("교수");
	}
	
}
