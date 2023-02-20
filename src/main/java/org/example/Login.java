package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JFrame implements ActionListener {
    JPasswordField password;
    JTextField username;
    JLabel passwordText, usernameText, message, title;
    JButton signin;

    Login() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(900, 500);
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        usernameText = new JLabel("Username");
        usernameText.setBounds(200, 200, 100, 40);
        username = new JTextField();
        username.setBounds(300, 200, 300, 40);

        passwordText = new JLabel("Password");
        passwordText.setBounds(200, 250, 100, 40);
        password = new JPasswordField();
        password.setBounds(300, 250, 300, 40);

        signin = new JButton("Sign in");
        signin.setBounds(350, 300, 200, 40);
        signin.addActionListener(this);

        message = new JLabel("Message here");
        message.setBounds(300, 400, 300, 40);

        this.add(username);
        this.add(usernameText);
        this.add(password);
        this.add(passwordText);
        this.add(signin);
        this.add(message);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = username.getText();
        String pass = new String(password.getPassword());
        org.example.Entities.Login login = new org.example.Entities.Login();
        String msg = "Login success";
        if (login.isValidLogin(user, pass))
            message.setText(msg);
    }
}
