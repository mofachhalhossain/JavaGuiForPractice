import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class component1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel ans_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					component1 window = new component1();
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
	public component1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 153));
		frame.setBounds(100, 100, 489, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(81, 97, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField_1 = new JTextField();
		textField_1.setBounds(319, 97, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setBounds(81, 50, 86, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second Number");
		lblNewLabel_1.setBounds(319, 46, 101, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double first_digit = Double.parseDouble(textField.getText());
				double second_digit = Double.parseDouble(textField_1.getText());
				
				double result = first_digit + second_digit;
			
				
				textField_2.setText(Double.toString(result));
				ans_3.setText(Double.toString(result));
				
				
			}
		});
		btnNewButton.setBackground(new Color(0, 204, 255));
		btnNewButton.setBounds(197, 109, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtruction");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double first_digit = Double.parseDouble(textField.getText());
				double second_digit = Double.parseDouble(textField_1.getText());
				
				double result = first_digit - second_digit;
			
				
				textField_2.setText(Double.toString(result));
				ans_3.setText(Double.toString(result));
				
			}
		});
		btnNewButton_1.setBackground(new Color(0, 204, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.setBounds(197, 153, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplication");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double first_digit = Double.parseDouble(textField.getText());
				double second_digit = Double.parseDouble(textField_1.getText());
				
				double result = first_digit * second_digit;
			
				
				textField_2.setText(Double.toString(result));
				ans_3.setText(Double.toString(result));
				
			}
		});
		btnNewButton_2.setBackground(new Color(0, 204, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2.setBounds(197, 197, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Devision");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double first_digit = Double.parseDouble(textField.getText());
				double second_digit = Double.parseDouble(textField_1.getText());
				
				double result = first_digit / second_digit;
			
				
				textField_2.setText(Double.toString(result));
				ans_3.setText(Double.toString(result));
				
				
			}
		});
		btnNewButton_3.setBackground(new Color(0, 204, 255));
		btnNewButton_3.setBounds(197, 240, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(215, 11, 68, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 41, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		ans_3 = new JLabel("Answer");
		ans_3.setBounds(215, 72, 46, 14);
		frame.getContentPane().add(ans_3);
		
	}
}
