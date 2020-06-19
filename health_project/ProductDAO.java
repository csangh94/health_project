package 프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProductDAO {
	String url = "jdbc:mysql://localhost:3708/health?characterEncoding=utf8&serverTimezone=UTC";
	String user = "root";
	String password = "1234";

	public PriceDTO insertmonthpri(PriceDTO dto) {//등록/결제 정보 product 테이블에 등록
		// 매개변수 (파라메터, parameter), 지역변수
		try {
			// 1) 커넥터설정
			Class.forName("com.mysql.jdbc.Driver");

			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "insert into monthpri values(?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, dto.getMonth());
			ps.setInt(2, dto.getPt());
			ps.setInt(3, dto.getChoice());
			ps.setInt(4, dto.getClotho());
			ps.setInt(5, dto.getLockero());
			ps.setInt(6, dto.getSum());
			// 4) sql문 전송
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public ProductDTO insert(ProductDTO dto) {//등록/결제 정보 product 테이블에 등록
		// 매개변수 (파라메터, parameter), 지역변수
		try {
			// 1) 커넥터설정
			Class.forName("com.mysql.jdbc.Driver");
			// 2) db연결
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "insert into product values(?, ?, ?, ?, ?, ?, ?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, dto.getNum());
			ps.setInt(2, dto.getChoice());
			ps.setInt(3, dto.getPt());
			ps.setInt(4, dto.getCloth());
			ps.setInt(5, dto.getLocker());
			ps.setInt(6, dto.getLockernum());
			ps.setInt(7, dto.getSum());
			ps.setInt(8, dto.getMonth());
			// 4) sql문 전송
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	public ArrayList<ProductDTO> select2() {//사물함 번호 불러오기
		ArrayList<ProductDTO> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ProductDTO dto2 = new ProductDTO();
				String num = rs.getString(1);
				dto2.setNum(num);
				list.add(dto2);
				
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ProductDTO select(ProductDTO dto) { //회원번호로 검색하기
		ProductDTO dto2 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, password);

			String sql = "select * from product where num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNum());
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto2 = new ProductDTO();
				String num = rs.getString(1); 
				dto2.setNum(num);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return dto2;
	}
	public ArrayList<ProductDTO> lock() {//사물함 번호 불러오기
		ArrayList<ProductDTO> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ProductDTO dto2 = new ProductDTO();
				int lockernum = Integer.parseInt(rs.getString(6));
				dto2.setLockernum(lockernum);
				list.add(dto2);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public ProductDTO com(String num) {//product 테이블에서 choice , pt , cloth, locker 값 가져오기 
		ProductDTO dto = new ProductDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select * from product where num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, num);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int choice = Integer.parseInt(rs.getString(2)); //choice
				int pt = Integer.parseInt(rs.getString(3));//pt
				int cloth = Integer.parseInt(rs.getString(4));//cloth
				int locker = Integer.parseInt(rs.getString(5));//locker
				int lockernum = Integer.parseInt(rs.getString(6));//lockernum
				int sum = Integer.parseInt(rs.getString(7));//sum
				dto.setChoice(choice);
				dto.setPt(pt);
				dto.setCloth(cloth);
				dto.setLocker(locker);
				dto.setLockernum(lockernum);
				dto.setSum(sum);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public ArrayList<PriceDTO> sum() {//price 테이블에서 choice , pt , cloth, locker 값 가져오기 
		ArrayList<PriceDTO> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String sql = "select * from price";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				PriceDTO dto2 = new PriceDTO();
				int choice = Integer.parseInt(rs.getString(1)); //choice
				int pt = Integer.parseInt(rs.getString(2));//pt
				int clotho = Integer.parseInt(rs.getString(3));//cloth
				int clothx = Integer.parseInt(rs.getString(4));//clothx
				int lockero = Integer.parseInt(rs.getString(5));//lockero
				int lockerx = Integer.parseInt(rs.getString(6));//lockerx
				dto2.setChoice(choice);
				dto2.setPt(pt);
				dto2.setClotho(clotho);
				dto2.setClothx(clothx);
				dto2.setLockero(lockero);
				dto2.setLockerx(lockerx);
				list.add(dto2);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			String sql = "delete from product where num = ?";
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


