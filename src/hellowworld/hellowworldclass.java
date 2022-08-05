package hellowworld;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class hellowworldclass {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	String[] currencyUnits = {
			"Units",
			"US Dollar",
			"Nigerian Naira",
			"Brazilian Real",
			"Canadian Dollar",
			"Kenyan Shilling",
			"Indonesian Rupiah",
			"Indian Rupee",
			"Philippine Pisco",
			"Paskistani Rupee"
			};
	double US_Dollar = 1.31;
	double Nigerian_Naira = 476.57;
	double Brazilian_Real = 5.47;
	double Canadian_Dollar = 1.71;
	double Kenyan_Shilling = 132.53;
	double Indonesian_Rupiah = 19554.94;
	double Indian_Rupee = 95.21;
	double Philippine_Pisco = 71.17;
	double Pakistani_Rupee = 162.74;
	private JLabel firstCurrencyUnit;
	private JLabel secondCurrencyUnit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hellowworldclass window = new hellowworldclass();
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
	public hellowworldclass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1111, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(331, 22, 385, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox firstCountry = new JComboBox();
		firstCountry.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int position=firstCountry.getSelectedIndex();
				firstCurrencyUnit.setText(currencyUnits[position]);
			}
		});
		firstCountry.setModel(new DefaultComboBoxModel(new String[] {"Choose one", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan"}));
		firstCountry.setToolTipText("");
		firstCountry.setFont(new Font("Tahoma", Font.BOLD, 18));
		firstCountry.setBounds(106, 250, 260, 46);
		frame.getContentPane().add(firstCountry);
		
		JComboBox secondCountry = new JComboBox();
		secondCountry.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					int position=secondCountry.getSelectedIndex();
					secondCurrencyUnit.setText(currencyUnits[position]);
			}
		});
		secondCountry.setModel(new DefaultComboBoxModel(new String[] {"Choose one", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan"}));
		secondCountry.setFont(new Font("Tahoma", Font.BOLD, 18));
		secondCountry.setBounds(656, 250, 260, 46);
		frame.getContentPane().add(secondCountry);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 18));
		t1.setBounds(106, 326, 260, 46);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 18));
		t2.setBounds(656, 326, 260, 46);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("From Currency of");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(109, 201, 257, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To Currency of");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(660, 201, 256, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		firstCurrencyUnit = new JLabel("Units");
		firstCurrencyUnit.setHorizontalAlignment(SwingConstants.RIGHT);
		firstCurrencyUnit.setFont(new Font("Tahoma", Font.BOLD, 18));
		firstCurrencyUnit.setBounds(106, 400, 260, 27);
		frame.getContentPane().add(firstCurrencyUnit);
		
		secondCurrencyUnit = new JLabel("Units");
		secondCurrencyUnit.setHorizontalAlignment(SwingConstants.RIGHT);
		secondCurrencyUnit.setFont(new Font("Tahoma", Font.BOLD, 18));
		secondCurrencyUnit.setBounds(656, 400, 260, 27);
		frame.getContentPane().add(secondCurrencyUnit);
		
		JButton btnNewButton = new JButton("Convert Currency");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double amountToChange=Double.parseDouble(t1.getText());
		        double amountChanged=0.0;
		        double amountInPounds=0.0;
		        
		      switch(firstCountry.getSelectedItem().toString())
		        {
		        case "USA": amountInPounds = amountToChange/US_Dollar;break;
			case "Nigeria":amountInPounds = amountToChange/Nigerian_Naira;break;
			case "Brazil":amountInPounds = amountToChange/Brazilian_Real;break;
			case "Canada":amountInPounds = amountToChange/Canadian_Dollar;break;
			case "Kenyan":amountInPounds = amountToChange/Kenyan_Shilling;break;
			case "Indonesia":amountInPounds = amountToChange/Indonesian_Rupiah;break;
			case "India":amountInPounds = amountToChange/Indian_Rupee;break;
			case "Philippine":amountInPounds = amountToChange/Philippine_Pisco;break;
			case "Pakistan":amountInPounds = amountToChange/Pakistani_Rupee;break;
			default:amountInPounds = 0.0;
		        }

		        //amount is Changed in pounds
		        
		        switch(secondCountry.getSelectedItem().toString())
		        {
		        case "USA":amountChanged = amountInPounds * US_Dollar;break;
			case "Nigeria":amountChanged = amountInPounds * Nigerian_Naira;break;
			case "Brazil":amountChanged = amountInPounds * Brazilian_Real;break;
			case "Canada":amountChanged = amountInPounds * Canadian_Dollar;break;
			case "Kenyan":amountChanged = amountInPounds * Kenyan_Shilling;break;
			case "Indonesia":amountChanged = amountInPounds * Indonesian_Rupiah;break;
			case "India":amountChanged = amountInPounds * Indian_Rupee;break;
			case "Philippine":amountChanged = amountInPounds * Philippine_Pisco;break;
			case "Pakistan":amountChanged = amountInPounds * Pakistani_Rupee;break;
			default:amountChanged = amountInPounds * 0.0;
		        }
		        
		        String value = String.format("%.2f",amountChanged);
		         
		        t2.setText(value);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(46, 557, 220, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstCountry.setSelectedIndex(0);
		        secondCountry.setSelectedIndex(0);
		        t1.setText("");
		        t2.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(458, 623, 152, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(816, 557, 143, 46);
		frame.getContentPane().add(btnNewButton_2);
	}
}
