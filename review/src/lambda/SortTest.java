package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import util.Emp;

public class SortTest {
	public static void main(String[] args) {
		ArrayList<Emp> empList = new ArrayList<Emp>(); 
		empList.add(new Emp(1,"홍길동","인사"));
		empList.add(new Emp(2,"김기자","기획"));
		empList.add(new Emp(3,"김유신","개발"));
		empList.add(new Emp(3,"강감찬","회계"));
		
		//클래스 선언해서 처리하기 ver.
		// Collections.sort(empList, new EmpCompare());
		
		//무명클래스로 처리하기 ver.
//		Collections.sort(empList, new Comparator<Emp>() {
//			public int compare(Emp o1, Emp o2) {
//				return o1.getName().compareTo(o2.getName());
//			}});
		
		//람다식으로 처리하기
		Collections.sort(empList, (Emp o1, Emp o2) -> 
				o1.getName().compareTo(o2.getName())
		);
		
		 System.out.println(empList);
	}
}

/*
class EmpCompare implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		//return o1.getName().compareTo(o2.getName());
		return o1.getDept().compareTo(o2.getDept());
	}

	
}*/