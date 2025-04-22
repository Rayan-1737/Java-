package Swing_UI;

import javax.swing.*;

public class CheckBoxMethodsExample3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rayan JCheckBox Methods Example");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1️⃣ setSelected(boolean b)
        JCheckBox cb1 = new JCheckBox("Option 1");
        cb1.setBounds(50, 30, 200, 30);
        cb1.setSelected(true);   // Selects the checkbox

        
        JCheckBox cb2 = new JCheckBox("Option 2");
        cb2.setBounds(50, 70, 200, 30);
        cb2.setSelected(false);   // Deselects the checkbox



        // 2️⃣ isSelected()
        boolean status = cb1.isSelected();
        System.out.println("Is Option 1 selected? " + status);



        // 3️⃣ setText(String text)
        JCheckBox cb3 = new JCheckBox();
        cb3.setBounds(50, 110, 200, 30);
        cb3.setText("Enable Notifications");



        // 4️⃣ getText()
        String label = cb3.getText();
        System.out.println("Checkbox Label: " + label);



        // 5️⃣ setEnabled(boolean b)
        JCheckBox cb4 = new JCheckBox("Disabled Option");
        cb4.setBounds(50, 150, 200, 30);
        cb4.setEnabled(false); // Disables the checkbox



        // 6️⃣ setIcon(Icon icon) with correct size
        ImageIcon icon = new ImageIcon(new ImageIcon("Icon3.png")     .getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
        JCheckBox cb5 = new JCheckBox("With Icon", icon);
        cb5.setBounds(50, 190, 200, 50);


        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(cb4);
        frame.add(cb5);

        frame.setVisible(true);
    }
}

