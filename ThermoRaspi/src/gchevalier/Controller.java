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
	private int temp = 20;

	public void setCurrentTemp(JLabel tempLabel, JLabel humidLabel){
		this.tempLabel = tempLabel;
		this.humidLabel = humidLabel;
		timer = new Timer(3000, timerAction);
		timer.start();
	}
	private ActionListener timerAction = new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			getTempAction(ae);
			tempLabel.setText("20");
		}
	};
	public void plusButton_Action(ActionEvent evt){

	}
	public void minusButton_Action(ActionEvent evt){

	}
	
	private void getTempAction(ActionEvent ae){
	       String s = null;
	       
	       try {
	            
	    	   
	           // using the Runtime exec method:
	           Process p = Runtime.getRuntime().exec("sudo python AdafruitDHT.py 11 4", 
	        		   null,
	        		   new File("/home/pi/workspace/Adafruit_Python_DHT/examples/"));
	           
	            
	           BufferedReader stdInput = new BufferedReader(new
	                InputStreamReader(p.getInputStream()));

	           BufferedReader stdError = new BufferedReader(new
	                InputStreamReader(p.getErrorStream()));

	           // read the output from the command
	           System.out.println("Here is the standard output of the command:\n");
	           while ((s = stdInput.readLine()) != null) {
	               System.out.println(s.substring(5, 8));
	               System.out.println(s.substring(22, 25));
	               
	           }
	            
	       }
	       catch (IOException e) {
	       }  
	}
}
