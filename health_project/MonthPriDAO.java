package 프로젝트;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import java.sql.Connection;

public class MonthPriDAO {
	String url = "jdbc:mysql://localhost:3708/health?characterEncoding=utf8&serverTimezone=UTC";
	String user = "root";
	String password = "1234";

	public void updatepri(MonthPriDTO dto) {// 데이터 수정
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "update monthpri2 set pt = ?, choice =?, cloth = ?, locker = ?, sum =? where month = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getPt());
			ps.setInt(2, dto.getChoice());
			ps.setInt(3, dto.getCloth());
			ps.setInt(4, dto.getLocker());
			ps.setInt(5, dto.getSum());
			ps.setInt(6, dto.getMonth());
			// 4)sql문 전송
			ps.executeUpdate();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public MonthPriDTO selectMonth2(MonthPriDTO dto2) {
		MonthPriDTO dto3 = null;
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "select month, sum(pt), sum(choice), sum(cloth), sum(locker), sum(sum) from monthpri where month = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dto2.getMonth());
			// 4) sql문 전송
			ResultSet rs = ps.executeQuery();

			if (rs.next()) { // 검색 결과가 있는지 체크해주는 메서드
				dto3 = new MonthPriDTO();
				int month = rs.getInt(1);
				int pt = rs.getInt(2);
				int choice = rs.getInt(3);
				int cloth = rs.getInt(4);
				int locker = rs.getInt(5);
				int sum = rs.getInt(6);

				dto3.setMonth(month);
				dto3.setPt(pt);
				dto3.setChoice(choice);
				dto3.setCloth(cloth);
				dto3.setLocker(locker);
				dto3.setSum(sum);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto3;
	}

	public ArrayList<MonthPriDTO> all2() {
		ArrayList<MonthPriDTO> list = new ArrayList<MonthPriDTO>();
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "select * from monthpri2";
			PreparedStatement ps = con.prepareStatement(sql);
			// 4) sql문 전송
			ResultSet rs = ps.executeQuery();

			while (rs.next()) { // 검색 결과가 있는지 체크해주는 메서드
				// row의 위치를 나타내는 커서를 아래로 옮기면서
				// 그 해당 row가 있는지 체크해주는 메소드
				// 있으면 true, 없으면 false
				MonthPriDTO dto2 = new MonthPriDTO();
				int month = rs.getInt(1);
				int pt = rs.getInt(2);
				int choice = rs.getInt(3);
				int cloth = rs.getInt(4);
				int locker = rs.getInt(5);
				int sum = rs.getInt(6);
				dto2.setMonth(month);
				dto2.setPt(pt);
				dto2.setChoice(choice);
				dto2.setCloth(cloth);
				dto2.setLocker(locker);
				dto2.setSum(sum);
				list.add(dto2);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// 4.검색을 할 예정.
	public MonthPriDTO select(MonthPriDTO dto2) {
		MonthPriDTO dto3 = null;
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "select * from monthpri where month = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dto2.getMonth());
			// 4) sql문 전송
			ResultSet rs = ps.executeQuery();

			if (rs.next()) { // 검색 결과가 있는지 체크해주는 메서드
				System.out.println("검색 결과가 있어요.!!");
				dto2 = new MonthPriDTO();
				int month = rs.getInt(1);
				int pt = rs.getInt(2);
				int choice = rs.getInt(3);
				int cloth = rs.getInt(4);
				int locker = rs.getInt(5);
				int sum = rs.getInt(6);

				dto2.setMonth(month);
				dto2.setPt(pt);
				dto2.setChoice(choice);
				dto2.setCloth(cloth);
				dto2.setLocker(locker);
				dto2.setSum(sum);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto3;
	}

	// 4.검색을 할 예정.
	public MonthPriDTO selectMonth(MonthPriDTO dto2) {
		MonthPriDTO dto3 = null;
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "select month, sum(pt), sum(choice), sum(cloth), sum(locker), sum(sum) from monthpri where month = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dto2.getMonth());
			// 4) sql문 전송
			ResultSet rs = ps.executeQuery();

			if (rs.next()) { // 검색 결과가 있는지 체크해주는 메서드
				dto3 = new MonthPriDTO();
				int month = rs.getInt(1);
				int pt = rs.getInt(2);
				int choice = rs.getInt(3);
				int cloth = rs.getInt(4);
				int locker = rs.getInt(5);
				int sum = rs.getInt(6);

				dto3.setMonth(month);
				dto3.setPt(pt);
				dto3.setChoice(choice);
				dto3.setCloth(cloth);
				dto3.setLocker(locker);
				dto3.setSum(sum);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto3;
	}


//1. 회원가입
	public void insert(MonthPriDTO dto) {
		// 매개변수(파라메터, parameter), 지역변수
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "insert into monthpri values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getMonth());
			ps.setInt(2, dto.getPt());
			ps.setInt(3, dto.getChoice());
			ps.setInt(4, dto.getCloth());
			ps.setInt(5, dto.getLocker());
			ps.setInt(6, dto.getSum());
			// 4) sql문 전송
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void update(ProductDTO dto) {
		try {
			// 1)커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2)db 연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3)sql문 결정
			String sql = "update monthpri set choice = ?,pt = ?,cloth = ?,locker = ?,sum = ?,month = ? where num = ?";
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
	public ArrayList<MonthPriDTO> all() {
		ArrayList<MonthPriDTO> list = new ArrayList<MonthPriDTO>();
		try {
			// 1) 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			// 3) sql문 결정
			String sql = "select * from monthpri2";
			PreparedStatement ps = con.prepareStatement(sql);
			// 4) sql문 전송
			ResultSet rs = ps.executeQuery();

			while (rs.next()) { // 검색 결과가 있는지 체크해주는 메서드
				// row의 위치를 나타내는 커서를 아래로 옮기면서
				// 그 해당 row가 있는지 체크해주는 메소드
				// 있으면 true, 없으면 false
				MonthPriDTO dto2 = new MonthPriDTO();
				int month = rs.getInt(1);
				int pt = rs.getInt(2);
				int choice = rs.getInt(3);
				int cloth = rs.getInt(4);
				int locker = rs.getInt(5);
				int sum = rs.getInt(6);
				dto2.setMonth(month);
				dto2.setPt(pt);
				dto2.setChoice(choice);
				dto2.setCloth(cloth);
				dto2.setLocker(locker);
				dto2.setSum(sum);
				list.add(dto2);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
