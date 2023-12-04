
package loginsystem;
 import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LogInSystem {

   

public class LoginSystem extends JFrame implements ActionListener {
    private final JTextField usernameField;
    private final JPasswordField passwordField;

    public LoginSystem() {
        setTitle("Login System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 80, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(140, 50, 150, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 90, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 90, 150, 25);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 140, 80, 25);
        loginButton.addActionListener(this);
        add(loginButton);

        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Hardcoded username and password for demonstration
        String validUsername = "user";
        String validPassword = "password";

        if (username.equals(validUsername) && password.equals(validPassword)) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
            // You can add code here to navigate to the next window or perform an action upon successful login
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Try again.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LogInSystem::new);
    }
}
}
