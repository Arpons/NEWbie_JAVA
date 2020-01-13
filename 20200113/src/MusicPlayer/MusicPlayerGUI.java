package MusicPlayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MusicPlayerGUI {

	private JFrame frame;
	MusicPlayer MusicPlayer = new MusicPlayer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicPlayerGUI window = new MusicPlayerGUI();
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
	public MusicPlayerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(175, 238, 238));
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 452, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 25, 410, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblMusicInfo = new JLabel("Music Info");
		lblMusicInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMusicInfo.setFont(new Font("휴먼매직체", Font.PLAIN, 20));
		panel.add(lblMusicInfo, "name_2181762092836700");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 100, 410, 136);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btn_prePlay = new JButton("❗❗");
		btn_prePlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusicVO temp = MusicPlayer.prePlay();
				if( temp != null) {
					lblMusicInfo.setText(printMusicInfo(temp));
				} else {
					lblMusicInfo.setText("이전 곡이 없습니다.");
				}
			}
		});
		btn_prePlay.setForeground(Color.RED);
		btn_prePlay.setFont(UIManager.getFont("Button.font"));
		panel_1.add(btn_prePlay);
		
		JButton btn_play = new JButton("▶");
		btn_play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusicVO temp = MusicPlayer.play();
				lblMusicInfo.setText(printMusicInfo(temp));
				
			}
		});
		panel_1.add(btn_play);
		
		JButton btn_stop = new JButton("⏹");
		btn_stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMusicInfo.setText("정지 되었습니다.");
				MusicPlayer.stop();
			}
		});
		panel_1.add(btn_stop);
		
		JButton btn_nextPlay = new JButton("❗❓");
		btn_nextPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusicVO temp = MusicPlayer.nextPlay();
				if( temp != null) {
					lblMusicInfo.setText(printMusicInfo(temp));
					
				} else {
					lblMusicInfo.setText("다음곡이 없습니다.");
					
				}
			}
		});
		panel_1.add(btn_nextPlay);
	}
	public static String printMusicInfo(MusicVO temp) {
		return temp.getMusicName() + ", " + temp.getSinger() + ", " + changeTime(temp);
	}

	public static String changeTime(MusicVO temp) {
		return (temp.getPlaytime() / 60)
				+ "분" + (temp.getPlaytime() % 60) + "초";
	}
}
