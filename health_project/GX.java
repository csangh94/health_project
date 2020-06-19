package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GX {

	/**
	 * @wbp.parser.entryPoint
	 */

	public void gxb(String num) {
		GxDAO dao = new GxDAO();
		GxDTO dto = dao.select(num); //gx table에서 해당 데이터 검색
		int mon = dto.getMon();
		int tue = dto.getTue();
		int wed = dto.getWed();
		int thur = dto.getThur();
		int fri = dto.getFri();

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JButton m1 = new JButton("요가");
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mon == 0) { //해당요일에 신청한 프로그램이 없는 경우
					SigninGX sg = new SigninGX();
					sg.signin(dto, "mon", 7, "요가"); //GX 프로그램 신청화면으로 넘어감
					f.dispose();
				} else { //이미 해당요일에 신청한 프로그램이 있는 경우, 신청불가
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		m1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		m1.setBounds(85, 104, 69, 47);
		f.getContentPane().add(m1);

		JButton m2 = new JButton("요가");
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mon == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "mon", 10, "요가");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		m2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		m2.setBounds(85, 158, 69, 47);
		f.getContentPane().add(m2);

		JButton m3 = new JButton("줌바");
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mon == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "mon", 12, "줌바");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		m3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		m3.setBounds(85, 214, 69, 47);
		f.getContentPane().add(m3);

		JButton m4 = new JButton("댄스");
		m4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mon == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "mon", 19, "댄스");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		m4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		m4.setBounds(85, 268, 69, 47);
		f.getContentPane().add(m4);

		JButton m5 = new JButton("줌바");
		m5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mon == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "mon", 21, "줌바");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		m5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		m5.setBounds(85, 378, 69, 47);
		f.getContentPane().add(m5);

		JButton t1 = new JButton("댄스");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tue == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "tue", 10, "댄스");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		t1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		t1.setBounds(162, 159, 69, 47);
		f.getContentPane().add(t1);

		JButton t2 = new JButton("요가");
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tue == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "tue", 19, "요가");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		t2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		t2.setBounds(163, 268, 69, 47);
		f.getContentPane().add(t2);

		JButton t3 = new JButton("스피닝");
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tue == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "tue", 20, "스피닝");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		t3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		t3.setBounds(160, 323, 75, 47);
		f.getContentPane().add(t3);

		JButton w1 = new JButton("요가");
		w1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (wed == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "wed", 7, "요가");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		w1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		w1.setBounds(239, 104, 69, 47);
		f.getContentPane().add(w1);

		JButton w2 = new JButton("요가");
		w2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (wed == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "wed", 10, "요가");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		w2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		w2.setBounds(239, 158, 69, 47);
		f.getContentPane().add(w2);

		JButton w3 = new JButton("줌바");
		w3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (wed == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "wed", 12, "줌바");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		w3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		w3.setBounds(239, 214, 69, 47);
		f.getContentPane().add(w3);

		JButton w4 = new JButton("댄스");
		w4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (wed == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "wed", 19, "댄스");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		w4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		w4.setBounds(239, 268, 69, 47);
		f.getContentPane().add(w4);

		JButton w5 = new JButton("줌바");
		w5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (wed == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "wed", 21, "줌바");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		w5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		w5.setBounds(239, 378, 69, 47);
		f.getContentPane().add(w5);

		JButton s1 = new JButton("댄스");
		s1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (thur == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "thur", 10, "댄스");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		s1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		s1.setBounds(317, 159, 69, 47);
		f.getContentPane().add(s1);

		JButton s2 = new JButton("요가");
		s2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (thur == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "thur", 19, "요가");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		s2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		s2.setBounds(318, 268, 69, 47);
		f.getContentPane().add(s2);

		JButton s3 = new JButton("스피닝");
		s3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (thur == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "thur", 20, "스피닝");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		s3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		s3.setBounds(315, 324, 75, 47);
		f.getContentPane().add(s3);

		JButton f1 = new JButton("요가");
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fri == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "fri", 7, "요가");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		f1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		f1.setBounds(396, 104, 69, 47);
		f.getContentPane().add(f1);

		JButton f2 = new JButton("요가");
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fri == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "fri", 10, "요가");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		f2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		f2.setBounds(396, 158, 69, 47);
		f.getContentPane().add(f2);

		JButton f3 = new JButton("줌바");
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fri == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "fri", 12, "줌바");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		f3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		f3.setBounds(396, 214, 69, 47);
		f.getContentPane().add(f3);

		JButton f4 = new JButton("댄스");
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fri == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "fri", 19, "댄스");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		f4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		f4.setBounds(396, 268, 69, 47);
		f.getContentPane().add(f4);

		JButton f5 = new JButton("줌바");
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fri == 0) {
					SigninGX sg = new SigninGX();
					sg.signin(dto, "fri", 21, "줌바");
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "신청불가");
				}
			}
		});
		f5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		f5.setBounds(396, 378, 69, 47);
		f.getContentPane().add(f5);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\ksy\\java_project\\healthproject\\이미지 3.png"));
		lblNewLabel.setBounds(12, 39, 460, 412);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("GX PROGRAM");
		lblNewLabel_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 23));
		lblNewLabel_1.setBounds(160, 10, 152, 35);
		f.getContentPane().add(lblNewLabel_1);

		f.setVisible(true);
	}
}
