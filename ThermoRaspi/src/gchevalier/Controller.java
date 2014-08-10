package gchevalier;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.UIManager;

public class Controller {
	private JLabel tempLabel,humidLabel;
	private Timer timer;
	private int temp = 20;

	public void setCurrentTemp(JLabel tempLabel, JLabel humidLabel){
		this.tempLabel = tempLabel;
		this.humidLabel = humidLabel;
		timer = new Timer(1000, timerAction);
		timer.start();
	}
	private ActionListener timerAction = new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			String[] cmd = {
					"/bin/bash",
					"-c",
					"cd /home/pi/workspace/Adafruit_Python_DHT/examples/",
					"sudo python AdafruitDHT.py 11 4"
			};
			try {
				Runtime.getRuntime().exec(cmd);
			} catch (IOException e) {
				e.printStackTrace();
			}

			tempLabel.setText("20");
		}
	};
	public void plusButton_Action(ActionEvent evt){

	}
	public void minusButton_Action(ActionEvent evt){

	}
}
