package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class UI extends JFrame implements ItemListener, ActionListener, KeyListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public UI() {
        // Set up the frame
        setTitle("Login");
        setSize(100, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        messageLabel = new JLabel("");

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel("")); // Empty cell
        add(loginButton);
        add(messageLabel);

        // Add action listeners
        loginButton.addActionListener(this);
        usernameField.addKeyListener(this);
        passwordField.addKeyListener(this);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Handle item state changes if needed
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Perform login action (this is just a simple example)
        if (username.equals("user") && password.equals("pass")) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Login failed!");
        }
    }

    public static void main(String[] args) {
        new UI() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
    }
}
