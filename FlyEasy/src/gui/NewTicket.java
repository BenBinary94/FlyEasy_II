package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

import fachlogik.Flug;

import java.awt.Button;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewTicket extends JFrame {

	private JPanel contentPane;
	JLabel lblFlug;
	JLabel lblPreis;
	JCheckBox chckbxEconomy;
	JCheckBox chckbxFirst;
	JCheckBox chckbxBusinessClass;
	JLabel lblSeat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewTicket frame = new NewTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public NewTicket(Flug flug) {
		
		this();
		
		
		lblFlug.setText("Flug: " + flug.getOrigin().toString() + " nach " + flug.getDestination().toString());
	}
	
	
	public NewTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 0};
		gbl_contentPane.rowHeights = new int[]{47, 0, 47, 0, 0, 47, 47, 0, 0, 0, 47, 47, 47, 47, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		contentPane.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 0;
		contentPane.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 0;
		contentPane.add(label_2, gbc_label_2);
		
		JLabel label_3 = new JLabel("");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.BOTH;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 4;
		gbc_label_3.gridy = 0;
		contentPane.add(label_3, gbc_label_3);
		
		JLabel label_4 = new JLabel("");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.BOTH;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 5;
		gbc_label_4.gridy = 0;
		contentPane.add(label_4, gbc_label_4);
		
		JLabel label_5 = new JLabel("");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.fill = GridBagConstraints.BOTH;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 6;
		gbc_label_5.gridy = 0;
		contentPane.add(label_5, gbc_label_5);
		
		JLabel label_6 = new JLabel("");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.fill = GridBagConstraints.BOTH;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 7;
		gbc_label_6.gridy = 0;
		contentPane.add(label_6, gbc_label_6);
		
		JLabel label_7 = new JLabel("");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.BOTH;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 8;
		gbc_label_7.gridy = 0;
		contentPane.add(label_7, gbc_label_7);
		
		JLabel label_8 = new JLabel("");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.BOTH;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 9;
		gbc_label_8.gridy = 0;
		contentPane.add(label_8, gbc_label_8);
		
		JLabel label_9 = new JLabel("");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.fill = GridBagConstraints.BOTH;
		gbc_label_9.insets = new Insets(0, 0, 5, 0);
		gbc_label_9.gridx = 10;
		gbc_label_9.gridy = 0;
		contentPane.add(label_9, gbc_label_9);
		
		JLabel lblAircraftType = new JLabel("AIRBUS A320-200");
		lblAircraftType.setFont(new Font("Tahoma", Font.PLAIN, 37));
		GridBagConstraints gbc_lblAircraftType = new GridBagConstraints();
		gbc_lblAircraftType.gridwidth = 8;
		gbc_lblAircraftType.anchor = GridBagConstraints.WEST;
		gbc_lblAircraftType.insets = new Insets(0, 0, 5, 5);
		gbc_lblAircraftType.gridx = 2;
		gbc_lblAircraftType.gridy = 1;
		contentPane.add(lblAircraftType, gbc_lblAircraftType);
		
		JLabel label_10 = new JLabel("");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.fill = GridBagConstraints.BOTH;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 2;
		contentPane.add(label_10, gbc_label_10);
		
		JLabel label_12 = new JLabel("");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.fill = GridBagConstraints.BOTH;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 2;
		gbc_label_12.gridy = 2;
		contentPane.add(label_12, gbc_label_12);
		
		JLabel label_13 = new JLabel("");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.fill = GridBagConstraints.BOTH;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 3;
		gbc_label_13.gridy = 2;
		contentPane.add(label_13, gbc_label_13);
		
		JLabel label_14 = new JLabel("");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.fill = GridBagConstraints.BOTH;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 4;
		gbc_label_14.gridy = 2;
		contentPane.add(label_14, gbc_label_14);
		
		JLabel label_15 = new JLabel("");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.fill = GridBagConstraints.BOTH;
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 5;
		gbc_label_15.gridy = 2;
		contentPane.add(label_15, gbc_label_15);
		
		JLabel label_16 = new JLabel("");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.fill = GridBagConstraints.BOTH;
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 6;
		gbc_label_16.gridy = 2;
		contentPane.add(label_16, gbc_label_16);
		
		JLabel label_17 = new JLabel("");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.fill = GridBagConstraints.BOTH;
		gbc_label_17.insets = new Insets(0, 0, 5, 5);
		gbc_label_17.gridx = 7;
		gbc_label_17.gridy = 2;
		contentPane.add(label_17, gbc_label_17);
		
		JLabel label_18 = new JLabel("");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.fill = GridBagConstraints.BOTH;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 8;
		gbc_label_18.gridy = 2;
		contentPane.add(label_18, gbc_label_18);
		
		JLabel label_19 = new JLabel("");
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.fill = GridBagConstraints.BOTH;
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 9;
		gbc_label_19.gridy = 2;
		contentPane.add(label_19, gbc_label_19);
		
		JLabel label_20 = new JLabel("");
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.fill = GridBagConstraints.BOTH;
		gbc_label_20.insets = new Insets(0, 0, 5, 0);
		gbc_label_20.gridx = 10;
		gbc_label_20.gridy = 2;
		contentPane.add(label_20, gbc_label_20);
		
		JLabel lblBusiness = new JLabel("FIRST CLASS");
		GridBagConstraints gbc_lblBusiness = new GridBagConstraints();
		gbc_lblBusiness.gridwidth = 5;
		gbc_lblBusiness.insets = new Insets(0, 0, 5, 5);
		gbc_lblBusiness.gridx = 3;
		gbc_lblBusiness.gridy = 3;
		contentPane.add(lblBusiness, gbc_lblBusiness);
		
		JLabel label_21 = new JLabel("");
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.fill = GridBagConstraints.BOTH;
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 1;
		gbc_label_21.gridy = 5;
		contentPane.add(label_21, gbc_label_21);
		
		JLabel label_11 = new JLabel("");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.fill = GridBagConstraints.BOTH;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 2;
		gbc_label_11.gridy = 5;
		contentPane.add(label_11, gbc_label_11);
		
		Button btn_F_1_1 = new Button("X");

		btn_F_1_1.setBackground(Color.GREEN);
		GridBagConstraints gbc_btn_F_1_1 = new GridBagConstraints();
		gbc_btn_F_1_1.fill = GridBagConstraints.BOTH;
		gbc_btn_F_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn_F_1_1.gridx = 3;
		gbc_btn_F_1_1.gridy = 5;
		contentPane.add(btn_F_1_1, gbc_btn_F_1_1);
		
		Button btn_F_1_2 = new Button("X");
		btn_F_1_2.setBackground(Color.GREEN);
		GridBagConstraints gbc_btn_F_1_2 = new GridBagConstraints();
		gbc_btn_F_1_2.fill = GridBagConstraints.BOTH;
		gbc_btn_F_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn_F_1_2.gridx = 4;
		gbc_btn_F_1_2.gridy = 5;
		contentPane.add(btn_F_1_2, gbc_btn_F_1_2);
		
		JLabel label_22 = new JLabel("");
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.fill = GridBagConstraints.BOTH;
		gbc_label_22.insets = new Insets(0, 0, 5, 5);
		gbc_label_22.gridx = 5;
		gbc_label_22.gridy = 5;
		contentPane.add(label_22, gbc_label_22);
		
		Button btn_F_1_3 = new Button("X");
		btn_F_1_3.setBackground(Color.GREEN);
		GridBagConstraints gbc_btn_F_1_3 = new GridBagConstraints();
		gbc_btn_F_1_3.fill = GridBagConstraints.BOTH;
		gbc_btn_F_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn_F_1_3.gridx = 6;
		gbc_btn_F_1_3.gridy = 5;
		contentPane.add(btn_F_1_3, gbc_btn_F_1_3);
		
		Button btn_F_1_4 = new Button("X");
		btn_F_1_4.setBackground(Color.GREEN);
		GridBagConstraints gbc_btn_F_1_4 = new GridBagConstraints();
		gbc_btn_F_1_4.fill = GridBagConstraints.BOTH;
		gbc_btn_F_1_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn_F_1_4.gridx = 7;
		gbc_btn_F_1_4.gridy = 5;
		contentPane.add(btn_F_1_4, gbc_btn_F_1_4);
		
		JLabel label_23 = new JLabel("");
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.fill = GridBagConstraints.BOTH;
		gbc_label_23.insets = new Insets(0, 0, 5, 5);
		gbc_label_23.gridx = 8;
		gbc_label_23.gridy = 5;
		contentPane.add(label_23, gbc_label_23);
		
		chckbxEconomy = new JCheckBox("Economy");
		GridBagConstraints gbc_chckbxEconomy = new GridBagConstraints();
		gbc_chckbxEconomy.fill = GridBagConstraints.BOTH;
		gbc_chckbxEconomy.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxEconomy.gridx = 9;
		gbc_chckbxEconomy.gridy = 5;
		contentPane.add(chckbxEconomy, gbc_chckbxEconomy);
		
		JLabel label_24 = new JLabel("");
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.fill = GridBagConstraints.BOTH;
		gbc_label_24.insets = new Insets(0, 0, 5, 0);
		gbc_label_24.gridx = 10;
		gbc_label_24.gridy = 5;
		contentPane.add(label_24, gbc_label_24);
		
		JLabel label_25 = new JLabel("");
		GridBagConstraints gbc_label_25 = new GridBagConstraints();
		gbc_label_25.fill = GridBagConstraints.BOTH;
		gbc_label_25.insets = new Insets(0, 0, 5, 5);
		gbc_label_25.gridx = 1;
		gbc_label_25.gridy = 6;
		contentPane.add(label_25, gbc_label_25);
		
		JLabel label_26 = new JLabel("");
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.fill = GridBagConstraints.BOTH;
		gbc_label_26.insets = new Insets(0, 0, 5, 5);
		gbc_label_26.gridx = 2;
		gbc_label_26.gridy = 6;
		contentPane.add(label_26, gbc_label_26);
		
		Button btn_F_2_1 = new Button("X");
		btn_F_2_1.setBackground(Color.GREEN);
		GridBagConstraints gbc_btn_F_2_1 = new GridBagConstraints();
		gbc_btn_F_2_1.fill = GridBagConstraints.BOTH;
		gbc_btn_F_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn_F_2_1.gridx = 3;
		gbc_btn_F_2_1.gridy = 6;
		contentPane.add(btn_F_2_1, gbc_btn_F_2_1);
		
		Button btn_F_2_2 = new Button("X");
		btn_F_2_2.setBackground(Color.GREEN);
		GridBagConstraints gbc_btn_F_2_2 = new GridBagConstraints();
		gbc_btn_F_2_2.fill = GridBagConstraints.BOTH;
		gbc_btn_F_2_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn_F_2_2.gridx = 4;
		gbc_btn_F_2_2.gridy = 6;
		contentPane.add(btn_F_2_2, gbc_btn_F_2_2);
		
		JLabel label_27 = new JLabel("");
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.fill = GridBagConstraints.BOTH;
		gbc_label_27.insets = new Insets(0, 0, 5, 5);
		gbc_label_27.gridx = 5;
		gbc_label_27.gridy = 6;
		contentPane.add(label_27, gbc_label_27);
		
		Button btn_F_2_3 = new Button("X");
		btn_F_2_3.setBackground(Color.GREEN);
		GridBagConstraints gbc_btn_F_2_3 = new GridBagConstraints();
		gbc_btn_F_2_3.fill = GridBagConstraints.BOTH;
		gbc_btn_F_2_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn_F_2_3.gridx = 6;
		gbc_btn_F_2_3.gridy = 6;
		contentPane.add(btn_F_2_3, gbc_btn_F_2_3);
		
		Button btn_F_2_4 = new Button("X");
		btn_F_2_4.setBackground(Color.GREEN);
		GridBagConstraints gbc_btn_F_2_4 = new GridBagConstraints();
		gbc_btn_F_2_4.fill = GridBagConstraints.BOTH;
		gbc_btn_F_2_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn_F_2_4.gridx = 7;
		gbc_btn_F_2_4.gridy = 6;
		contentPane.add(btn_F_2_4, gbc_btn_F_2_4);
		
		//ButtonGroup firstClass = new ButtonGroup();
		
		
		JLabel label_28 = new JLabel("");
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.fill = GridBagConstraints.BOTH;
		gbc_label_28.insets = new Insets(0, 0, 5, 5);
		gbc_label_28.gridx = 8;
		gbc_label_28.gridy = 6;
		contentPane.add(label_28, gbc_label_28);
		
		chckbxFirst = new JCheckBox("First Class");
		GridBagConstraints gbc_chckbxFirst = new GridBagConstraints();
		gbc_chckbxFirst.fill = GridBagConstraints.BOTH;
		gbc_chckbxFirst.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxFirst.gridx = 9;
		gbc_chckbxFirst.gridy = 6;
		contentPane.add(chckbxFirst, gbc_chckbxFirst);
		
		JLabel label_29 = new JLabel("");
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.fill = GridBagConstraints.BOTH;
		gbc_label_29.insets = new Insets(0, 0, 5, 0);
		gbc_label_29.gridx = 10;
		gbc_label_29.gridy = 6;
		contentPane.add(label_29, gbc_label_29);
		
		chckbxBusinessClass = new JCheckBox("Business Class");
		GridBagConstraints gbc_chckbxBusinessClass = new GridBagConstraints();
		gbc_chckbxBusinessClass.fill = GridBagConstraints.BOTH;
		gbc_chckbxBusinessClass.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxBusinessClass.gridx = 9;
		gbc_chckbxBusinessClass.gridy = 7;
		contentPane.add(chckbxBusinessClass, gbc_chckbxBusinessClass);
		
		JLabel lblBusiness_1 = new JLabel("BUSINESS CLASS");
		GridBagConstraints gbc_lblBusiness_1 = new GridBagConstraints();
		gbc_lblBusiness_1.gridwidth = 5;
		gbc_lblBusiness_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBusiness_1.gridx = 3;
		gbc_lblBusiness_1.gridy = 8;
		contentPane.add(lblBusiness_1, gbc_lblBusiness_1);
		
		JLabel label_30 = new JLabel("");
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.fill = GridBagConstraints.BOTH;
		gbc_label_30.insets = new Insets(0, 0, 5, 5);
		gbc_label_30.gridx = 1;
		gbc_label_30.gridy = 10;
		contentPane.add(label_30, gbc_label_30);
		
		JLabel label_31 = new JLabel("");
		GridBagConstraints gbc_label_31 = new GridBagConstraints();
		gbc_label_31.fill = GridBagConstraints.BOTH;
		gbc_label_31.insets = new Insets(0, 0, 5, 5);
		gbc_label_31.gridx = 2;
		gbc_label_31.gridy = 10;
		contentPane.add(label_31, gbc_label_31);
		
		Button button_1 = new Button("X");

		button_1.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 10;
		contentPane.add(button_1, gbc_button_1);
		
		Button button_4 = new Button("X");
		button_4.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 4;
		gbc_button_4.gridy = 10;
		contentPane.add(button_4, gbc_button_4);
		
		JLabel label_32 = new JLabel("");
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.fill = GridBagConstraints.BOTH;
		gbc_label_32.insets = new Insets(0, 0, 5, 5);
		gbc_label_32.gridx = 5;
		gbc_label_32.gridy = 10;
		contentPane.add(label_32, gbc_label_32);
		
		Button button_11 = new Button("X");
		button_11.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 6;
		gbc_button_11.gridy = 10;
		contentPane.add(button_11, gbc_button_11);
		
		Button button_12 = new Button("X");
		button_12.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 7;
		gbc_button_12.gridy = 10;
		contentPane.add(button_12, gbc_button_12);
		
		JLabel label_33 = new JLabel("");
		GridBagConstraints gbc_label_33 = new GridBagConstraints();
		gbc_label_33.fill = GridBagConstraints.BOTH;
		gbc_label_33.insets = new Insets(0, 0, 5, 5);
		gbc_label_33.gridx = 8;
		gbc_label_33.gridy = 10;
		contentPane.add(label_33, gbc_label_33);
		
		JLabel label_34 = new JLabel("");
		GridBagConstraints gbc_label_34 = new GridBagConstraints();
		gbc_label_34.fill = GridBagConstraints.BOTH;
		gbc_label_34.insets = new Insets(0, 0, 5, 0);
		gbc_label_34.gridx = 10;
		gbc_label_34.gridy = 10;
		contentPane.add(label_34, gbc_label_34);
		
		JLabel label_35 = new JLabel("");
		GridBagConstraints gbc_label_35 = new GridBagConstraints();
		gbc_label_35.fill = GridBagConstraints.BOTH;
		gbc_label_35.insets = new Insets(0, 0, 5, 5);
		gbc_label_35.gridx = 1;
		gbc_label_35.gridy = 11;
		contentPane.add(label_35, gbc_label_35);
		
		JLabel label_36 = new JLabel("");
		GridBagConstraints gbc_label_36 = new GridBagConstraints();
		gbc_label_36.fill = GridBagConstraints.BOTH;
		gbc_label_36.insets = new Insets(0, 0, 5, 5);
		gbc_label_36.gridx = 2;
		gbc_label_36.gridy = 11;
		contentPane.add(label_36, gbc_label_36);
		
		Button button_2 = new Button("X");
		button_2.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 3;
		gbc_button_2.gridy = 11;
		contentPane.add(button_2, gbc_button_2);
		
		Button button_3 = new Button("X");
		button_3.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 4;
		gbc_button_3.gridy = 11;
		contentPane.add(button_3, gbc_button_3);
		
		JLabel label_37 = new JLabel("");
		GridBagConstraints gbc_label_37 = new GridBagConstraints();
		gbc_label_37.fill = GridBagConstraints.BOTH;
		gbc_label_37.insets = new Insets(0, 0, 5, 5);
		gbc_label_37.gridx = 5;
		gbc_label_37.gridy = 11;
		contentPane.add(label_37, gbc_label_37);
		
		Button button_13 = new Button("X");
		button_13.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 6;
		gbc_button_13.gridy = 11;
		contentPane.add(button_13, gbc_button_13);
		
		Button button_14 = new Button("X");
		button_14.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 7;
		gbc_button_14.gridy = 11;
		contentPane.add(button_14, gbc_button_14);
		
		JLabel label_38 = new JLabel("");
		GridBagConstraints gbc_label_38 = new GridBagConstraints();
		gbc_label_38.fill = GridBagConstraints.BOTH;
		gbc_label_38.insets = new Insets(0, 0, 5, 5);
		gbc_label_38.gridx = 8;
		gbc_label_38.gridy = 11;
		contentPane.add(label_38, gbc_label_38);
		
		JLabel label_39 = new JLabel("");
		GridBagConstraints gbc_label_39 = new GridBagConstraints();
		gbc_label_39.fill = GridBagConstraints.BOTH;
		gbc_label_39.insets = new Insets(0, 0, 5, 5);
		gbc_label_39.gridx = 9;
		gbc_label_39.gridy = 11;
		contentPane.add(label_39, gbc_label_39);
		
		JLabel label_40 = new JLabel("");
		GridBagConstraints gbc_label_40 = new GridBagConstraints();
		gbc_label_40.fill = GridBagConstraints.BOTH;
		gbc_label_40.insets = new Insets(0, 0, 5, 0);
		gbc_label_40.gridx = 10;
		gbc_label_40.gridy = 11;
		contentPane.add(label_40, gbc_label_40);
		
		JLabel label_41 = new JLabel("");
		GridBagConstraints gbc_label_41 = new GridBagConstraints();
		gbc_label_41.fill = GridBagConstraints.BOTH;
		gbc_label_41.insets = new Insets(0, 0, 5, 5);
		gbc_label_41.gridx = 1;
		gbc_label_41.gridy = 12;
		contentPane.add(label_41, gbc_label_41);
		
		JLabel label_42 = new JLabel("");
		GridBagConstraints gbc_label_42 = new GridBagConstraints();
		gbc_label_42.fill = GridBagConstraints.BOTH;
		gbc_label_42.insets = new Insets(0, 0, 5, 5);
		gbc_label_42.gridx = 2;
		gbc_label_42.gridy = 12;
		contentPane.add(label_42, gbc_label_42);
		
		Button button_15 = new Button("X");
		button_15.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.fill = GridBagConstraints.BOTH;
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 3;
		gbc_button_15.gridy = 12;
		contentPane.add(button_15, gbc_button_15);
		
		Button button_16 = new Button("X");
		button_16.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.fill = GridBagConstraints.BOTH;
		gbc_button_16.insets = new Insets(0, 0, 5, 5);
		gbc_button_16.gridx = 4;
		gbc_button_16.gridy = 12;
		contentPane.add(button_16, gbc_button_16);
		
		JLabel label_43 = new JLabel("");
		GridBagConstraints gbc_label_43 = new GridBagConstraints();
		gbc_label_43.fill = GridBagConstraints.BOTH;
		gbc_label_43.insets = new Insets(0, 0, 5, 5);
		gbc_label_43.gridx = 5;
		gbc_label_43.gridy = 12;
		contentPane.add(label_43, gbc_label_43);
		
		Button button_17 = new Button("X");
		button_17.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.fill = GridBagConstraints.BOTH;
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 6;
		gbc_button_17.gridy = 12;
		contentPane.add(button_17, gbc_button_17);
		
		Button button_18 = new Button("X");
		button_18.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.fill = GridBagConstraints.BOTH;
		gbc_button_18.insets = new Insets(0, 0, 5, 5);
		gbc_button_18.gridx = 7;
		gbc_button_18.gridy = 12;
		contentPane.add(button_18, gbc_button_18);
		
		JLabel label_44 = new JLabel("");
		GridBagConstraints gbc_label_44 = new GridBagConstraints();
		gbc_label_44.fill = GridBagConstraints.BOTH;
		gbc_label_44.insets = new Insets(0, 0, 5, 5);
		gbc_label_44.gridx = 8;
		gbc_label_44.gridy = 12;
		contentPane.add(label_44, gbc_label_44);
		
		JLabel label_45 = new JLabel("");
		GridBagConstraints gbc_label_45 = new GridBagConstraints();
		gbc_label_45.fill = GridBagConstraints.BOTH;
		gbc_label_45.insets = new Insets(0, 0, 5, 5);
		gbc_label_45.gridx = 9;
		gbc_label_45.gridy = 12;
		contentPane.add(label_45, gbc_label_45);
		
		JLabel label_46 = new JLabel("");
		GridBagConstraints gbc_label_46 = new GridBagConstraints();
		gbc_label_46.fill = GridBagConstraints.BOTH;
		gbc_label_46.insets = new Insets(0, 0, 5, 0);
		gbc_label_46.gridx = 10;
		gbc_label_46.gridy = 12;
		contentPane.add(label_46, gbc_label_46);
		
		JLabel label_47 = new JLabel("");
		GridBagConstraints gbc_label_47 = new GridBagConstraints();
		gbc_label_47.fill = GridBagConstraints.BOTH;
		gbc_label_47.insets = new Insets(0, 0, 5, 5);
		gbc_label_47.gridx = 1;
		gbc_label_47.gridy = 13;
		contentPane.add(label_47, gbc_label_47);
		
		JLabel label_48 = new JLabel("");
		GridBagConstraints gbc_label_48 = new GridBagConstraints();
		gbc_label_48.fill = GridBagConstraints.BOTH;
		gbc_label_48.insets = new Insets(0, 0, 5, 5);
		gbc_label_48.gridx = 2;
		gbc_label_48.gridy = 13;
		contentPane.add(label_48, gbc_label_48);
		
		JLabel label_49 = new JLabel("");
		GridBagConstraints gbc_label_49 = new GridBagConstraints();
		gbc_label_49.fill = GridBagConstraints.BOTH;
		gbc_label_49.insets = new Insets(0, 0, 5, 5);
		gbc_label_49.gridx = 5;
		gbc_label_49.gridy = 13;
		contentPane.add(label_49, gbc_label_49);
		
		JLabel label_50 = new JLabel("");
		GridBagConstraints gbc_label_50 = new GridBagConstraints();
		gbc_label_50.fill = GridBagConstraints.BOTH;
		gbc_label_50.insets = new Insets(0, 0, 5, 5);
		gbc_label_50.gridx = 6;
		gbc_label_50.gridy = 13;
		contentPane.add(label_50, gbc_label_50);
		
		JLabel label_51 = new JLabel("");
		GridBagConstraints gbc_label_51 = new GridBagConstraints();
		gbc_label_51.fill = GridBagConstraints.BOTH;
		gbc_label_51.insets = new Insets(0, 0, 5, 5);
		gbc_label_51.gridx = 7;
		gbc_label_51.gridy = 13;
		contentPane.add(label_51, gbc_label_51);
		
		JLabel label_52 = new JLabel("");
		GridBagConstraints gbc_label_52 = new GridBagConstraints();
		gbc_label_52.fill = GridBagConstraints.BOTH;
		gbc_label_52.insets = new Insets(0, 0, 5, 5);
		gbc_label_52.gridx = 8;
		gbc_label_52.gridy = 13;
		contentPane.add(label_52, gbc_label_52);
		
		JLabel label_53 = new JLabel("");
		GridBagConstraints gbc_label_53 = new GridBagConstraints();
		gbc_label_53.fill = GridBagConstraints.BOTH;
		gbc_label_53.insets = new Insets(0, 0, 5, 5);
		gbc_label_53.gridx = 9;
		gbc_label_53.gridy = 13;
		contentPane.add(label_53, gbc_label_53);
		
		JLabel label_54 = new JLabel("");
		GridBagConstraints gbc_label_54 = new GridBagConstraints();
		gbc_label_54.insets = new Insets(0, 0, 5, 0);
		gbc_label_54.fill = GridBagConstraints.BOTH;
		gbc_label_54.gridx = 10;
		gbc_label_54.gridy = 13;
		contentPane.add(label_54, gbc_label_54);
		
		JLabel lblEconomy = new JLabel("ECONOMY CLASS");
		GridBagConstraints gbc_lblEconomy = new GridBagConstraints();
		gbc_lblEconomy.gridwidth = 5;
		gbc_lblEconomy.insets = new Insets(0, 0, 5, 5);
		gbc_lblEconomy.gridx = 3;
		gbc_lblEconomy.gridy = 14;
		contentPane.add(lblEconomy, gbc_lblEconomy);
		
		Button button_22 = new Button("X");
		button_22.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_22 = new GridBagConstraints();
		gbc_button_22.insets = new Insets(0, 0, 5, 5);
		gbc_button_22.gridx = 3;
		gbc_button_22.gridy = 16;
		contentPane.add(button_22, gbc_button_22);
		
		Button button_21 = new Button("X");
		button_21.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_21 = new GridBagConstraints();
		gbc_button_21.insets = new Insets(0, 0, 5, 5);
		gbc_button_21.gridx = 4;
		gbc_button_21.gridy = 16;
		contentPane.add(button_21, gbc_button_21);
		
		Button button_26 = new Button("X");
		button_26.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_26 = new GridBagConstraints();
		gbc_button_26.insets = new Insets(0, 0, 5, 5);
		gbc_button_26.gridx = 6;
		gbc_button_26.gridy = 16;
		contentPane.add(button_26, gbc_button_26);
		
		Button button_27 = new Button("X");
		button_27.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_27 = new GridBagConstraints();
		gbc_button_27.insets = new Insets(0, 0, 5, 5);
		gbc_button_27.gridx = 7;
		gbc_button_27.gridy = 16;
		contentPane.add(button_27, gbc_button_27);
		
		lblFlug = new JLabel("Flug:");
		GridBagConstraints gbc_lblFlug = new GridBagConstraints();
		gbc_lblFlug.insets = new Insets(0, 0, 5, 5);
		gbc_lblFlug.gridx = 9;
		gbc_lblFlug.gridy = 16;
		contentPane.add(lblFlug, gbc_lblFlug);
		
		Button button_23 = new Button("X");
		button_23.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_23 = new GridBagConstraints();
		gbc_button_23.insets = new Insets(0, 0, 5, 5);
		gbc_button_23.gridx = 3;
		gbc_button_23.gridy = 17;
		contentPane.add(button_23, gbc_button_23);
		
		Button button_24 = new Button("X");
		button_24.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_24 = new GridBagConstraints();
		gbc_button_24.insets = new Insets(0, 0, 5, 5);
		gbc_button_24.gridx = 4;
		gbc_button_24.gridy = 17;
		contentPane.add(button_24, gbc_button_24);
		
		Button button_25 = new Button("X");
		button_25.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_25 = new GridBagConstraints();
		gbc_button_25.insets = new Insets(0, 0, 5, 5);
		gbc_button_25.gridx = 6;
		gbc_button_25.gridy = 17;
		contentPane.add(button_25, gbc_button_25);
		
		Button button_28 = new Button("X");
		button_28.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_28 = new GridBagConstraints();
		gbc_button_28.insets = new Insets(0, 0, 5, 5);
		gbc_button_28.gridx = 7;
		gbc_button_28.gridy = 17;
		contentPane.add(button_28, gbc_button_28);
		
		lblPreis = new JLabel("Preis:");
		GridBagConstraints gbc_lblPreis = new GridBagConstraints();
		gbc_lblPreis.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreis.gridx = 9;
		gbc_lblPreis.gridy = 17;
		contentPane.add(lblPreis, gbc_lblPreis);
		
		Button button_32 = new Button("X");
		button_32.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_32 = new GridBagConstraints();
		gbc_button_32.insets = new Insets(0, 0, 5, 5);
		gbc_button_32.gridx = 3;
		gbc_button_32.gridy = 18;
		contentPane.add(button_32, gbc_button_32);
		
		Button button_31 = new Button("X");
		button_31.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_31 = new GridBagConstraints();
		gbc_button_31.insets = new Insets(0, 0, 5, 5);
		gbc_button_31.gridx = 4;
		gbc_button_31.gridy = 18;
		contentPane.add(button_31, gbc_button_31);
		
		Button button_30 = new Button("X");
		button_30.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_30 = new GridBagConstraints();
		gbc_button_30.insets = new Insets(0, 0, 5, 5);
		gbc_button_30.gridx = 6;
		gbc_button_30.gridy = 18;
		contentPane.add(button_30, gbc_button_30);
		
		Button button_29 = new Button("X");
		button_29.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_29 = new GridBagConstraints();
		gbc_button_29.insets = new Insets(0, 0, 5, 5);
		gbc_button_29.gridx = 7;
		gbc_button_29.gridy = 18;
		contentPane.add(button_29, gbc_button_29);
		
		lblSeat = new JLabel("Platz:");
		GridBagConstraints gbc_lblSeat = new GridBagConstraints();
		gbc_lblSeat.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeat.gridx = 9;
		gbc_lblSeat.gridy = 18;
		contentPane.add(lblSeat, gbc_lblSeat);
		
		Button button_33 = new Button("X");
		button_33.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_33 = new GridBagConstraints();
		gbc_button_33.insets = new Insets(0, 0, 0, 5);
		gbc_button_33.gridx = 3;
		gbc_button_33.gridy = 19;
		contentPane.add(button_33, gbc_button_33);
		
		Button button_34 = new Button("X");
		button_34.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_34 = new GridBagConstraints();
		gbc_button_34.insets = new Insets(0, 0, 0, 5);
		gbc_button_34.gridx = 4;
		gbc_button_34.gridy = 19;
		contentPane.add(button_34, gbc_button_34);
		
		Button button_35 = new Button("X");
		button_35.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_35 = new GridBagConstraints();
		gbc_button_35.insets = new Insets(0, 0, 0, 5);
		gbc_button_35.gridx = 6;
		gbc_button_35.gridy = 19;
		contentPane.add(button_35, gbc_button_35);
		
		Button button_36 = new Button("X");
		button_36.setBackground(Color.GREEN);
		GridBagConstraints gbc_button_36 = new GridBagConstraints();
		gbc_button_36.insets = new Insets(0, 0, 0, 5);
		gbc_button_36.gridx = 7;
		gbc_button_36.gridy = 19;
		contentPane.add(button_36, gbc_button_36);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(chckbxBusinessClass);
		bg.add(chckbxEconomy);
		bg.add(chckbxFirst);
		

		
		btn_F_1_1.addMouseListener(
				
				new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
					seatFirstClass(btn_F_2_4);	
						
					}
				});
				
			/*	
			new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
			}
		});
		*/
	}
	
	
	public void seatFirstClass(Button btn) {
		
		
	
	}

}
