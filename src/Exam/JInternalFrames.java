package Exam;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class JInternalFrames extends JFrame{
	static JFrame f;
	//static lable l;
	
	public static void main(String args[]) {
		f = new JFrame("Frame");
		JInternalFrame in =  new JInternalFrame();
		in.setTitle("Internal Frame");
		
		JButton b = new JButton("Button");
		JLabel l = new JLabel("This is JInternal Frame");
		JPanel p = new JPanel();
		
		//adding lable and button 
		p.add(l);
		p.add(b);
		
		in.setVisible(true);
		in.add(p);
		f.add(in);
		f.setSize(300,300);
		f.show();
		
		
	}

}
