package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginForm {

  private JButton buttonLogin;
  private JPanel panelMain;
  private JTextField txt_username;
  private JPasswordField txt_password;
  private JPanel panelCredentials;
  private String ErrorMessage;

  private boolean validateFields() {
    if (txt_username.getText().trim().length() == 0 || txt_password.getPassword().length == 0) {
      ErrorMessage = "Please enter a txt_username and a txt_password.";
      return false;
    } else {
      return true;
    }
  }

  private boolean authenticateLogin() {
    if (Objects.equals(txt_username.getText(), "root") && (txt_password.getPassword().toString().equals("toor"))) {
      return true;
    } else {
      ErrorMessage = "Invalid txt_username or txt_password.";
      return false;
    }
  }

  private LoginForm() {
    buttonLogin.addActionListener(new ActionListener() {
      /**
       * Invoked when an action occurs.
       */
      @Override
      public void actionPerformed(ActionEvent e) {

        if (!validateFields()) {
          JOptionPane
              .showMessageDialog(null, ErrorMessage);
        } else {
          if ((authenticateLogin())) {
            JOptionPane.showMessageDialog(null, "Login Successful");
          } else {
            JOptionPane.showMessageDialog(null, ErrorMessage);
          }
        }
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Login Form");
    frame.setContentPane(new LoginForm().panelMain);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}