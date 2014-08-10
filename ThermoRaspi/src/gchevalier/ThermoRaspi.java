package gchevalier;

import java.awt.EventQueue;
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
import javax.swing.UIManager;

public class ThermoRaspi{
	private static final long serialVersionUID = 1L;
	JToggleButton onOffButton;
	
	public ThermoRaspi( ){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThermoWindow frame = new ThermoWindow();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setUndecorated(true);
					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void main (String[] args){
		new ThermoRaspi();
	}
	

}
