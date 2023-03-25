package Exam;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;

public class AEvent extends Frame implements ActionListener{
	TextField tf;
	AEvent(){
		tf = new TextField();
		tf.setBounds(60,50,170,20);
		JButton b = new JButton("Click Me");
		b.setBounds(100,120,80,30);
		
		//register listener
		b.addActionListener(this);
		
		//add components
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
				
	}
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome");
		System.out.println("Event Handled");
	}
	
	public static void main (String args[]) {
		new AEvent();
	}

}
