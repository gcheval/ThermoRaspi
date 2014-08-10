package gchevalier;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.UIManager;

public class Controller {
	private JLabel tempLabel,humidLabel;
	private Timer timer;

	public void setCurrentTemp(JLabel tempLabel, JLabel humidLabel){
		this.tempLabel = tempLabel;
		this.humidLabel = humidLabel;
		timer = new Timer(5000, timerAction);
		timer.start();
	}
	private ActionListener timerAction = new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			getTempAction(ae);
		}
	};
	public void plusButton_Action(ActionEvent evt){

	}
	public void minusButton_Action(ActionEvent evt){

	}

	private void getTempAction(ActionEvent ae){
		String s = null;

		try {   
			Process p = Runtime.getRuntime().exec("sudo python AdafruitDHT.py 11 4", 
					null,
					new File("/home/pi/workspace/Adafruit_Python_DHT/examples/"));
			BufferedReader stdInput = new BufferedReader(new
					InputStreamReader(p.getInputStream()));

			BufferedReader stdError = new BufferedReader(new
					InputStreamReader(p.getErrorStream()));

			while ((s = stdInput.readLine()) != null) {
				tempLabel.setText(s.substring(5, 9));
				humidLabel.setText(s.substring(22, 24)+"%");               
			}

		}
		catch (IOException e) {
		}  
	}
}
