package util;


public class EmpListTest {

	public static void main(String[] args) {
		EmpList empList = new EmpList(); 
		empList.addEmp(new Emp(1,"홍길동","인사"));
		empList.addEmp(new Emp(2,"김기자","기획"));
		empList.addEmp(new Emp(3,"김유신","개발"));
		empList.addEmp(new Emp(3,"강감찬","회계"));
		
		//1번 사원의 이름은?
		System.out.println("1번 사원의 이름은? "+ empList.getName(0));
		
		//첫번째 사원 삭제
		empList.delEmp(0);
		
		//전체조회 
		System.out.println(empList.getList());
		
		//전체 이름조회
		System.out.println(empList.getNameStr());
		
		
		empList.getNames();
	}

}
