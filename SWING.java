package Swing_UI;

import java.awt.*;  
import javax.swing.*;  

public class SWING {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("Addition Form");
        frame.setSize(300, 200);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        frame.setLayout(new FlowLayout());  

        JTextField num1Field = new JTextField(10);  
        JTextField num2Field = new JTextField(10);  

        JButton addButton = new JButton("Add");  
        JLabel resultLabel = new JLabel("Result: -");  

        frame.add(new JLabel("Enter 1st Number:"));
        frame.add(num1Field);  
        frame.add(new JLabel("Enter 2nd Number:"));
        frame.add(num2Field);  
        frame.add(addButton);  
        frame.add(resultLabel);  

        addButton.addActionListener(e -> {  
            try {  
                int num1 = Integer.parseInt(num1Field.getText());  
                int num2 = Integer.parseInt(num2Field.getText());  
                resultLabel.setText("Result: " + (num1 + num2));  
            } catch (NumberFormatException ex) {  
                JOptionPane.showMessageDialog(frame, "Enter valid numbers.");  
            }  
        });  

        frame.setVisible(true);  
    }  
}
