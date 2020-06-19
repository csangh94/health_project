package 프로젝트;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PayMent {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	public static JTextField t4;
	private static JTextField t5;
	public static JTextField t6;

	public static PayMent w; // 다른 파일로 연결하기위해 등록창의 주소값을 만든다.
	private JTextField number1;

	public static void main(String[] args) {// ctrl + shift + p (닫는 괄호 찾기)
		w = new PayMent();
	}

	public PayMent() {
		JFrame f = new JFrame();
		f.setTitle("등록 및 결제");
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(661, 701);
		f.getContentPane().setLayout(null);
		JButton btnNewButton_6 = new JButton("사물함");
		JButton c1 = new JButton("1");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(c1.getText());
			}
		});
		c1.setBackground(new Color(255, 255, 255));
		c1.setFont(new Font("굴림", Font.PLAIN, 14));
		c1.setToolTipText("");
		c1.setBounds(12, 73, 97, 31);
		f.getContentPane().add(c1);

		JButton c2 = new JButton("2");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(c2.getText());
			}
		});
		c2.setBackground(new Color(255, 255, 255));
		c2.setFont(new Font("굴림", Font.PLAIN, 14));
		c2.setToolTipText("");
		c2.setBounds(12, 104, 97, 31);
		f.getContentPane().add(c2);

		JButton c3 = new JButton("3");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(c3.getText());
			}
		});
		c3.setBackground(new Color(255, 255, 255));
		c3.setFont(new Font("굴림", Font.PLAIN, 14));
		c3.setToolTipText("");
		c3.setBounds(12, 134, 97, 31);
		f.getContentPane().add(c3);

		JButton c4 = new JButton("4");
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(c4.getText());
			}
		});
		c4.setBackground(new Color(255, 255, 255));
		c4.setFont(new Font("굴림", Font.PLAIN, 14));
		c4.setBounds(12, 159, 97, 31);
		f.getContentPane().add(c4);

		JButton p1 = new JButton("0");
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(p1.getText());
			}
		});
		p1.setBackground(new Color(255, 255, 255));
		p1.setFont(new Font("굴림", Font.PLAIN, 14));
		p1.setToolTipText("");
		p1.setBounds(12, 264, 97, 31);
		f.getContentPane().add(p1);

		JButton p2 = new JButton("1");
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(p2.getText());
			}
		});
		p2.setBackground(new Color(255, 255, 255));
		p2.setFont(new Font("굴림", Font.PLAIN, 14));
		p2.setToolTipText("");
		p2.setBounds(12, 295, 97, 31);
		f.getContentPane().add(p2);

		JButton p3 = new JButton("2");
		p3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(p3.getText());
			}
		});
		p3.setBackground(new Color(255, 255, 255));
		p3.setFont(new Font("굴림", Font.PLAIN, 14));
		p3.setToolTipText("");
		p3.setBounds(12, 325, 97, 31);
		f.getContentPane().add(p3);

		JButton p4 = new JButton("3");
		p4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t2.setText(p4.getText());
			}
		});
		p4.setBackground(new Color(255, 255, 255));
		p4.setFont(new Font("굴림", Font.PLAIN, 14));
		p4.setBounds(12, 350, 97, 31);
		f.getContentPane().add(p4);

		JButton b1 = new JButton("0");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t3.setText(b1.getText());
			}
		});
		b1.setBackground(new Color(255, 255, 255));
		b1.setFont(new Font("굴림", Font.PLAIN, 14));
		b1.setBounds(106, 417, 190, 31);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("1");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t3.setText(b2.getText());
			}
		});
		b2.setBackground(new Color(255, 255, 255));
		b2.setFont(new Font("굴림", Font.PLAIN, 14));
		b2.setBounds(106, 446, 190, 31);
		f.getContentPane().add(b2);

		JButton l1 = new JButton("0");
		l1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t4.setText(l1.getText());
				btnNewButton_6.setEnabled(false);
				t6.setText("0");
			}
		});
		l1.setBackground(new Color(255, 255, 255));
		l1.setFont(new Font("굴림", Font.PLAIN, 14));
		l1.setBounds(106, 549, 190, 31);
		f.getContentPane().add(l1);

		JButton l2 = new JButton("1");
		l2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t4.setText(l2.getText());
				btnNewButton_6.setEnabled(true);
			}
		});
		l2.setBackground(new Color(255, 255, 255));
		l2.setBounds(106, 578, 190, 31);
		f.getContentPane().add(l2);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\ksy\\java_project\\healthproject\\이미지 040.png"));
		lblNewLabel_2.setBounds(12, 383, 284, 126);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\ksy\\java_project\\healthproject\\이미지 037.png"));
		lblNewLabel.setBounds(12, 10, 284, 185);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\ksy\\java_project\\healthproject\\이미지 038.png"));
		lblNewLabel_1.setBounds(12, 193, 284, 198);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\ksy\\java_project\\healthproject\\이미지 041.png"));
		lblNewLabel_2_1.setBounds(15, 519, 281, 119);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("E:\\ksy\\java_project\\healthproject\\이미지 051.png"));
		lblNewLabel_3.setBounds(313, 76, 166, 140);
		f.getContentPane().add(lblNewLabel_3);

		t1 = new JTextField();
		t1.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBounds(483, 88, 130, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setColumns(10);
		t2.setBounds(483, 125, 130, 40);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setColumns(10);
		t3.setBounds(483, 161, 130, 40);
		f.getContentPane().add(t3);

		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lock sa = new Lock();
				sa.samool();
			}
		});

		btnNewButton_6.setBackground(new Color(51, 255, 0));
		btnNewButton_6.setFont(new Font("돋움", Font.BOLD, 20));
		btnNewButton_6.setBounds(308, 214, 171, 40);
		f.getContentPane().add(btnNewButton_6);

		t4 = new JTextField();

		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		t4.setColumns(10);
		t4.setBounds(483, 214, 130, 40);
		f.getContentPane().add(t4);

		t5 = new JTextField();

		t5.setFont(new Font("굴림", Font.PLAIN, 20));
		t5.setBounds(433, 406, 153, 51);
		f.getContentPane().add(t5);
		t5.setColumns(10);

		JButton btnNewButton_7 = new JButton("결제");
		btnNewButton_7.setEnabled(false); // ====================================== 추가
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendar cal = new GregorianCalendar(Locale.KOREA);
				try {
					String num = number1.getText();
					// String --> int : Integer.parseInt() 스트링으로 받은 값 인트로 전환하기
					int choice = Integer.parseInt(t1.getText());
					int pt = Integer.parseInt(t2.getText());
					int cloth = Integer.parseInt(t3.getText());
					int locker = Integer.parseInt(t4.getText());
					int lockernum = Integer.parseInt(t6.getText());
					int sum = Integer.parseInt(t5.getText()); // ====================================== 변경
					int month = cal.get(Calendar.MONTH) + 1;
					ProductDTO dto = new ProductDTO();
					dto.setNum(num);
					dto.setChoice(choice);
					dto.setPt(pt);
					dto.setCloth(cloth);
					dto.setLocker(locker);
					dto.setLockernum(lockernum);
					dto.setSum(sum);
					dto.setMonth(month);
					// 추가 03 -16-------------//====================================== 추가
					ProductDAO db = new ProductDAO();
					ProductDTO dto2 = db.select(dto);
					if (dto2 != null) {
						JOptionPane.showMessageDialog(null, "이미 등록된 회원번호입니다.");
						number1.setText("");
					} else {
						db.insert(dto);
						ProductDAO dao = new ProductDAO();
						ArrayList<PriceDTO> list = dao.sum();
						PriceDTO dto3 = new PriceDTO();
						for (int i = 1; i <= list.size(); i++) {
							if (i == choice) {
								dto3.setChoice(list.get(i - 1).getChoice());
							}
							if (i - 1 == pt) {
								dto3.setPt(list.get(i - 1).getPt());
							}
						}
						if (cloth == 1) {
							dto3.setClotho(list.get(Integer.parseInt(t1.getText())-1).getClotho());
						} else {
							dto3.setClothx(0);
						}
						if (locker == 1) {
							dto3.setLockero(list.get(Integer.parseInt(t1.getText())-1).getLockero());
						} else {
							dto3.setLockerx(0);
						}
						dto3.setMonth(month);
						dto3.setSum(sum);
						db.insertmonthpri(dto3);
						JOptionPane.showMessageDialog(null, "결제 완료되었습니다.");
						f.dispose();

						if (dto.getChoice() == 1) {
							ShowInfo.t21.setText("1개월");
						} else if (dto.getChoice() == 2) {
							ShowInfo.t21.setText("3개월");
						} else if (dto.getChoice() == 3) {
							ShowInfo.t21.setText("6개월");
						} else if (dto.getChoice() == 4) {
							ShowInfo.t21.setText("12개월");
						}
						// 총 결제금액 출력
						ShowInfo.t22.setText(dto.getSum() + " 원");
						// 옷 신청여부 출력
						if (dto.getCloth() == 1) {
							ShowInfo.t23.setText("O");
						} else {
							ShowInfo.t23.setText("X");
						}
						// 사물함 신청여부 출력
						if (dto.getLocker() == 1) {
							ShowInfo.t24.setText("O");
							ShowInfo.t25.setText("" + dto.getLockernum()); // 사물함 번호 출력
						} else {
							ShowInfo.t24.setText("X");
							ShowInfo.t25.setText("X");
						}
					}

					// memberinfo table에 insert
					MemberinfoDAO dao = new MemberinfoDAO();
					dao.update(dto);
				} catch (NumberFormatException e1) {
				} catch (HeadlessException e1) {
					JOptionPane.showMessageDialog(null, "빈 칸을 입력해주세요");
				}
				// Reference Libraries 등록 !!!!
			}
		});
		btnNewButton_7.setFont(new Font("굴림", Font.PLAIN, 40));
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setBackground(new Color(0, 0, 0));
		btnNewButton_7.setBounds(337, 515, 239, 101);
		f.getContentPane().add(btnNewButton_7);

		JLabel lblNewLabel_5 = new JLabel("사물함 번호:");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(350, 271, 121, 43);
		f.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("회원번호");
		lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(294, 10, 171, 40);
		f.getContentPane().add(lblNewLabel_6);

		number1 = new JTextField(회원번호입력창.number); // setText 값 수정 해야함
		number1.setFont(new Font("굴림", Font.PLAIN, 25));
		number1.setBounds(446, 10, 153, 41);
		f.getContentPane().add(number1);
		number1.setColumns(10);
		number1.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));

		t6 = new JTextField();
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		t6.setColumns(10);
		t6.setBounds(483, 270, 130, 40);
		f.getContentPane().add(t6);
		JLabel lblNewLabel_7 = new JLabel("회원 번호를 인증해 주세요.");
		JButton btnNewButton = new JButton("인증");
		btnNewButton_7.setText("인증");// ====================================== 추가
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (number1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "회원번호를 입력해 주세요.");
				} else {
					String num = number1.getText();
					MemberDAO db = new MemberDAO();
					MemberDTO dto = db.select(num);
					if (dto != null) {
						JOptionPane.showMessageDialog(null, "회원 확인 되었습니다.");
						btnNewButton_7.setText("결제");
						lblNewLabel_7.setText("인증 완료.");
						btnNewButton_7.setEnabled(true);
					} else {
						JOptionPane.showMessageDialog(null, "해당 회원이 없습니다");
						btnNewButton_7.setText("인증");
						btnNewButton_7.setEnabled(false);
						lblNewLabel_7.setText("회원 번호를 인증해 주세요.");
						number1.setText("");
					}
				}
			}
		});
		btnNewButton.setBounds(542, 55, 71, 23);
		f.getContentPane().add(btnNewButton);
		JButton btnNewButton_1 = new JButton("총 금액");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				try {
					ProductDAO dao = new ProductDAO();
					ArrayList<PriceDTO> list = dao.sum();
					for (int i = 1; i <= list.size(); i++) {
						if (i == Integer.parseInt(t1.getText())) {
							a = a + list.get(i - 1).getChoice();
						}
						if (i - 1 == Integer.parseInt(t2.getText())) {
							b = b + list.get(i - 1).getPt();
						}
					}
					if (Integer.parseInt(t3.getText()) == 1) {
						c = c + list.get(Integer.parseInt(t1.getText()) - 1).getLockero();// 수정
					} else {
						c = 0;
					}
					if (Integer.parseInt(t4.getText()) == 1) {
						d = d + list.get(Integer.parseInt(t1.getText()) - 1).getLockero();// 수정
					} else {
						d = 0;
					}
					t5.setText("" + (a + b + c + d));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "전부 선택해 주세요");
				}
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(312, 406, 109, 51);
		f.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_4 = new JLabel("원");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(576, 406, 57, 51);
		f.getContentPane().add(lblNewLabel_4);

		lblNewLabel_7.setBounds(411, 623, 166, 15);
		f.getContentPane().add(lblNewLabel_7);
		f.setVisible(true);
	}
}
