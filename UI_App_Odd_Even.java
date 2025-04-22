import javax.swing.*;

public class UI_App_Odd_Even extends JFrame {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public UI_App_Odd_Even() {
        setTitle("Even/Odd Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        inputField = new JTextField(5); 
        checkButton = new JButton("Check Even/Odd");
        resultLabel = new JLabel("Result");

        inputField.setHorizontalAlignment(JTextField.CENTER);
        inputField.setMaximumSize(inputField.getPreferredSize()); 
        inputField.setAlignmentX(CENTER_ALIGNMENT);
        checkButton.setAlignmentX(CENTER_ALIGNMENT);
        resultLabel.setAlignmentX(CENTER_ALIGNMENT);
        
        add(inputField);
        add(checkButton);
        add(resultLabel);

        checkButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(inputField.getText().trim());
                resultLabel.setText(num + (num % 2 == 0 ? " is even" : " is odd"));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid number");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UI_App_Odd_Even().setVisible(true));
    }
}
