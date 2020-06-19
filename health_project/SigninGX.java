package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SigninGX {
	private static JTextField t1;
	private static JTextField t2;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	
	
	public void signin(GxDTO dto, String day, int time, String name) {
		JFrame f = new JFrame();
		f.setSize(399,257);
		f.getContentPane().setLayout(null);
		
		GmDAO dao2 = new GmDAO();
		GmDTO dto2 = new GmDTO();
		dto2.setNum(dto.getNum());
		dto2.setDay(day);
		dto2.setTime(time);
		dto2.setClassname(name);
		
		ArrayList<GmDTO> list = dao2.all(dto2); //dto2에 저장된 day,time,classname과 일치하는 데이터 dto의 list
		int size = list.size(); //개수
		
		JLabel lblNewLabel = new JLabel("프로그램명");
		lblNewLabel.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 17));
		lblNewLabel.setBounds(38, 60, 87, 37);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 17));
		t1.setBounds(127, 60, 214, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		t1.setText(name); //프로그램명 출력
		
		JLabel lblNewLabel_1 = new JLabel("현재 신청인원");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(18, 107, 107, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 17));
		t2.setColumns(10);
		t2.setBounds(127, 107, 107, 37);
		f.getContentPane().add(t2);
		t2.setText(size+"명"); //현재 신청인원 출력
		
		JLabel lblNewLabel_2 = new JLabel("/ 15명");
		lblNewLabel_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(246, 107, 95, 37);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("신청");
		if (size == 15) { //현재 신청인원이 15명인 경우 마감
			btnNewButton.setEnabled(false); //버튼 비활성화
			btnNewButton.setText("신청 마감");
		}
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GxDAO dao = new GxDAO();
				//gx table에서 신청한 요일에 1로 변경
				if (day.equals("mon")) {
					dto.setMon(1);
				}else if (day.equals("tue")) {
					dto.setTue(1);
				}else if (day.equals("wed")) {
					dto.setWed(1);
				}else if (day.equals("thur")) {
					dto.setThur(1);
				}else if (day.equals("fri")) {
					dto.setFri(1);
				}
				dao.update(dto);
				
				//count 변수
				if (size == 0) { //gxmember table에서 일치하는 데이터가 없는 경우, count에 1 저장
					dto2.setCount(1);
				}else { //gxmember table에서 일치하는 데이터가 있으면, count에 마지막번호+1 저장
					dto2.setCount(size+1);
				}
				dao2.insert(dto2); //gxmember table에 입력
				JOptionPane.showMessageDialog(null, "신청이 완료되었습니다.");
				f.dispose();
			}
		});
		btnNewButton.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20));
		btnNewButton.setBounds(156, 156, 86, 52);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("GX 프로그램 신청");
		lblNewLabel_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(112, 16, 173, 30);
		f.getContentPane().add(lblNewLabel_3);
		f.setVisible(true);
	}
}
