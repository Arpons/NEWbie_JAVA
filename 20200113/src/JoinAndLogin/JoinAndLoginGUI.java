package JoinAndLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JoinAndLoginGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinAndLoginGUI window = new JoinAndLoginGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JoinAndLoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 385, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 346, 215);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_menu_login = new JButton("로그인");
		btn_menu_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGUI login = new LoginGUI();
				frame.dispose();
			}
		});
		btn_menu_login.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btn_menu_login.setBounds(12, 32, 155, 171);
		panel.add(btn_menu_login);
		
		JButton btn_menu_join = new JButton("회원가입");
		btn_menu_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JoinGUI join = new JoinGUI();
				frame.dispose();
			}
		});
		btn_menu_join.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btn_menu_join.setBounds(179, 32, 155, 171);
		panel.add(btn_menu_join);
	}

}
