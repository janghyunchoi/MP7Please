package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MP7Ihope {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MP7Ihope window = new MP7Ihope();
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
	public MP7Ihope() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 848, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVi = new JButton("vi");
		btnVi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("TEST");
			}
		});
		btnVi.setBounds(43, 48, 127, 100);
		frame.getContentPane().add(btnVi);
		
		JButton button = new JButton("vi");
		button.setBounds(43, 144, 127, 100);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("vi");
		button_1.setBounds(43, 240, 127, 100);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("vi");
		button_2.setBounds(43, 334, 127, 100);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("vi");
		button_3.setBounds(164, 48, 127, 100);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("vi");
		button_4.setBounds(288, 48, 127, 100);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("vi");
		button_5.setBounds(412, 48, 127, 100);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("vi");
		button_6.setBounds(536, 48, 127, 100);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("vi");
		button_7.setBounds(536, 144, 127, 100);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("vi");
		button_8.setBounds(536, 240, 127, 100);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("vi");
		button_9.setBounds(43, 428, 127, 100);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("vi");
		button_10.setBounds(164, 428, 127, 100);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("vi");
		button_11.setBounds(288, 428, 127, 100);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("vi");
		button_12.setBounds(412, 428, 127, 100);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("vi");
		button_13.setBounds(536, 428, 127, 100);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("vi");
		button_14.setBounds(536, 334, 127, 100);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("vi");
		button_15.setBounds(164, 144, 127, 100);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("vi");
		button_16.setBounds(288, 144, 127, 100);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("vi");
		button_17.setBounds(412, 144, 127, 100);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("vi");
		button_18.setBounds(164, 240, 127, 100);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("vi");
		button_19.setBounds(288, 240, 127, 100);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("vi");
		button_20.setBounds(412, 240, 127, 100);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("vi");
		button_21.setBounds(164, 334, 127, 100);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("vi");
		button_22.setBounds(288, 334, 127, 100);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("vi");
		button_23.setBounds(412, 334, 127, 100);
		frame.getContentPane().add(button_23);
		
		textField = new JTextField();
		textField.setBounds(54, 6, 675, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_24 = new JButton("vi");
		button_24.setBounds(704, 260, 127, 100);
		frame.getContentPane().add(button_24);
		
		textField_1 = new JTextField();
		textField_1.setBounds(701, 122, 127, 106);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(704, 397, 138, 128);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
