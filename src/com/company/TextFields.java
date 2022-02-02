package com.company;

import javax.swing.*;
import javax.swing.JTextField;   // importing jtextfield
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.*;


public class TextFields {
    public static void main(String[] args) {
          // JTextfield = A GUI textbox component that can be used to get, set or add text

        JTextField textfield = new JTextField("Heyy",24);
          textfield.setBounds(1,1,200,40);
          //    textfield.setPreferredSize(new Dimension(250,40));

        // JTextarea = JTextArea is a lightweight component that allows the multiline area to
        //display the text , it is editable by default.
        JTextArea textarea = new JTextArea(5,6);
        textarea.setBounds(10,10,240,240);
        textarea.getColumns();

        // JButton
        JButton button = new JButton("Submit");
        button.setBounds(1,1,20,30);

        // JPasswordfield
       JPasswordField password = new JPasswordField();
       password.setText("password");
       password.setBounds(1,1,200,30);

        // usual task
        JFrame frame = new JFrame();
        frame.setTitle("Java Swing Project");
        frame.setLayout(null);
        frame.setSize(420,240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);

        // add the textfield
        frame.add(textfield);
        frame.add(button);
        frame.add(password);
        frame.add(textarea);
//        frame.pack();
    }
}
