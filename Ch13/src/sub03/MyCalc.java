package sub03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalc {

	private JFrame frmMyclacV;
	private JTextField txtDsp;
	
	private int num1 =0;
	private int num2 =0;
	private int operator =0; //1: plus, 2: minus, 3: plus 4: div

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMyclacV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyclacV = new JFrame();
		frmMyclacV.setTitle("MyClac v1.0");
		frmMyclacV.setBounds(100, 100, 305, 369);
		frmMyclacV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyclacV.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setBackground(new Color(255, 255, 255));
		txtDsp.setEditable(false);
		txtDsp.setFont(new Font("굴림", Font.PLAIN, 24));
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 249, 50);
		frmMyclacV.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		
		
		
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(28, 90, 44, 44);
		frmMyclacV.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(84, 90, 44, 44);
		frmMyclacV.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(140, 90, 44, 44);
		frmMyclacV.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(196, 90, 44, 44);
		frmMyclacV.getContentPane().add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(28, 137, 44, 44);
		frmMyclacV.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(84, 137, 44, 44);
		frmMyclacV.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBounds(140, 137, 44, 44);
		frmMyclacV.getContentPane().add(btn6);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(196, 137, 44, 44);
		frmMyclacV.getContentPane().add(btnMulti);
		
		
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtDsp.setText("1");
				num1 = 1;
			}
		});
		btn1.setBounds(28, 185, 44, 44);
		frmMyclacV.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2=2;
			}
		});
		btn2.setBounds(84, 185, 44, 44);
		frmMyclacV.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(140, 185, 44, 44);
		frmMyclacV.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(196, 185, 44, 44);
		frmMyclacV.getContentPane().add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(28, 232, 44, 44);
		frmMyclacV.getContentPane().add(btn0);
		
		JButton btnCancle = new JButton("C");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancle.setBounds(84, 232, 44, 44);
		frmMyclacV.getContentPane().add(btnCancle);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
				
				if(operator==1) {
					result =num1+num2;
				}else if(operator ==2) {
					result =num1-num2;
				}else if(operator ==3) {
					result =num1*num2;
				}else if(operator ==4) {
					result =num1/num2;
				}
						
				txtDsp.setText(""+result);
			}
		});
		btnEq.setBounds(140, 232, 44, 44);
		frmMyclacV.getContentPane().add(btnEq);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operator = 1;
				
			}
		});
		btnPlus.setBounds(196, 232, 44, 44);
		frmMyclacV.getContentPane().add(btnPlus);
	}

}
