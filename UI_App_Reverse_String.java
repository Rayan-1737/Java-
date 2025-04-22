import javax.swing.*;

public class UI_App_Reverse_String extends JFrame {
    private JTextField inputField;
    private JButton reverseButton;
    private JLabel resultLabel;

    public UI_App_Reverse_String() {
        setTitle("Reverse String");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        inputField = new JTextField(10);                    
        reverseButton = new JButton("Reverse String");
        resultLabel = new JLabel("Result");

        inputField.setHorizontalAlignment(JTextField.CENTER);
        inputField.setMaximumSize(inputField.getPreferredSize());    
        inputField.setAlignmentX(CENTER_ALIGNMENT);
        reverseButton.setAlignmentX(CENTER_ALIGNMENT);
        resultLabel.setAlignmentX(CENTER_ALIGNMENT);
        
        add(inputField);
        add(reverseButton);
        add(resultLabel);

        reverseButton.addActionListener(e -> {
            String text = inputField.getText().trim();
            if (text.isEmpty()) {
                resultLabel.setText("Please enter a value");
                return;
            }
            
            String reversed = new StringBuilder(text).reverse().toString();
            resultLabel.setText("Reversed: " + reversed);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UI_App_Reverse_String().setVisible(true));
    }
}
