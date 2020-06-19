package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정보수정창 {
	private static JTextField t1;
	String url = "jdbc:mysql://localhost:3708/health?characterEncoding=utf8&serverTimezone=UTC";
	String user = "root";
	String password = "1234";

	/**
	 * @wbp.parser.entryPoint
	 */
	public void update(MemberDTO dto) {
		JFrame f = new JFrame();
		f.setSize(316,212);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("연락처");
		lblNewLabel.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 16));
		lblNewLabel.setBounds(12, 71, 57, 40);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("회원정보 수정");
		lblNewLabel_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(96, 14, 127, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 16));
		t1.setColumns(10);
		t1.setBounds(67, 71, 205, 38);
		f.getContentPane().add(t1);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phone = t1.getText(); 
				dto.setPhone(phone); //dto의 phone변수에 수정한 번호 저장
				MemberDAO dao = new MemberDAO();
				int result = dao.update(dto); //db 수정
				if(result == 0) { //수정 완료된 경우
					JOptionPane.showMessageDialog(null, "수정이 완료되었습니다");
					f.dispose(); // 창 닫기
					ShowInfo.t13.setText(phone);
				}
			}
		});
		btnNewButton.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 18));
		btnNewButton.setBounds(193, 119, 79, 41);
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);
	}

}
