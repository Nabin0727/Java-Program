package Exam;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridBagLayoutDemo extends JFrame{
   
    public GridBagLayoutDemo() {
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
       
        setLayout(layout);
        setSize(300, 300);
       
        setTitle("Grid Bag Layout Demo");
       
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Username : "), gbc);
       
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new JTextField(10), gbc);
       
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Password : "), gbc);
       
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new JTextField(10), gbc);
       
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        add(new JButton("Login"), gbc);
       
        setVisible(true);
        //pack();
    }

    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }

}