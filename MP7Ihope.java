import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MP7Class {

	private JFrame frame;
	private JTextField txtLevel;
	private JTextField txtTime;
	private JTextField txtYouLose;
	private JTextField txtYouWin;

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
		frame.setBounds(100, 100, 848, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
        int[] images = new int[25];
        int picked = (int)(1 + Math.random() * 25);
        int count = 0;

        while (count < images.length) {
            int number = (int)(1 + Math.random() * 25);
            
        // found same number, repeat the loop again
        boolean exists = false;
        for (int i = 0; i < count; i++) {
            if (images[i] == number) {
                exists = true;
                break;
            }
        }

        // We didn't find it, so we're good to add it to the array
        if (!exists) {
            images[count++] = number;
        }
    }
		
		JButton button_1 = new JButton("1");
		button_1.setBackground(new Color(240, 240, 240));
		button_1.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[0] + ".png"));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(0 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_1.setBounds(43, 48, 127, 100);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[1] + ".png"));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(1 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_2.setBounds(164, 48, 127, 100);
		frame.getContentPane().add(button_2);
		
		
		JButton button_3 = new JButton("3");
		button_3.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[2] + ".png"));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(2 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_3.setBounds(288, 48, 127, 100);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[3] + ".png"));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(3 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_4.setBounds(412, 48, 127, 100);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[4] + ".png"));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(4 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_5.setBounds(536, 48, 127, 100);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[5] + ".png"));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(5 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_6.setBounds(43, 144, 127, 100);
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("7");
		button_7.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[6] + ".png"));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(6 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_7.setBounds(164, 144, 127, 100);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[7] + ".png"));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(7 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_8.setBounds(288, 144, 127, 100);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[8] + ".png"));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(8 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_9.setBounds(412, 144, 127, 100);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("10");
		button_10.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[9] + ".png"));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(9 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_10.setBounds(536, 144, 127, 100);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("11");
		button_11.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[10] + ".png"));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(10 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_11.setBounds(43, 240, 127, 100);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("12");
		button_12.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[11] + ".png"));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(11 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_12.setBounds(164, 240, 127, 100);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("13");
		button_13.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[12] + ".png"));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(12 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_13.setBounds(288, 240, 127, 100);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("14");
		button_14.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[13] + ".png"));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(13 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_14.setBounds(412, 240, 127, 100);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("15");
		button_15.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[14] + ".png"));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(14 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_15.setBounds(536, 240, 127, 100);
		frame.getContentPane().add(button_15);

		JButton button_16 = new JButton("16");
		button_16.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[15] + ".png"));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(15 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_16.setBounds(43, 334, 127, 100);
		frame.getContentPane().add(button_16);

		JButton button_17 = new JButton("17");
		button_17.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[16] + ".png"));
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(16 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_17.setBounds(164, 334, 127, 100);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("18");
		button_18.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[17] + ".png"));
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(17 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_18.setBounds(288, 334, 127, 100);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("19");
		button_19.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[18] + ".png"));
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(18 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_19.setBounds(412, 334, 127, 100);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("20");
		button_20.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[19] + ".png"));
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(19 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_20.setBounds(536, 334, 127, 100);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("21");
		button_21.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[20] + ".png"));
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(20 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_21.setBounds(43, 428, 127, 100);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("22");
		button_22.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[21] + ".png"));
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(21 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_22.setBounds(164, 428, 127, 100);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("23");
		button_23.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[22] + ".png"));
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(22 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_23.setBounds(288, 428, 127, 100);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("24");
		button_24.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[23] + ".png"));
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(23 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_24.setBounds(412, 428, 127, 100);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("25");
		button_25.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[24] + ".png"));
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(24 == picked) {
					System.out.println("You're CORRECT!!");	
				} else {
					System.out.println("You're WRONG!!");	
				}
			}
		});
		button_25.setBounds(536, 428, 127, 100);
		frame.getContentPane().add(button_25);

		JButton pickedImage = new JButton("pickedImage");
		pickedImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pickedImage.setIcon(new ImageIcon("C:\\Users\\jh385\\git\\MP7\\MP7\\images\\" + images[picked] + ".png"));
		pickedImage.setBounds(684, 260, 127, 100);
		frame.getContentPane().add(pickedImage);
		
		txtLevel = new JTextField();
		txtLevel.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtLevel.setHorizontalAlignment(SwingConstants.CENTER);
		txtLevel.setText("Level:  1");
		txtLevel.setBounds(54, 6, 675, 35);
		frame.getContentPane().add(txtLevel);
		txtLevel.setColumns(10);

		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setText("Time\rLeft: \n10 sec");
		txtTime.setBounds(684, 118, 127, 86);
		frame.getContentPane().add(txtTime);
		txtTime.setColumns(10);
		
		txtYouLose = new JTextField();
		txtYouLose.setForeground(Color.RED);
		txtYouLose.setEnabled(false);
		txtYouLose.setEditable(false);
		txtYouLose.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtYouLose.setHorizontalAlignment(SwingConstants.CENTER);
		txtYouLose.setText(" You LOSE!!!");
		txtYouLose.setBounds(684, 371, 138, 63);
		frame.getContentPane().add(txtYouLose);
		txtYouLose.setColumns(10);
		
		txtYouWin = new JTextField();
		txtYouWin.setEditable(false);
		txtYouWin.setEnabled(false);
		txtYouWin.setText(" You WIN!!!");
		txtYouWin.setHorizontalAlignment(SwingConstants.CENTER);
		txtYouWin.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtYouWin.setColumns(10);
		txtYouWin.setBounds(684, 453, 138, 63);
		frame.getContentPane().add(txtYouWin);
	}
}