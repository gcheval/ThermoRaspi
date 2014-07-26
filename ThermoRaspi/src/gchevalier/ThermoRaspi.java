package gchevalier;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ThermoRaspi extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public ThermoRaspi(JFrame frame){
		super(new GridBagLayout());
		JOptionPane.showMessageDialog(frame.getContentPane(), "It works!!");
		
	}
	
	private void initWindow(){
		
	}
	
	public static void main (String[] args){
		new ThermoRaspi(new JFrame());
	}

}
