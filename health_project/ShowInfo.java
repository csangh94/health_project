package 프로젝트;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ShowInfo {
	public static JLabel t21;
	public static JLabel t22;
	public static JLabel t23;
	public static JLabel t24;
	public static JLabel t25;
	public static JLabel t13;

	public static ShowInfo w; // 다른 파일로 연결하기위해 등록창의 주소값을 만든다.
	
	public static void main(String[] args) {//ctrl + shift + p (닫는 괄호 찾기)
		w = new ShowInfo();
	}
	/**
	 * @wbp.parser.entryPoint
	 */

	public ShowInfo() {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		t25 = new JLabel("");
		t25.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t25.setBounds(242, 391, 73, 23);
		f.getContentPane().add(t25);

		t24 = new JLabel("");
		t24.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t24.setBounds(143, 391, 73, 23);
		f.getContentPane().add(t24);

		t23 = new JLabel("");
		t23.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t23.setBounds(143, 362, 163, 23);
		f.getContentPane().add(t23);

		t21 = new JLabel("");
		t21.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t21.setBounds(143, 300, 163, 23);
		f.getContentPane().add(t21);

		t22 = new JLabel("");
		t22.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t22.setBounds(143, 333, 163, 23);
		f.getContentPane().add(t22);

		JLabel t14 = new JLabel("");
		t14.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t14.setBounds(143, 207, 114, 23);
		f.getContentPane().add(t14);

		t13 = new JLabel("");
		t13.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t13.setBounds(143, 178, 163, 23);
		f.getContentPane().add(t13);

		JLabel t12 = new JLabel("");
		t12.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t12.setBounds(143, 149, 163, 23);
		f.getContentPane().add(t12);

		JLabel t11 = new JLabel("");
		t11.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t11.setBounds(143, 116, 163, 23);
		f.getContentPane().add(t11);

		JLabel namelabel = new JLabel("");
		namelabel.setHorizontalAlignment(SwingConstants.CENTER);
		namelabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		namelabel.setBounds(32, 28, 64, 43);
		f.getContentPane().add(namelabel);

		//member table에서 입력받은 회원번호에 해당하는 데이터 검색, dto에 저장
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.select(회원번호입력창.number); 
		//이름, 회원번호, 생일, 전화번호, 성별 출력
		namelabel.setText(dto.getName());
		t11.setText(dto.getNum());
		t12.setText(dto.getBd());
		t13.setText(dto.getPhone());
		t14.setText(dto.getGender());
		
		// product table에서 입력받은 회원번호에 해당하는 데이터 검색하여
		// dto2에 저장
		ProductDAO dao2 = new ProductDAO();
		ProductDTO dto2 = dao2.com(회원번호입력창.number); 

		// choice 값에 따라 등록기간 출력
		if (dto2.getChoice() == 1) {
			t21.setText("1개월");
		} else if (dto2.getChoice() == 2) {
			t21.setText("3개월");
		} else if (dto2.getChoice() == 3) {
			t21.setText("6개월");
		} else if (dto2.getChoice() == 4) {
			t21.setText("12개월");
		} else {
			t21.setText("");
		}
		// 총 결제금액 출력
		if (dto2.getChoice() == 0) {
			t22.setText("");
		}else {
			t22.setText(dto2.getSum() + " 원");
		}
		// 옷 신청여부 출력
		if (dto2.getChoice() == 0) {
			t23.setText("");
		} else if (dto2.getCloth() == 1) {
			t23.setText("O");
		} else {
			t23.setText("X");
		}
		// 사물함 신청여부, 사물함 번호 출력
		if (dto2.getChoice() == 0) {
			t24.setText("");
			t25.setText("");
		} else if (dto2.getLocker() == 1) {
			t24.setText("O");
			t25.setText("" + dto2.getLockernum());
		} else {
			t24.setText("X");
			t25.setText("X");
		}

		JLabel lblNewLabel_1 = new JLabel("회원정보");
		lblNewLabel_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 13));
		lblNewLabel_1.setBounds(32, 81, 59, 23);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\ksy\\java_project\\healthproject\\이미지 9.png"));
		lblNewLabel_2.setBounds(30, 104, 340, 138);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_1_1 = new JLabel("등록정보");
		lblNewLabel_1_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(32, 264, 59, 23);
		f.getContentPane().add(lblNewLabel_1_1);

		JButton btnNewButton = new JButton("연락처 수정");
		btnNewButton.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				정보수정창 updatephone = new 정보수정창();
				updatephone.update(dto); // 연락처수정 화면으로 넘어감
			}
		});
		btnNewButton.setBounds(350, 165, 107, 36);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("등록/결제하기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 등록결제 화면으로 넘어감
				PayMent pay = new PayMent();
			}
		});
		btnNewButton_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		btnNewButton_1.setBounds(350, 362, 122, 53);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\ksy\\java_project\\healthproject\\이미지 11.png"));
		lblNewLabel.setBounds(32, 287, 306, 138);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_4 = new JLabel("님");
		lblNewLabel_4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(100, 37, 57, 27);
		f.getContentPane().add(lblNewLabel_4);

		JButton btnGhldnjsxkfxhl = new JButton("회원 탈퇴");
		btnGhldnjsxkfxhl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 회원탈퇴 처리
				int result = dao.delete(회원번호입력창.number); //member table
				ProductDAO dao2 = new ProductDAO();
				GxDAO dao3 = new GxDAO();
				GmDAO dao4 = new GmDAO();
				MemberinfoDAO dao5 = new MemberinfoDAO();
				dao2.delete(회원번호입력창.number); //product table
				dao3.delete(회원번호입력창.number); //gx table
				dao4.delete(회원번호입력창.number); //gxmember table
				dao5.delete(회원번호입력창.number); //memberinfo table
				
				if (result == 0) { // 탈퇴처리 실패
					JOptionPane.showMessageDialog(null, "탈퇴가 되지 않았습니다");
				} else { // 탈퇴완료
					JOptionPane.showMessageDialog(null, "탈퇴가 완료되었습니다");
					System.exit(0);
				}
			}
		});
		btnGhldnjsxkfxhl.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		btnGhldnjsxkfxhl.setBounds(350, 206, 107, 36);
		f.getContentPane().add(btnGhldnjsxkfxhl);

		JButton btnNewButton_2 = new JButton("GX 신청");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // GX 신청화면으로 넘어감
				GX gx = new GX();
				gx.gxb(회원번호입력창.number);
			}
		});
		btnNewButton_2.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		btnNewButton_2.setBounds(350, 307, 122, 49);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
