package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MemberDAO {
	String url = "jdbc:mysql://localhost:3708/health?characterEncoding=utf8&serverTimezone=UTC";
	String user = "root";
	String password = "1234";

//1. 회원가입처리
	public void insert(MemberDTO dto) {
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "insert into member values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getNum());
			ps.setString(3, dto.getBd());
			ps.setString(4, dto.getPhone());
			ps.setString(5, dto.getGender());
			// 4)sql문 전송
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//2. 회원정보 가져오기
	public MemberDTO select(String num) {
		MemberDTO dto = null;
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "select * from member where num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, num);
			// 4)sql문 전송
			ResultSet rs = ps.executeQuery();
			if (rs.next()) { // 검색결과가 있는지 체크해주는 메소드
				dto = new MemberDTO();
				String name = rs.getString(1);
				String bd = rs.getString(3);
				String phone = rs.getString(4);
				String gender = rs.getString(5);
				dto.setName(name);
				dto.setNum(num);
				dto.setBd(bd);
				dto.setPhone(phone);
				dto.setGender(gender);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

//회원번호 중복 체크	
	public ArrayList<MemberDTO> all(){
		ArrayList<MemberDTO> list = new ArrayList<>();
		try {
			//1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			//2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			//3)sql문 결정
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
			//4)sql문 전송
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) { 
				MemberDTO dto = new MemberDTO();
				String name = rs.getString(1);
				String num = rs.getString(2);
				String bd = rs.getString(3);
				String phone = rs.getString(4);
				String gender = rs.getString(5);
				dto.setName(name);
				dto.setNum(num);
				dto.setBd(bd);
				dto.setPhone(phone);
				dto.setGender(gender);
				list.add(dto);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	

//3. 회원정보 수정
	public int update(MemberDTO dto) {
		int result = 0;
		try {
			//1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			//2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			//3)sql문 결정
			String sql = "update member set phone = ? where num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPhone());
			ps.setString(2, dto.getNum());
			//4)sql문 전송
			ps.executeUpdate();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return result;
	}

//4. 회원탈퇴
	public int delete(String num) {
		int result = 0;
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "delete from member where num = ?";
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
