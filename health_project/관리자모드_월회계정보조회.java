package 프로젝트;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class 관리자모드_월회계정보조회 {
	JScrollPane scrollPane = null;
	JFrame f = null;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void signIn() {
		f = new JFrame();
		f.setSize(1100, 700);

		JPanel p = new JPanel();
		JButton btnNewButton = new JButton("월별 회계정보조회");
		JButton b1 = new JButton("1월");
		b1.addActionListener(new ActionListener() {
			private JTable table;
			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(1);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b2 = new JButton("2월");
		b2.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(2);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);

			}
		});
		JButton b3 = new JButton("3월");
		b3.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(3);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);

			}
			
		});
		JButton b4 = new JButton("4월");
		b4.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(4);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b5 = new JButton("5월");
		b5.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(5);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b6 = new JButton("6월");
		b6.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(6);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b7 = new JButton("7월");
		b7.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(7);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b8 = new JButton("8월");
		b8.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(8);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b9 = new JButton("9월");
		b9.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(9);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b10 = new JButton("10월");
		b10.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(10);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();
				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b11 = new JButton("11월");
		b11.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(11);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();
				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		JButton b12 = new JButton("12월");
		b12.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				f.remove(scrollPane);
				MonthPriDAO dao = new MonthPriDAO();
				MonthPriDTO dto = new MonthPriDTO();
				dto.setMonth(12);
				MonthPriDTO dto3 = dao.selectMonth(dto);

				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[1][6];
				contents[0][0] = dto3.getMonth();
				contents[0][1] = dto3.getPt();
				contents[0][2] = dto3.getChoice();
				contents[0][3] = dto3.getCloth();
				contents[0][4] = dto3.getLocker();
				contents[0][5] = dto3.getSum();

				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			private JTable table;

			public void actionPerformed(ActionEvent e) {
				MonthPriDAO dao = new MonthPriDAO();
				ArrayList<MonthPriDTO> list = dao.all();
				Object[] title = { "월", "PT", "CHOICE", "CLOTH", "LOCKER", "SUM" };
				Object[][] contents = new Object[list.size()][];
				for (int i = 0; i < list.size(); i++) {
					Object[] row = new Object[6];
							row[0] = list.get(i).getMonth();
							row[1] = list.get(i).getPt();
							row[2] = list.get(i).getChoice();
							row[3] = list.get(i).getCloth();
							row[4] = list.get(i).getLocker();
							row[5] = list.get(i).getSum();
							contents[i] = row;
						

				}
				table = new JTable(contents, title);
				table.setBorder(new LineBorder(Color.BLACK, 1));
				table.setFont(new Font("굴림", Font.BOLD, 15));
				table.setRowHeight(50);
				table.setCellSelectionEnabled(true);
				scrollPane = new JScrollPane(table);
				scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4",
						TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
				f.getContentPane().add(scrollPane, BorderLayout.CENTER);
				f.setVisible(true);
			}
		});
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		btnNewButton.setFont(new Font("휴먼매직체", Font.BOLD, 40));
		f.getContentPane().add(p, BorderLayout.NORTH);
		p.add(btnNewButton);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);

		f.setVisible(true);

	}

}
