package 프로젝트;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Lock {
String ss; //gettext 를 저장하기 위한 값
	/**
	 * @wbp.parser.entryPoint
	 */
	public void samool() {
		JFrame f = new JFrame();
		f.setTitle("사물함 신청");
		f.setSize(1000,800);
		f.getContentPane().setLayout(null);
		GridLayout grid = new GridLayout(11,0);
		f.getContentPane().setLayout(grid);
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = dao.lock();
		for (int i = 1; i <= 100; i++) {
			JButton t = new JButton(i+ "");
			f.getContentPane().add(t);
			t.setBackground(Color.DARK_GRAY);
			for (int j = 0; j < list.size(); j++) {
				ProductDTO dto = list.get(j);
				if (i == dto.getLockernum()) {
					t.setBackground(new Color(139, 69, 19));
					t.setForeground(Color.yellow);
					t.setEnabled(false);
				}
			}
			
			t.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					t.setBackground(new Color(139, 69, 19));
					t.setForeground(Color.yellow);
					ss = t.getText();
					PayMent.t6.setText(ss);
					f.dispose();
				}
			});
		}
		
		JButton btnNewButton = new JButton("사용 중");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setEnabled(false);
		btnNewButton.setBackground(new Color(139, 69, 19));
		btnNewButton.setBounds(0, 0, 135, 56);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("사용 가능");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(133, 0, 135, 56);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		f.setVisible(true);
	}

}
