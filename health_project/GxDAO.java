package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GxDAO {
	String url = "jdbc:mysql://localhost:3708/health?characterEncoding=utf8&serverTimezone=UTC";
	String user = "root";
	String password = "1234";

	public void insert(String num) {//gx table에 데이터 입력
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "insert into gx values (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, num);
			ps.setInt(2, 0);
			ps.setInt(3, 0);
			ps.setInt(4, 0);
			ps.setInt(5, 0);
			ps.setInt(6, 0);
			// 4)sql문 전송
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public GxDTO select(String num) { //데이터 검색
		GxDTO dto = null;
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "select * from gx where num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, num);
			// 4)sql문 전송
			ResultSet rs = ps.executeQuery();
			if (rs.next()) { // 검색결과가 있는지 체크해주는 메소드
				dto = new GxDTO();
				int mon = rs.getInt(2);
				int tue = rs.getInt(3);
				int wed = rs.getInt(4);
				int thur = rs.getInt(5);
				int fri = rs.getInt(6);
				
				dto.setNum(num);
				dto.setMon(mon);
				dto.setTue(tue);
				dto.setWed(wed);
				dto.setThur(thur);
				dto.setFri(fri);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public void update(GxDTO dto) {//데이터 수정
		try {
			//1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			//2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			//3)sql문 결정
			String sql = "update gx set mon = ?, tue = ?, wed =?, thur = ?, fri =? where num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getMon());
			ps.setInt(2, dto.getTue());
			ps.setInt(3, dto.getWed());
			ps.setInt(4, dto.getThur());
			ps.setInt(5, dto.getFri());
			ps.setString(6, dto.getNum());
			//4)sql문 전송
			ps.executeUpdate();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public int delete(String num) {
		int result = 0;
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "delete from gx where num = ?";
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


