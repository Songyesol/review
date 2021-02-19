package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapUtil {
	HashMap<Integer, Emp> map;
	
	public MapUtil() {
		map = new HashMap<>();
	}
	
	//수정(index기준으로 없으면 추가 있으면 수정)
	public void addEmp(Emp emp) {
		map.put(emp.id, emp);
	}
	
	//추가
	public void updEmp(Emp emp) {
		map.put(emp.id, emp);
	}
	//삭제
	public void delEmp(Integer id) {
		map.remove(id);
	}
	
	//사번으로 이름 조회
	public String getName(Integer id) {
		String result="";
		result = map.get(id).name;
		return result;
	}
	
	//전체조회 
	public HashMap<Integer,Emp> getEmpMap(){
		return map;
	}	
	
	//전체 이름 조회 (keySet() -> Iterator -> for)
	public HashMap<Integer,Emp> getNameMap(){ 
		Iterator<Integer> keys = map.keySet().iterator();
		
		return map;
	}
}
