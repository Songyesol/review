package util;

import java.util.ArrayList;

public class EmpList {	
	ArrayList<Emp> list;
	
	public EmpList() {
		list = new ArrayList<Emp>();	
	}
	
	//추가
	public void addEmp(Emp emp) {
		list.add(emp);
	}
	
	// 해당 사원의 이름 조회
	public String getName(int index) {
		String name="";
		name= list.get(index).name;
		return name;
	}
	//삭제
	public void delEmp(int index) {
		list.remove(index);
	}
	
	//전체이름 조회
	public void getNames() {
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).name);
//		}
		
		for(Emp emp : list) {
			System.out.println(emp.name);
		}
	}
	
	//전체이름 리턴 -과제
	public String getNameStr() {
		String names="";
		//for() 돌려서 names에 연결
		for(Emp emp : list) {
			names += emp.name;
		}
		return names;
	}
	
	//리스트 조회
	public ArrayList<Emp> getList(){
		return list;
	}
	
}

	
	