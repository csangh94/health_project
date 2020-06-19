package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 관리자모드_선택 {

	/**
	 * @wbp.parser.entryPoint
	 */
	public void signIn() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("회원정보조회");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				관리자모드_회원정보조회 sign = new 관리자모드_회원정보조회();
				sign.signIn();
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 40));
		btnNewButton.setBounds(73, 73, 339, 117);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("월별 회계현황");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				관리자모드_월회계정보조회 sign = new 관리자모드_월회계정보조회();
				sign.signIn();
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				MonthPriDTO dto3 = new MonthPriDTO();
//				ArrayList<MonthPriDTO> list = dao.all();
				for (int i = 1; i <= 12; i++) {
					dto.setMonth(i);
					MonthPriDTO dto2 = dao.selectMonth2(dto);
					if (dto2.getMonth() == i) {
						dto3.setMonth(dto.getMonth());
						dto3.setPt(dto2.getPt());
						dto3.setChoice(dto2.getChoice());
						dto3.setCloth(dto2.getCloth());
						dto3.setLocker(dto2.getLocker());
						dto3.setSum(dto2.getSum());
					}
				}
				dao.updatepri(dto3);
			}
		});
		btnNewButton_1.setFont(new Font("휴먼매직체", Font.PLAIN, 40));
		btnNewButton_1.setBounds(73, 261, 339, 117);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}
}
