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
import javax.swing.SwingConstants;

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
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{220, 220, 0};
		gbl_contentPane.rowHeights = new int[]{134, 302, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelCurrentTemp = new JPanel();
		GridBagConstraints gbc_panelCurrentTemp = new GridBagConstraints();
		gbc_panelCurrentTemp.fill = GridBagConstraints.BOTH;
		gbc_panelCurrentTemp.insets = new Insets(0, 0, 5, 5);
		gbc_panelCurrentTemp.gridx = 0;
		gbc_panelCurrentTemp.gridy = 0;
		contentPane.add(panelCurrentTemp, gbc_panelCurrentTemp);
		panelCurrentTemp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCurrentTemp = new JLabel("20");
		lblCurrentTemp.setFont(new Font("Helvetica Neue", Font.PLAIN, 99));	//Set to 400
		panelCurrentTemp.add(lblCurrentTemp);
		
		JLabel lblNewLabel = new JLabel("<html><sup>°C</sup></html>");
		lblNewLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 60));
		panelCurrentTemp.add(lblNewLabel);
		
		JPanel panelControls = new JPanel();
		panelControls.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panelControls = new GridBagConstraints();
		gbc_panelControls.fill = GridBagConstraints.BOTH;
		gbc_panelControls.insets = new Insets(0, 0, 5, 0);
		gbc_panelControls.gridx = 1;
		gbc_panelControls.gridy = 0;
		contentPane.add(panelControls, gbc_panelControls);
		GridBagLayout gbl_panelControls = new GridBagLayout();
		gbl_panelControls.columnWidths = new int[]{0, 0};
		gbl_panelControls.rowHeights = new int[]{0, 0, 0};
		gbl_panelControls.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelControls.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelControls.setLayout(gbl_panelControls);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.ipady = 50;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panelControls.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnHumidity = new JButton("Humidity");
		GridBagConstraints gbc_btnHumidity = new GridBagConstraints();
		gbc_btnHumidity.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHumidity.ipady = 50;
		gbc_btnHumidity.gridx = 0;
		gbc_btnHumidity.gridy = 1;
		panelControls.add(btnHumidity, gbc_btnHumidity);
		
		JPanel panelTempChange = new JPanel();
		panelTempChange.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panelTempChange = new GridBagConstraints();
		gbc_panelTempChange.insets = new Insets(0, 0, 0, 5);
		gbc_panelTempChange.fill = GridBagConstraints.BOTH;
		gbc_panelTempChange.gridx = 0;
		gbc_panelTempChange.gridy = 1;
		contentPane.add(panelTempChange, gbc_panelTempChange);
		GridBagLayout gbl_panelTempChange = new GridBagLayout();
		gbl_panelTempChange.columnWidths = new int[]{0, 0};
		gbl_panelTempChange.rowHeights = new int[]{0, 0, 0};
		gbl_panelTempChange.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelTempChange.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelTempChange.setLayout(gbl_panelTempChange);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.ipady = 50;
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panelTempChange.add(button, gbc_button);
		
		JButton button_1 = new JButton("-");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.ipady = 50;
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 1;
		panelTempChange.add(button_1, gbc_button_1);
		
		JPanel panelObjectiveTemp = new JPanel();
		GridBagConstraints gbc_panelObjectiveTemp = new GridBagConstraints();
		gbc_panelObjectiveTemp.fill = GridBagConstraints.BOTH;
		gbc_panelObjectiveTemp.gridx = 1;
		gbc_panelObjectiveTemp.gridy = 1;
		contentPane.add(panelObjectiveTemp, gbc_panelObjectiveTemp);
		panelObjectiveTemp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("20");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setFont(new Font("Helvetica Neue", Font.PLAIN, 99));
		panelObjectiveTemp.add(label);
		
		JLabel label_1 = new JLabel("<html><sup>°C</sup></html>");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setFont(new Font("Helvetica Neue", Font.PLAIN, 60));
		panelObjectiveTemp.add(label_1);
	}
	


}
