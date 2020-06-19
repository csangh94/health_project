package 프로젝트;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.sql.Connection;

public class MemberinfoDAO {
	String url = "jdbc:mysql://localhost:3708/health?characterEncoding=utf8&serverTimezone=UTC";
	String user = "root";
	String password = "1234";

	// 4.검색을 할 예정.
	public MemberinfoDTO select(MemberinfoDTO dto) {
		dto = null;
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "select * from memberinfo";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNum());
			// 4) sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4. sql문 전송 ok..");

			if (rs.next()) { // 검색 결과가 있는지 체크해주는 메서드
				dto = new MemberinfoDTO();
				String num = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String tel = rs.getString(4);
				String gender = rs.getString(5);
				int choice = rs.getInt(6);
				int pt = rs.getInt(7);
				int cloth = rs.getInt(8);
				int locker = rs.getInt(9);
				int sum = rs.getInt(10);
				int month = rs.getInt(11);
				dto.setNum(num);
				dto.setName(name);
				dto.setBd(birth);
				dto.setPhone(tel);
				dto.setGender(gender);
				dto.setChoice(choice);
				dto.setPt(pt);
				dto.setCloth(cloth);
				dto.setLocker(locker);
				dto.setSum(sum);
				dto.setMonth(month);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

//1. 회원가입
	public void insert(MemberinfoDTO dto) {
		// 매개변수(파라메터, parameter), 지역변수
		System.out.println("회원가입 처리하다.");
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "insert into memberinfo values (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getBd());
			ps.setString(4, dto.getPhone());
			ps.setString(5, dto.getGender());
			ps.setInt(6, dto.getChoice());
			ps.setInt(7, dto.getPt());
			ps.setInt(8, dto.getCloth());
			ps.setInt(9, dto.getLocker());
			ps.setInt(10, dto.getSum());
			ps.setInt(11, dto.getMonth());
			// 4) sql문 전송
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//3. 회원탈퇴
	public int delete(String num) {
		int result = 0;
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "delete from memberinfo where num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, num);
			// 4)sql문 전송
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

//4. 수정
	public void update(ProductDTO dto) {
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "update memberinfo set choice = ?,pt = ?,cloth = ?,locker = ?,sum = ?,month = ? where num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getChoice());
			ps.setInt(2, dto.getPt());
			ps.setInt(3, dto.getCloth());
			ps.setInt(4, dto.getLocker());
			ps.setInt(5, dto.getSum());
			ps.setInt(6, dto.getMonth());
			ps.setString(7, dto.getNum());
			// 4)sql문 전송
			ps.executeUpdate();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	// 5. 전체 검색을 할 예정.
	public ArrayList<MemberinfoDTO> all() {
		ArrayList<MemberinfoDTO> list = new ArrayList<MemberinfoDTO>();
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "select * from memberinfo";
			PreparedStatement ps = con.prepareStatement(sql);
			// 4) sql문 전송
			ResultSet rs = ps.executeQuery();

			while (rs.next()) { // 검색 결과가 있는지 체크해주는 메서드
				MemberinfoDTO dto = new MemberinfoDTO();
				String num = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String tel = rs.getString(4);
				String gender = rs.getString(5);
				int choice = rs.getInt(6);
				int pt = rs.getInt(7);
				int cloth = rs.getInt(8);
				int locker = rs.getInt(9);
				int sum = rs.getInt(10);
				int month = rs.getInt(11);
				dto.setNum(num);
				dto.setName(name);
				dto.setBd(birth);
				dto.setPhone(tel);
				dto.setGender(gender);
				dto.setChoice(choice);
				dto.setPt(pt);
				dto.setCloth(cloth);
				dto.setLocker(locker);
				dto.setSum(sum);
				dto.setMonth(month);
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
