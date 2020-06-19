package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GmDAO {
	String url = "jdbc:mysql://localhost:3708/health?characterEncoding=utf8&serverTimezone=UTC";
	String user = "root";
	String password = "1234";

	public void insert(GmDTO dto) {//gxmember table에 데이터 입력
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "insert into gxmember values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNum());
			ps.setString(2, dto.getDay());
			ps.setInt(3,dto.getTime());
			ps.setString(4, dto.getClassname());
			ps.setInt(5, dto.getCount());
			// 4)sql문 전송
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public ArrayList<GmDTO> all(GmDTO dto){//요일,시간,프로그램명이 일치하는 데이터 모두 검색하여 리스트에 저장
		ArrayList<GmDTO> list = new ArrayList<>();
		try {
			//1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			//2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			//3)sql문 결정
			String sql = "select * from gxmember where day =? and time = ? and classname = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getDay());
			ps.setInt(2, dto.getTime());
			ps.setString(3, dto.getClassname());
			//4)sql문 전송
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) { 
				int count = rs.getInt(5);
				dto.setCount(count);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

public int delete(String num) {
	int result = 0;
	try {
		// 1)커넥터 설정
		Class.forName("com.mysql.jdbc.Driver");
		// 2)db 연결
		Connection con = DriverManager.getConnection(url, user, password);
		// 3)sql문 결정
		String sql = "delete from gxmember where num = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, num);
		// 4)sql문 전송
		result = ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return result;
}
}