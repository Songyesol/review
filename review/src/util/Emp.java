package util;

import lombok.Data;

@Data
public class Emp {
	int id;
	String name ;
	String dept;
	
	public Emp() {} //메서드 오버로딩

	public Emp(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	
}
