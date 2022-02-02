package com.company;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;


public class Panels {
    public static void main(String[] args) {
         // JPanel = a GUI component that acts as a container to hold other components

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.black);
        redPanel.setBounds(0,0,250,250);

        // add a label in the panel
        JLabel label = new JLabel();
        label.setText("Hello World!!");
        label.setFont(new Font("MV Boli",Font.PLAIN,20));

        // usual task
        JFrame frame = new JFrame();
        frame.setTitle("Java Swing Project");
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);





        // dont forget tp add the panel in the frame
        frame.add(redPanel);

        redPanel.add(label);
    }
}
