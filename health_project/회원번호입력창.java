package 프로젝트;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원번호입력창 {
	private static JTextField textField;
	public static String pathing = "";
	private static JTextField result_data;
	public static String number;
	/**
	 * @wbp.parser.entryPoint
	 */
//	public static void main(String[] args) {

	public void signIn() {
		JFrame f = new JFrame();
		f.setSize(745, 606);
		f.getContentPane().setLayout(null);
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setIcon(new ImageIcon("헬스장.jpg"));

		textField = new JTextField();
		textField.setBackground(Color.PINK);
		textField.setFont(new Font("휴먼매직체", Font.BOLD, 40));
		textField.setText("   회원번호 입력");
		textField.setBounds(25, 25, 330, 86);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 25));
		btnNewButton.setBounds(25, 121, 100, 96);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_1.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_1.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 25));
		btnNewButton_1.setBounds(137, 121, 100, 96);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_2.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_2.setBounds(249, 121, 106, 96);
		f.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_3.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_3.setBounds(25, 222, 100, 96);
		f.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_4.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_4.setBounds(137, 222, 100, 96);
		f.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_5.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_5.setBounds(249, 222, 106, 96);
		f.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_6.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_6.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_6.setBounds(25, 328, 100, 96);
		f.getContentPane().add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_7.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_7.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_7.setBounds(137, 328, 100, 96);
		f.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_8.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_8.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_8.setBounds(249, 328, 106, 96);
		f.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("수정");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result_data.setText("");
				pathing = "";
			}
		});
		btnNewButton_9.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_9.setBounds(25, 434, 100, 96);
		f.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pathing = pathing + btnNewButton_10.getText();
				result_data.setText(pathing);
			}
		});
		btnNewButton_10.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_10.setBounds(137, 434, 100, 96);
		f.getContentPane().add(btnNewButton_10);

		result_data = new JTextField();
		result_data.setFont(new Font("휴먼매직체", Font.PLAIN, 30));
		result_data.setBackground(Color.LIGHT_GRAY);
		result_data.setBounds(527, 482, 173, 48);
		f.getContentPane().add(result_data);
		result_data.setColumns(10);

		JButton btnNewButton_11 = new JButton("확인");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = result_data.getText(); //입력한 회원번호 number변수에 저장
				MemberDAO dao = new MemberDAO();
		 		MemberDTO dto = dao.select(number); //member table에서 해당하는 데이터 검색
		 		if (dto != null) { //해당 데이터 있으면
		 			ShowInfo sign = new ShowInfo();
				} else { //일치하는 데이터 없는 경우
					JOptionPane.showMessageDialog(null, "회원번호가 존재하지않습니다.\n 다시 입력해주세요.");
					result_data.setText("");
					pathing = "";
				}
				
			}
		});
		btnNewButton_11.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		btnNewButton_11.setBounds(249, 434, 106, 96);
		f.getContentPane().add(btnNewButton_11);

		JButton join = new JButton("회 원 가 입");
		join.setBackground(Color.PINK);
		join.setFont(new Font("휴먼매직체", Font.BOLD, 40));
		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//회원가입창으로 넘어감
				회원가입창 sign = new 회원가입창();
				sign.signIn();
			}
		});
		join.setBounds(367, 25, 333, 86);
		f.getContentPane().add(join);

		JLabel result = new JLabel("회 원 번 호");
		result.setBackground(Color.PINK);
		result.setFont(new Font("휴먼매직체", Font.BOLD, 30));
		result.setBounds(367, 482, 148, 48);
		f.getContentPane().add(result);

		btnNewButton_12.setBounds(367, 121, 333, 351);
		f.getContentPane().add(btnNewButton_12);
		f.setVisible(true);

	}

}
