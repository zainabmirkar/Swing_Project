package com.company;
import javax.swing.*;
import javax.swing.border.Border;       // import for border
import java.awt.*;            // for importing colours and all

public class Main {

    public static void main(String[] args) {
           JFrame frame = new JFrame();                         // creates a frame
           frame.setTitle("Java Swing Project");               // sets title
           frame.setSize(420,420);                // size in x and y dimension

          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit the app after hitting the exit button
           frame.setResizable(false);                 // user cannot resize app
           frame.setVisible(true);                           // makes frame visible

      //...............................................................................................................//

        // set background using getContentPane= it is the visible area of the jframe
        frame.getContentPane().setBackground(Color.red);

          // ........................................................................................................//
        // border of the label
        Border border = BorderFactory.createLineBorder(Color.green);

        // JLabel = to display textual data like text or image or both
        JLabel label = new JLabel();          // you can also pass text in this ()
        label.setText("Hello World!!!");
        label.setVerticalTextPosition(JLabel.TOP);       // place the text of the image icon
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setBackground(Color.black);         // this will not display black color
        label.setOpaque(true);                     // now it makes the label black but the whole area will be black

        // set border
        label.setBorder(border);
        frame.setLayout(null);             // bcoz we dont want the label to take the whole width
        label.setBounds(100,100,250,250);      // this sets where you want to place the label x and y also dimensions
        // *** also you need to add this label int the frame
        frame.add(label);
        //  frame.pack() this will automatically fit all the components
    }
}
