package Exam;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GridLayoutDemo {
   
    public GridLayoutDemo() {
        JFrame frame = new JFrame();
        GridLayout layout = new GridLayout(2, 2);
       
        frame.setLayout(layout);
       
        frame.setSize(300, 300);
        JTextField jTextField = new JTextField(10);

        jTextField.getDocument().addDocumentListener(new DocumentListener() {
           
            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Value............."+jTextField.getText());
            }
           
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insertUpdate............."+jTextField.getText());
            }
           
            @Override
            public void changedUpdate(DocumentEvent e) {
               
            }
        });
        frame.add(jTextField);
        //frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
       
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}