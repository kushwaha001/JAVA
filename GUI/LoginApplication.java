package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginApplication extends JFrame implements ActionListener, FocusListener {
    public static void main(String[] args) {
        LoginApplication lp = new LoginApplication();
        lp.setVisible(true);
        lp.setSize(400, 500);
        lp.setTitle("Login Application");
    }
    JLabel luser,lpassword;
    JTextField tuser,tpass;
    JButton login,reset;
    Font f = null;
    public LoginApplication() {
        setLayout(new FlowLayout());
        f = new Font("TimesnewRoman",Font.ITALIC,20);
        luser = new JLabel("Username");
        luser.setFont(f);
        luser.setBackground(Color.lightGray);
        lpassword = new JLabel("Password");
        lpassword.setFont(f);
        lpassword.setBackground(Color.lightGray);
        tuser = new JTextField(10);
        tuser.setBackground(Color.green);
        tpass = new JTextField(10);
        tpass.setBackground(Color.green);
        add(luser);
        add(tuser);
        add(lpassword);
        add(tpass);

        login = new JButton("Login");
        reset = new JButton("Reset");
        add(login);
        add(reset);
        login.addActionListener(this);
        reset.addActionListener(this);
        reset.addFocusListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            if (tuser.getText().equals("gsv") && tpass.getText().equals("aids")) {
                JOptionPane.showMessageDialog(this, "Welcome " + tuser.getText());
            }
        }
        if (e.getSource() == reset) {

        }
    }
    public void focusGained(FocusEvent e) {
        System.out.println("Focus Gained");
        tpass.setBackground(Color.red);
    }
    public void focusLost(FocusEvent e) {
        System.out.println();
}
}