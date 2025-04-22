package Swing_UI;

import javax.swing.*;

public class JRadioButton1 {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Rayan JRadioButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Create an empty JRadioButton
        JRadioButton rb1 = new JRadioButton();
        
        // Add the radio button to the frame
        frame.getContentPane().add(rb1);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}

