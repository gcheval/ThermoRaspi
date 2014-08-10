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
	private static final long serialVersionUID = 1L;
	private JLabel lblCurrentTemp = new JLabel("20")
	,lblRelativeHumidity = new JLabel("00%")
	,lblObjectiveTemp = new JLabel("20");
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public ThermoWindow(){
		Controller controller = new Controller();
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
		gbl_contentPane.rowHeights = new int[]{134, 302, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JPanel panelCurrentTemp = new JPanel();
		GridBagConstraints gbc_panelCurrentTemp = new GridBagConstraints();
		gbc_panelCurrentTemp.fill = GridBagConstraints.BOTH;
		gbc_panelCurrentTemp.insets = new Insets(0, 0, 5, 5);
		gbc_panelCurrentTemp.gridx = 0;
		gbc_panelCurrentTemp.gridy = 0;
		contentPane.add(panelCurrentTemp, gbc_panelCurrentTemp);
		panelCurrentTemp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));


		lblCurrentTemp.setFont(new Font("Helvetica Neue", Font.PLAIN, 350));	//Set to 400
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
		gbl_panelControls.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelControls.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelControls.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
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

		JLabel lblRelativeHumidityTitle = new JLabel("Relative Humidity");
		lblRelativeHumidityTitle.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		GridBagConstraints gbc_lblRelativeHumidityTitle = new GridBagConstraints();
		gbc_lblRelativeHumidityTitle.insets = new Insets(0, 0, 5, 0);
		gbc_lblRelativeHumidityTitle.gridx = 0;
		gbc_lblRelativeHumidityTitle.gridy = 1;
		panelControls.add(lblRelativeHumidityTitle, gbc_lblRelativeHumidityTitle);


		lblRelativeHumidity.setFont(new Font("Helvetica Neue", Font.PLAIN, 40));
		GridBagConstraints gbc_lblRelativeHumidity = new GridBagConstraints();
		gbc_lblRelativeHumidity.gridx = 0;
		gbc_lblRelativeHumidity.gridy = 2;
		panelControls.add(lblRelativeHumidity, gbc_lblRelativeHumidity);

		JPanel panelTempChange = new JPanel();
		panelTempChange.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GridBagConstraints gbc_panelTempChange = new GridBagConstraints();
		gbc_panelTempChange.insets = new Insets(0, 0, 5, 5);
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
				if(Integer.parseInt(lblObjectiveTemp.getText()) >= 10 && 
						Integer.parseInt(lblObjectiveTemp.getText()) < 30){
					lblObjectiveTemp.setText(String.valueOf(Integer.parseInt(lblObjectiveTemp.getText()) +1));
				}
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.ipady = 50;
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(40, 0, 40, 0);
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
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(lblObjectiveTemp.getText()) > 10 && 
						Integer.parseInt(lblObjectiveTemp.getText()) <= 30){
					lblObjectiveTemp.setText(String.valueOf(Integer.parseInt(lblObjectiveTemp.getText()) -1));
				}
			}
		});

		JPanel panelObjectiveTemp = new JPanel();
		GridBagConstraints gbc_panelObjectiveTemp = new GridBagConstraints();
		gbc_panelObjectiveTemp.insets = new Insets(0, 0, 5, 0);
		gbc_panelObjectiveTemp.fill = GridBagConstraints.BOTH;
		gbc_panelObjectiveTemp.gridx = 1;
		gbc_panelObjectiveTemp.gridy = 1;
		contentPane.add(panelObjectiveTemp, gbc_panelObjectiveTemp);
		panelObjectiveTemp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_1 = new JPanel();
		panelObjectiveTemp.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{91, 110, 65, 0};
		gbl_panel_1.rowHeights = new int[]{119, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		JLabel lblObjectiveTempTitle = new JLabel("Objectif");
		GridBagConstraints gbc_lblObjectiveTempTitle = new GridBagConstraints();
		gbc_lblObjectiveTempTitle.gridwidth = 2;
		gbc_lblObjectiveTempTitle.insets = new Insets(0, 0, 0, 0);
		gbc_lblObjectiveTempTitle.gridx = 0;
		gbc_lblObjectiveTempTitle.gridy = 0;
		panel_1.add(lblObjectiveTempTitle, gbc_lblObjectiveTempTitle);
		lblObjectiveTempTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjectiveTempTitle.setFont(new Font("Helvetica Neue", Font.PLAIN, 26));


		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTHWEST;
		gbc_label.insets = new Insets(0, 0, 0, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_1.add(lblObjectiveTemp, gbc_label);
		lblObjectiveTemp.setVerticalAlignment(SwingConstants.BOTTOM);
		lblObjectiveTemp.setFont(new Font("Helvetica Neue", Font.PLAIN, 99));

		JLabel lblObjCelciusTitle = new JLabel("<html><sup>°C</sup></html>");
		GridBagConstraints gbc_lblObjCelciusTitle = new GridBagConstraints();
		gbc_lblObjCelciusTitle.anchor = GridBagConstraints.WEST;
		gbc_lblObjCelciusTitle.gridx = 1;
		gbc_lblObjCelciusTitle.gridy = 1;
		panel_1.add(lblObjCelciusTitle, gbc_lblObjCelciusTitle);
		lblObjCelciusTitle.setVerticalAlignment(SwingConstants.TOP);
		lblObjCelciusTitle.setFont(new Font("Helvetica Neue", Font.PLAIN, 60));
	}



}
