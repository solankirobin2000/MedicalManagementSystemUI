import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MedicalManagementSystemUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Virtual Medicine Home");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for login
        JPanel loginPanel = new JPanel();
        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);

        // Create a panel for functionalities
        JPanel functionPanel = new JPanel();
        JTextArea displayArea = new JTextArea(20, 60);
        displayArea.setEditable(false);

        functionPanel.add(displayArea);

        // Add action listeners for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Authenticate the user based on entered credentials
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                // Perform authentication logic here (not implemented in this basic example)

                // For demonstration, show a welcome message in the display area
                displayArea.setText("Welcome, " + username + "!");
            }
        });

        // Add panels to the frame
        frame.setLayout(new BorderLayout());
        frame.add(loginPanel, BorderLayout.NORTH);
        frame.add(functionPanel, BorderLayout.CENTER);

        // Set the frame visibility
        frame.setVisible(true);
    }
}
