package oop;

import java.util.ArrayList;

public class OOPtest {
/*
 * 다형성
 * 1. 부모타입의 참조변수가 자식객체를 참조할 수 있다.
 * 2. 실행되는 메서드는 참조하는 객체의 메서드를 호출(실행결과가 다를 수 있음)
 */
	public static void main(String[] args) {
		ArrayList<Member> list= new ArrayList<>();
		//Member를 상속하는 모든 타입을 다 담을 수 있다...! 
		Member member ;
		
		member = new Prof();
		member.setName("홍길동");

		list.add(member);
		System.out.println("===========================");
		
		member =  new Emp();
		member.setName("김유신");
		list.add(member);
		
		long a= 10;
		int b=(int) a;
		
		for(Member m : list) {
			m.print();
			m.sal();
			//참조하는 대상이 Emp 라면 
			if(m instanceof Emp) {
				((Emp)m).meth(); //다운 캐스팅(형변환)
			}
		}
		
	}

}
