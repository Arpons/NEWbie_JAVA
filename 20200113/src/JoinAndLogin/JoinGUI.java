package JoinAndLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JoinGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public JoinGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 10, 447, 72);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_join = new JLabel("회원가입");
		lbl_join.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_join.setBounds(125, 10, 155, 42);
		lbl_join.setFont(new Font("HY엽서M", Font.PLAIN, 30));
		panel.add(lbl_join);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 92, 447, 270);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbl_id = new JLabel("아이디 : ");
		lbl_id.setBounds(115, 3, 75, 24);
		lbl_id.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		panel_2.add(lbl_id);
		
		textField = new JTextField();
		textField.setBounds(196, 8, 196, 22);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lbl_pw = new JLabel("비밀번호 : ");
		lbl_pw.setBounds(97, 3, 91, 24);
		lbl_pw.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		panel_3.add(lbl_pw);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 8, 196, 22);
		textField_1.setColumns(10);
		panel_3.add(textField_1);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lbl_pw2 = new JLabel("비밀번호 확인 : ");
		lbl_pw2.setBounds(53, 3, 134, 24);
		lbl_pw2.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		panel_4.add(lbl_pw2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(196, 8, 196, 22);
		textField_2.setColumns(10);
		panel_4.add(textField_2);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lbl_name = new JLabel("이름 : ");
		lbl_name.setBounds(133, 5, 59, 24);
		lbl_name.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		panel_5.add(lbl_name);
		
		textField_3 = new JTextField();
		textField_3.setBounds(196, 8, 196, 22);
		textField_3.setColumns(10);
		panel_5.add(textField_3);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lbl_age = new JLabel("나이 : ");
		lbl_age.setBounds(133, 5, 59, 24);
		lbl_age.setFont(new Font("휴먼모음T", Font.PLAIN, 20));
		panel_6.add(lbl_age);
		
		textField_4 = new JTextField();
		textField_4.setBounds(197, 6, 196, 22);
		textField_4.setColumns(10);
		panel_6.add(textField_4);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(65, 10, 97, 23);
		panel_7.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("닫기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JoinAndLoginGUI.main(null);
			}
		});
		btnNewButton_1.setBounds(278, 12, 97, 23);
		panel_7.add(btnNewButton_1);
	}
}
