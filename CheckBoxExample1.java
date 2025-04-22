package Swing_UI;

import javax.swing.*;

public class CheckBoxExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rayan JCheckBox Example");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox cb3 = new JCheckBox("Java", true); // Checkbox with text and selected by default
        JCheckBox cb4 = new JCheckBox(new ImageIcon("icon.png")); // Checkbox with an icon

        cb3.setBounds(50, 50, 150, 30);
        cb4.setBounds(50, 90, 150, 30);

        frame.add(cb3);
        frame.add(cb4);
        
        frame.setVisible(true);
    }
}
