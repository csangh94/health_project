package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 시작화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("회원용");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				회원번호입력창 sign = new 회원번호입력창();
				sign.signIn();//회원번호입력창 화면으로 넘어감
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.BOLD, 23));
		btnNewButton.setBounds(103, 106, 97, 250);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("관리자");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				관리자모드_선택 sign = new 관리자모드_선택();
				sign.signIn();//관리자모드 화면으로 넘어감
			}
		});
		btnNewButton_1.setFont(new Font("휴먼매직체", Font.BOLD, 23));
		btnNewButton_1.setBounds(289, 106, 97, 250);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}



}

