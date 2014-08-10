package gchevalier;

import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class ThermoRaspi extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel currentTempLabel;
	private JButton plusButton, 
	minusButton,
	exitButton;
	JToggleButton onOffButton;
	JFrame parent;
	public ThermoRaspi(JFrame parent){
		super();
		this.parent = parent;
		initWindow();
	}
	
	private void initWindow(){
		currentTempLabel = new JLabel("20");
		plusButton = new JButton("+"); minusButton = new JButton("-");
		exitButton = new JButton("Exit");
		this.parent.add(this);
		this.setLayout(new GridBagLayout());
		this.parent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.gridheight = 4;
		c.gridwidth = 2;
		c.weightx = 1;
		c.weighty = 1;
		c.insets = new Insets(0,0,0,0);
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.WEST;
		currentTempLabel.setFont(new Font("serif", Font.PLAIN, 600));
		this.add(currentTempLabel,c);
		
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 4;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0,0,0,0);
		this.add(plusButton,c);
		plusButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				plusButton_Action(e);
			}			
		});
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 4;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0,0,0,0);
		this.add(minusButton,c);
		minusButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				minusButton_Action(e);
			}			
		});
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0,0,0,0);
		this.add(exitButton,c);
		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				exitButton_Action(e);
			}			
		});
		
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 1;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0,0,0,0);
		this.add(new JPanel(),c);
		this.parent.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.parent.setUndecorated(true);
		this.parent.pack();
		this.parent.setVisible(true);
	}
	
	private void plusButton_Action(ActionEvent evt){
	}
	private void minusButton_Action(ActionEvent evt){
		
	}
	private void exitButton_Action(ActionEvent evt){
		close();
	}
	
	private void close(){
		System.exit(0);
	}
	
	public static void main (String[] args){
		new ThermoRaspi(new JFrame("Thermo2000"));
	}
	

}
