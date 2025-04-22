import javax.swing.*;

public class UI_App_Palindrome extends JFrame {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public UI_App_Palindrome() {
        setTitle("Palindrome Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        inputField = new JTextField(10); // Adjusted size for better input handling
        checkButton = new JButton("Check Palindrome");
        resultLabel = new JLabel("Result");

        inputField.setHorizontalAlignment(JTextField.CENTER);
        inputField.setMaximumSize(inputField.getPreferredSize()); // Restrict input field size
        inputField.setAlignmentX(CENTER_ALIGNMENT);
        checkButton.setAlignmentX(CENTER_ALIGNMENT);
        resultLabel.setAlignmentX(CENTER_ALIGNMENT);
        
        add(inputField);
        add(checkButton);
        add(resultLabel);

        checkButton.addActionListener(e -> {
            String text = inputField.getText().trim();
            if (text.isEmpty()) {
                resultLabel.setText("Please enter a value");
                return;
            }
            
            String reversed = new StringBuilder(text).reverse().toString();
            if (text.equalsIgnoreCase(reversed)) {
                resultLabel.setText("Palindrome");
            } else {
                resultLabel.setText("Not a Palindrome");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UI_App_Palindrome().setVisible(true));
    }
}
