package JoinAndLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI {

	private JFrame frame;
	private JTextField textField_login_id;
	private JTextField textField_login_pw;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel lbl_login = new JPanel();
		lbl_login.setBounds(59, 38, 308, 77);
		frame.getContentPane().add(lbl_login);
		lbl_login.setLayout(null);
		
		JLabel label = new JLabel("로그인");
		label.setFont(new Font("굴림", Font.PLAIN, 35));
		label.setBounds(92, 20, 131, 35);
		lbl_login.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(59, 125, 308, 99);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_id = new JLabel("ID : ");
		lbl_id.setBounds(33, 24, 57, 15);
		panel_1.add(lbl_id);
		
		textField_login_id = new JTextField();
		textField_login_id.setBounds(65, 21, 116, 21);
		panel_1.add(textField_login_id);
		textField_login_id.setColumns(10);
		
		JButton btn_login = new JButton("로그인");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_login_id.getText();
				String pw = textField_login_pw.getText();
				System.out.println(id + "," + pw);
				MemberDAO DAO = new MemberDAO();
				String name = DAO.login_select(id,pw);
				if (name != "") {
					JOptionPane.showMessageDialog(null, name + " 님 환영합니다.");
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패", "로그인", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btn_login.setBounds(193, 20, 97, 23);
		panel_1.add(btn_login);
		
		JLabel lbl_pw = new JLabel("PW : ");
		lbl_pw.setBounds(33, 53, 57, 15);
		panel_1.add(lbl_pw);
		
		textField_login_pw = new JTextField();
		textField_login_pw.setColumns(10);
		textField_login_pw.setBounds(65, 50, 116, 21);
		panel_1.add(textField_login_pw);
		
		JButton btn_close = new JButton("닫기");
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				JoinAndLoginGUI.main(null);
			}
		});
		btn_close.setBounds(193, 49, 97, 23);
		panel_1.add(btn_close);
	}

}
