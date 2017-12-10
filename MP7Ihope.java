import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MP7Class {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MP7Class window = new MP7Class();
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
	public MP7Class() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		int i = 1;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\jh385\\Desktop\\" + i + ".png"));
			}
		});
		btnNewButton.setBounds(0, 0, 149, 93);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(180, 0, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(472, 35, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(48, 132, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(180, 132, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(60, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(162, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\jh385\\Desktop\\" + i + ".png"));
					}
		
		});
		btnNewButton_7.setBounds(300, 69, 143, 122);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(314, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setIcon(new ImageIcon("C:\\Users\\jh385\\Desktop\\2.png"));
			
			btnNewButton_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btnNewButton_9.setIcon(new ImageIcon("C:\\Users\\jh385\\Desktop\\1.png"));
				}
		});
		btnNewButton_9.setBounds(453, 164, 149, 93);
		frame.getContentPane().add(btnNewButton_9);
	}
}
