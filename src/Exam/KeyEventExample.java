package Exam;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;

public class KeyEventExample extends Frame implements KeyListener{
	TextField tf;
	Label l;
	KeyEventExample(){
		tf = new TextField();
		tf.setBounds(60,50,170,20);
	    l = new Label ("Click Me");
		//b.setBounds(100,120,80,30);
		
		//register listener
		tf.addKeyListener(this);
		
		//add components
		add(tf);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
				
	}
	public void keyPressed(KeyEvent e) {
		tf.setText("Key Pressed");
		System.out.println("Event Handled");
	}
	// overriding the keyReleased() method of KeyListener interface where we set the text of the label when key is released  
    public void keyReleased (KeyEvent e) {    
        tf.setText ("Key Released");    
    }    
// overriding the keyTyped() method of KeyListener interface where we set the text of the label when a key is typed  
    public void keyTyped (KeyEvent e) {    
        tf.setText ("Key Typed");    
    } 	
	public static void main (String args[]) {
		new KeyEventExample();
	}

}
