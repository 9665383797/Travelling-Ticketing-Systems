import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Travelling {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
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
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(44, 30, 1065, 101);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticketing Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(373, 11, 659, 67);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(39, 142, 151, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnStandard.setBounds(44, 196, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		final JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnEconomy.setBounds(44, 232, 109, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		final JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFirstClass.setBounds(44, 269, 109, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		final JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnReturnTicket.setBounds(155, 234, 143, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		final JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnSingleTicket.setBounds(155, 196, 143, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		final JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAdult.setBounds(300, 196, 75, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		 final JRadioButton rdbtnChild = new JRadioButton("Child");
		 rdbtnChild.setToolTipText("Exit");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnChild.setBounds(300, 232, 109, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 181, 381, 15);
		frame.getContentPane().add(separator);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Pune", "satara", "mumbai", "Beed","Ghargaon"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(159, 272, 216, 28);
		frame.getContentPane().add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 328, 381, 15);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(44, 349, 96, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SubTotal");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(44, 386, 109, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(136, 354, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 394, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(44, 445, 63, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 451, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(28, 484, 381, 15);
		frame.getContentPane().add(separator_2);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double tax=19.50;

				double Milesk8=25.78;
				double Milesk12=25.10;
				double Milesk20=45.23;
				double Milesk30=55.98;
				double totalCost,eco=3.85,fclass=5.60;
				
				if((rdbtnStandard.isSelected()&&(rdbtnSingleTicket.isSelected()&&
						(rdbtnAdult.isSelected()&&comboBox.getSelectedItem().equals(" ")))))
				{
					totalCost=(tax * Milesk8)/100;
					String Tax=String.format("$%.2f",totalCost);
					textField.setText(Tax);
					String subTotal=String.format("$%.2f",Milesk8);
					textField_1.setText(subTotal);
					String Total=String.format("$%.2f",Milesk8+totalCost);
					
					textField_2.setText(Total);
							
					
					
					textField_12.setText(Total);
					textField_3.setText("  STD");
					textField_4.setText("ONE WAY");
					textField_5.setText("ONE");
				textField_6.setText("NIL");
					
				}
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			//*******************************Time****************************//	
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				textField_9.setText(tTime.format(timer.getTime()));
				
				
				//**************************Date********************************//
				SimpleDateFormat Tdate=new SimpleDateFormat("mm:dd:yyyy");
				textField_10.setText(Tdate.format(timer.getTime()));
				textField_7.setText("Maharashtra*");
				textField_8.setText((String)comboBox.getSelectedItem()+"* ");
				
				
				//*************************Random Number Generator**********************//
				int num1;
				String s1="";
				num1=1325+(int)(Math.random()*4238);
				s1 +=num1+1325;
				textField_11.setText(s1);
				//****************************************
				textField_13.setText("Any");
				
			}
		});
		btnNewButton.setToolTipText("Total Cost of Ticket");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(38, 510, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setToolTipText("Reset System");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				comboBox.setSelectedItem("Distination");
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				
				
				

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(175, 510, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Ticketing System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(296, 510, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(453, 142, 22, 391);
		frame.getContentPane().add(separator_3);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClass.setBounds(485, 166, 109, 33);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTicket.setBounds(623, 163, 109, 33);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdult.setBounds(775, 163, 109, 33);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChild.setBounds(953, 166, 109, 33);
		frame.getContentPane().add(lblChild);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(479, 216, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(611, 216, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(768, 216, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(953, 216, 86, 20);
		frame.getContentPane().add(textField_6);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(485, 272, 592, 15);
		frame.getContentPane().add(separator_4);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFrom.setBounds(473, 328, 109, 33);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTo.setBounds(473, 409, 109, 33);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(473, 466, 109, 33);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(473, 516, 109, 33);
		frame.getContentPane().add(lblTime);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(592, 336, 86, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(592, 417, 86, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(592, 474, 86, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(592, 524, 86, 20);
		frame.getContentPane().add(textField_10);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(710, 272, 22, 326);
		frame.getContentPane().add(separator_5);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTicketNo.setBounds(745, 328, 109, 33);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrice.setBounds(745, 409, 109, 33);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRoute.setBounds(742, 500, 109, 33);
		frame.getContentPane().add(lblRoute);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(851, 336, 86, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(851, 417, 86, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(851, 508, 86, 20);
		frame.getContentPane().add(textField_13);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(1072, 129, 22, 469);
		frame.getContentPane().add(separator_6);
	}
}
