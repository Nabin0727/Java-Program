package Exam;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;

public class MouseEventExample extends Frame implements MouseListener{
	TextField tf;
	MouseEventExample(){
		//tf = new TextField();
		//tf.setBounds(60,50,170,20);
		
		Label l = new Label("Mouse Event Check");
		l.setBounds(60,50,170,20);
		JButton b = new JButton("Click Me");
	    b.setBounds(100,120,80,30);
		
		//register listener
		l.addMouseListener(this);
		
		//add components
		add(b);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
				
	}
	public void mouseClicked(MouseEvent e) {
		tf.setText("Mouse Clicked");
		System.out.println("Event Handled");
	}
	public void mouseEntered(MouseEvent e) {  
	        tf.setText("Mouse Entered");  
	    }  
	public void mouseExited(MouseEvent e) {  
	        tf.setText("Mouse Exited");  
	    }  
	public void mousePressed(MouseEvent e) {  
	        tf.setText("Mouse Pressed");  
	    }  
	public void mouseReleased(MouseEvent e) {  
	        tf.setText("Mouse Released");  
	    }	
	
	public static void main (String args[]) {
		new MouseEventExample();
	}

}
