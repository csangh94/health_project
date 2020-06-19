package 프로젝트;

// MemberDAO에서 경로변경만 하면됨.
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class 관리자모드_회원정보조회 {
    private static JTable table;
    private static JScrollPane scrollPane; 

    /**
     * @wbp.parser.entryPoint
     */
    public void signIn() {
        JFrame f = new JFrame();
        
        f.setSize(1000, 920);
        
        JButton btnNewButton = new JButton("헬스장 회원목록");
        btnNewButton.setBackground(Color.GREEN);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MemberinfoDAO dao = new MemberinfoDAO();
                ArrayList<MemberinfoDTO> list = dao.all();
                Object[] title = {"회원번호", "이름	", "생년월일", 
                		"연락처", "성별", "이용권", "PT", 
                		"Cloth", "Locker"};
                Object[][] contents = new Object[list.size()][];
                for (int i = 0; i < list.size(); i++) {
                    MemberinfoDTO dto = list.get(i);
                    Object[] row = new Object[10];
                    row[0] = dto.getNum();
                    row[1] = dto.getName();
                    row[2] = dto.getBd();
                    row[3] = dto.getPhone();
                    row[4] = dto.getGender();
                    row[5] = dto.getChoice();
                    row[6] = dto.getPt();
                    row[7] = dto.getCloth();
                    row[8] = dto.getLocker();
                    contents[i] = row;
                }
                table = new JTable(contents, title);    
                table.setBorder(new LineBorder(Color.BLACK, 1));
                table.setFont(new Font("굴림", Font.BOLD, 15));
                table.setRowHeight(50);
                table.setCellSelectionEnabled(true);
                scrollPane = new JScrollPane(table);
                scrollPane.setViewportBorder(new TitledBorder(null, "\uD68C\uC6D0\uC815\uBCF4\uB4E4", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
                f.getContentPane().add(scrollPane, BorderLayout.CENTER);
                f.setVisible(true);
            }
        });
        btnNewButton.setFont(new Font("휴먼매직체", Font.BOLD, 40));
        f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
        
        
        f.setVisible(true);
    }

}