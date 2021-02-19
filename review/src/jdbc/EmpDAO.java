package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * orace db 이용
 * EMPLOYEES 테이블 이용 CRUD
 * EmpVO(Value Object -값을 저장하는 객체) == EmpDTO(Data Transfer Object-데이터 전달 객체) EmpDO Emp
 * DAO(Data Access Object) 데이터 처리 객체
 */

public class EmpDAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	//단건조회 select * from employees where employee_id = ?
	public EmpVO selectOne(String id){
		EmpVO vo =null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT   EMPLOYEE_ID, "
								+ "FIRST_NAME, "
								+ "LAST_NAME, "
								+ "EMAIL, "
								+ "PHONE_NUMBER, "
								+ "HIRE_DATE, "
								+ "JOB_ID, "
								+ "SALARY, "
								+ "COMMISSION_PCT, "
								+ "MANAGER_ID, "
								+ "DEPARTMENT_ID FROM EMPLOYEES "
								+ "WHERE EMPLOYEE_ID = ? ";
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getString(1));
				vo.setFirst_name(rs.getString(2));
				vo.setLast_name(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setPhone_number(rs.getString(5));
				vo.setHire_date(rs.getString(6));
				//더추가해야함.
			}
		}catch(Exception e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}finally {
			JdbcUtil.disconnect(conn);
		}
		return vo;
	}
	
	//전체조회
	public ArrayList<EmpVO> selectList(){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo =null;
		try {
			conn = JdbcUtil.connect();
			String sql = "SELECT   EMPLOYEE_ID, "
								+ "FIRST_NAME, "
								+ "LAST_NAME, "
								+ "EMAIL, "
								+ "PHONE_NUMBER, "
								+ "HIRE_DATE, "
								+ "JOB_ID, "
								+ "SALARY, "
								+ "COMMISSION_PCT, "
								+ "MANAGER_ID, "
								+ "DEPARTMENT_ID FROM EMPLOYEES "
								+ "ORDER BY EMPLOYEE_ID";
			psmt=conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getString(1));
				vo.setFirst_name(rs.getString(2));
				vo.setLast_name(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setPhone_number(rs.getString(5));
				vo.setHire_date(rs.getString(6));
				//더추가해야함.
				list.add(vo);
			}
		}catch(Exception e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}finally {
			JdbcUtil.disconnect(conn);
		}
		return list;
		
	}
	
	
	
	public void insert(EmpVO vo) {
		try {
			/* JDBC 처리과정 */
			//1.Connect (DB연결)
				conn = JdbcUtil.connect();
				
			//2.statement (실행할 sql 구문)
				String sql = "INSERT INTO EMPLOYEES(EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID) "
							+ "VALUES(?,?,?,?,?)";
				psmt=conn.prepareStatement(sql);
			//3.execute (구문실행)
				//execute -DDL 
				//executeQuery - DML select
				//executeUpaate - DML insert update delete 
				
				psmt.setString(1, vo.getEmployee_id());
				psmt.setString(2, vo.getLast_name());
				psmt.setString(3, vo.getEmail());
				psmt.setString(4, vo.getHire_date());
				psmt.setString(5, vo.getJob_id());
				
				int r = psmt.executeUpdate();
				System.out.println(r+"건이 등록됨");
				
			//4.resultset (select 라면 조회결괴 처리) 아니면 skip	
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//5. close (연결해제-에러발생 여부와 관계없음 무조건 연결해제)
				JdbcUtil.disconnect(conn);
		}
	}
	
	public void update(EmpVO vo) {
		try {
			/* JDBC 처리과정 */
			//1.Connect (연결)
				JdbcUtil.connect();
			//2.statement (구문)
				
			//3.execute (실행)
				
			//4.resultset (select 라면 조회결괴 처리) 아니면 skip
				
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//5. close (연결해제)
				JdbcUtil.disconnect(conn);
		}
	}
}
