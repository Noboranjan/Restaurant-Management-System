import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class Resturant {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	
	
	
	double Firstnum;
	double secondnum;
	double result;
	String operations;
	
	double[] i = new double[5];
	
	double bd_tk = 80.69;
	double indian_rupee = 63.83;
	protected JLabel label_3;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resturant window = new Resturant();
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
	public Resturant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(68, 132, 616, 179);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChickenBurgerMeal.setBounds(29, 28, 166, 31);
		panel.add(lblChickenBurgerMeal);
		
		JLabel label = new JLabel("Chicken Burger Meal");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(29, 70, 166, 31);
		panel.add(label);
		
		JLabel lblCheaseBurgerMeal = new JLabel("Cheese Burger Meal");
		lblCheaseBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCheaseBurgerMeal.setBounds(29, 122, 166, 31);
		panel.add(lblCheaseBurgerMeal);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(248, 28, 166, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(248, 70, 166, 31);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(248, 122, 166, 31);
		panel.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Drinks");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(438, 28, 58, 25);
		panel.add(lblNewLabel_3);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQty.setBounds(531, 28, 58, 25);
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Tea", "Cocacola", "Fanta", "Coffee"}));
		comboBox.setBounds(438, 70, 85, 28);
		panel.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setBounds(531, 70, 58, 28);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Home Delivery");
		chckbxNewCheckBox.setBounds(438, 105, 151, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setBounds(438, 130, 97, 23);
		panel.add(chckbxTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(722, 132, 248, 179);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose One..", "Bangladesh", "India"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(39, 28, 177, 28);
		panel_1.add(comboBox_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(39, 67, 177, 31);
		panel_1.add(textField_5);
		
		JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_3.setBounds(39, 109, 177, 28);
		panel_1.add(label_3);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			double British_Dollar = Double.parseDouble(textField_5.getText());
			if (comboBox_1.getSelectedItem().equals("Bangladesh"))
			{
				String cConvert =String.format("%.2f", British_Dollar * bd_tk);
				label_3.setText(cConvert);
			}
				
			if (comboBox_1.getSelectedItem().equals("India"))
			{
				String cConvert =String.format("%.2f", British_Dollar * indian_rupee);
				label_3.setText(cConvert);
			}
				
			}
		});
		btnNewButton.setBounds(31, 145, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnClose = new JButton("Reset");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				label_3.setText(null);
				textField_5.setText(null);
				comboBox_1.setSelectedItem("Choose One..");
			}
		});
		btnClose.setBounds(130, 145, 89, 23);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(64, 334, 620, 143);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cost of Meal");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 22, 133, 19);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCostOfDrinks.setBounds(32, 61, 133, 19);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfDelevery = new JLabel("Cost of Delivery");
		lblCostOfDelevery.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCostOfDelevery.setBounds(32, 101, 133, 19);
		panel_2.add(lblCostOfDelevery);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(204, 22, 148, 18);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_1.setBounds(204, 61, 148, 18);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_2.setBounds(204, 101, 148, 18);
		panel_2.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(722, 334, 248, 143);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTax.setBounds(10, 23, 75, 19);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubTotal.setBounds(10, 62, 75, 19);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(10, 102, 75, 19);
		panel_3.add(lblTotal);
		
		JLabel label_6 = new JLabel("");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_6.setBounds(118, 103, 108, 18);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_7.setBounds(118, 63, 108, 18);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_8.setBounds(118, 23, 108, 18);
		panel_3.add(label_8);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(1006, 132, 293, 345);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 21, 273, 313);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 248, 263);
		panel_6.add(textArea);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("About Us", null, panel_7, null);
		panel_7.setLayout(null);
		
		JTextArea txtrCreatedByNoboranjan = new JTextArea();
		txtrCreatedByNoboranjan.setText("Created by Noboranjan");
		txtrCreatedByNoboranjan.setBounds(10, 11, 248, 263);
		panel_7.add(txtrCreatedByNoboranjan);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(64, 512, 1235, 101);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Total");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChicBurger = Double.parseDouble(textField.getText());
				double iChicBurger = 120.00;
				double Burger;
				Burger = (ChicBurger * iChicBurger );
				String pMeal = String.format("%.2f", Burger);
				lblNewLabel_2.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(textField_1.getText());
				double iChicBurgerMeal = 279.00;
				double BurgerMeal;
				BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal );
				String cpMeal = String.format("%.2f", BurgerMeal + Burger);
				lblNewLabel_2.setText(cpMeal);
				
				double ChiBurger = Double.parseDouble(textField_2.getText());
				double iChiBurger = 150.00;
				double cBurger;
				cBurger = (ChiBurger * iChiBurger );
				String cMeal = String.format("%.2f", cBurger + BurgerMeal + Burger);
				lblNewLabel_2.setText(cMeal);
				
				double iDelivery = 50.00;
				if (chckbxNewCheckBox.isSelected())
				{
					String pDelivery = String.format("%.2f", iDelivery);
					label_2.setText(pDelivery);
				}
				else
				{
					label_2.setText("0.00");
				}
				
				double Drink = Double.parseDouble(textField_4.getText());
				double Tea =15 * Drink;
			    double Cocacola = 12 * Drink;
			    double Fanta = 18 * Drink;
			    double Coffee = 20 * Drink;
			    
			    if ( comboBox.getSelectedItem().equals("Coffee"))
			    {
			    	String cCoffee = String.format("%.2f", Coffee);
			    	label_1.setText(cCoffee);
			    }
			    if ( comboBox.getSelectedItem().equals("Fanta"))
			    {
			    	String cFanta = String.format("%.2f", Fanta);
			    	label_1.setText(cFanta);
			    }
			    if ( comboBox.getSelectedItem().equals("Cocacola"))
			    {
			    	String cCocacola = String.format("%.2f", Cocacola);
			    	label_1.setText(cCocacola);
			    }
			    if ( comboBox.getSelectedItem().equals("Tea"))
			    {
			    	String cTea = String.format("%.2f", Tea);
			    	label_1.setText(cTea);
			    }
			    if ( comboBox.getSelectedItem().equals("Select a drink"))
			    {
			    	
			    	label_1.setText("0.00");
			    }
			    double ctotal1 = Double.parseDouble(lblNewLabel_2.getText());
			    double ctotal2 = Double.parseDouble(label_1.getText());
			    double ctotal3 = Double.parseDouble(label_2.getText());
			    double AllTotal = (ctotal1 + ctotal2 + ctotal3)/100;
			    if(chckbxTax.isSelected())
			    {
			    	String itotal = String.format("%.2f", AllTotal);
			    	label_8.setText(itotal);
			    	
			    }
			    else
			    {
			    	label_8.setText("0.00");
			    }
			    double ctotal4 = Double.parseDouble(label_8.getText());
			    
			    double subTotal = (ctotal1 + ctotal2 + ctotal3);
			    String isubtotal = String.format("%.2f", subTotal);
			    label_7.setText(isubtotal);
			    
			    double allTotal = (ctotal1 + ctotal2 + ctotal3 + ctotal4);
			    String ialltotal = String.format("%.2f", allTotal);
			    label_6.setText(ialltotal);
			    
			    String itaxtotal = String.format("%.2f", ctotal4);
		    	label_8.setText(itaxtotal);
			    
			}
		});
		btnNewButton_1.setBounds(205, 28, 121, 37);
		panel_5.add(btnNewButton_1);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double Qty1 = Double.parseDouble(textField.getText());
				double Qty2 = Double.parseDouble(textField_1.getText());
				double Qty3 = Double.parseDouble(textField_2.getText());
				
				textArea.append("\n\nChicken Burger:\t" +Qty1 
			    		+ "\nChicken Burger Meal:\t" + Qty2 +
			    		"\nCheese Burger:\t\t" + Qty3);
				
			}
		});
		btnReceipt.setBounds(382, 28, 121, 37);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textArea.setText(null);
				lblNewLabel_2.setText("0.00");
				label_1.setText(null);
				label_2.setText(null);
				label_3.setText(null);
				label_8.setText(null);
				label_7.setText(null);
				label_6.setText(null);
				comboBox.setSelectedItem("Select a drink");
				comboBox_1.setSelectedItem("Choose One..");
				
				
			}
		});
		btnReset.setBounds(559, 28, 121, 37);
		panel_5.add(btnReset);
		
		JButton button_2 = new JButton("Exit");
		button_2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}}); //for exit code
		button_2.setBounds(751, 28, 121, 37);
		panel_5.add(button_2);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel.setBounds(163, 23, 1044, 79);
		frame.getContentPane().add(lblNewLabel);
	}
}
