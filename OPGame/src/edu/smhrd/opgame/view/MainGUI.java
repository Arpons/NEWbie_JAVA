package edu.smhrd.opgame.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainGUI extends JFrame{
	private JTextField textField;
	public MainGUI() {
		getContentPane().setLayout(new GridLayout(4, 1, 10, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
	}

	public static void main(String[] args) {
		new MainGUI();

	}

}
