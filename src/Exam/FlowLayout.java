package Exam;
import java.awt.*;
import javax.swing.*;


public class FlowLayout {
	JFrame frameObj;
	
	FlowLayout(){
		frameObj = new JFrame();
		
		//Creating Button 
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		
		//Adding buttons to frame
		frameObj.add(b1);
		frameObj.add(b2);
		
		frameObj.setLayout(new FlowLayout());
		
		frameObj.setSize(200,200);
		frameObj.setVisible(true);
		
	}
	
	public static void main (String [] args) {
		new FlowLayout();
	}

}
