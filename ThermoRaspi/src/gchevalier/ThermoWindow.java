package gchevalier;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.border.MatteBorder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThermoWindow extends JFrame {
	private JLabel currentTempLabel;
	private JButton plusButton, 
	minusButton,
	exitButton;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public ThermoWindow(){
		setResizable(false);
		setAlwaysOnTop(true);
		initWindow();
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	private void initWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelCurrentTemp = new JPanel();
		contentPane.add(panelCurrentTemp);
		panelCurrentTemp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCurrentTemp = new JLabel("20");
		lblCurrentTemp.setFont(new Font("Helvetica Neue", Font.PLAIN, 99));
		panelCurrentTemp.add(lblCurrentTemp);
		
		JLabel lblNewLabel = new JLabel("<html><sup>°C</sup></html>");
		lblNewLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 60));
		panelCurrentTemp.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
	}
	


}
