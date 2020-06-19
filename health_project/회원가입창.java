package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입창 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void signIn() {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("*성명");
		lblNewLabel.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		lblNewLabel.setBounds(67, 72, 74, 38);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		t1.setBounds(153, 72, 252, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("*회원번호");
		lblNewLabel_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(56, 130, 97, 38);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(153, 130, 153, 38);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("생년월일");
		lblNewLabel_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(67, 189, 97, 38);
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBounds(153, 189, 252, 38);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_3 = new JLabel("연락처");
		lblNewLabel_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(67, 248, 74, 38);
		f.getContentPane().add(lblNewLabel_3);
		
		t4 = new JTextField();
		t4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		t4.setColumns(10);
		t4.setBounds(153, 248, 252, 38);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_4 = new JLabel("성별");
		lblNewLabel_4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(67, 305, 74, 38);
		f.getContentPane().add(lblNewLabel_4);
		
		t5 = new JTextField();
		t5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		t5.setColumns(10);
		t5.setBounds(153, 305, 252, 38);
		f.getContentPane().add(t5);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String num = t2.getText();
				String bd = t3.getText();
				String phone = t4.getText();
				String gender = t5.getText();
				
				//입력받은 이름,회원번호,생일,전화번호,성별을 memberdto에 저장
				MemberDTO dto = new MemberDTO();
				dto.setName(name);
				dto.setNum(num);
				dto.setBd(bd);;
				dto.setPhone(phone);
				dto.setGender(gender);
				//입력받은 이름,회원번호,생일,전화번호,성별을 memberinfodto에 저장
				MemberinfoDTO dto2 = new MemberinfoDTO();
				dto2.setName(name);
				dto2.setNum(num);
				dto2.setBd(bd);
				dto2.setPhone(phone);
				dto2.setGender(gender);
				
				MemberDAO db = new MemberDAO();
				GxDAO dao = new GxDAO();
				MemberinfoDAO dao2 = new MemberinfoDAO();
				
				if (name.equals("") || num.equals("")) {//이름,회원번호 입력 안한경우
					JOptionPane.showMessageDialog(null, "필수 입력 항목을 입력해주세요.");
				}else {
					db.insert(dto); //member table에 데이터 입력
					dao.insert(num); //gx table에 데이터 입력
					dao2.insert(dto2); //memberinfo table에 데이터 입력
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					f.dispose(); //회원가입 완료 후 창 종료
				}
				
			}
		});
		btnNewButton.setFont(new Font("한컴산뜻돋움", Font.BOLD, 30));
		btnNewButton.setBounds(138, 369, 201, 64);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("중복확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //중복확인
				MemberDAO dao = new MemberDAO();
				String num2 = t2.getText();
				MemberDTO dto =dao.select(num2); //member table에서 해당하는 데이터 검색
				if (dto == null) { //검색값이 없으면 중복된 회원번호가 없으므로 사용가능
					JOptionPane.showMessageDialog(null, "사용 가능한 회원번호입니다.");
				} else {
					JOptionPane.showMessageDialog(null, "중복된 회원번호입니다.\n다시 입력하세요.");
					t2.setText("");
				}
			}
		});
		btnNewButton_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 13));
		btnNewButton_1.setBounds(318, 130, 87, 38);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("(Ex. 1234)");
		lblNewLabel_5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(67, 164, 74, 15);
		f.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("(Ex. 800101)");
		lblNewLabel_5_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(67, 223, 74, 15);
		f.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("(M/W)");
		lblNewLabel_5_1_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		lblNewLabel_5_1_1.setBounds(67, 338, 53, 15);
		f.getContentPane().add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("* 필수 입력");
		lblNewLabel_6.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(349, 47, 56, 15);
		f.getContentPane().add(lblNewLabel_6);
		
		
		f.setVisible(true);
	}
}
