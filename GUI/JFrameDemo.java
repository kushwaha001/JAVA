package GUI;

import com.sun.security.auth.module.JndiLoginModule;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDemo extends JFrame implements ActionListener
{
    public static void main(String[] args) {
        JFrameDemo jfd=new JFrameDemo();
        jfd.setTitle("My Frame");
        jfd.setVisible(true);
        jfd.setSize(400,400);
        jfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JButton addittion,sub;
    JTextArea jta,jtb,result;

    public JFrameDemo(){
        setLayout(new FlowLayout());
        addittion=new JButton("ADD");
        sub= new JButton("SUB");
        jta=new JTextArea("Enter a number");
        jta.setSize(10,10);
        jtb=new JTextArea("Enter b number");
        result=new JTextArea("Result");
        jtb.setSize(10,10);
        add(addittion);
        add(sub);
        add(jta);
        add(jtb);
        add(result);
        addittion.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(addittion.isEnabled()){
            System.out.println("Addition");
            int a=Integer.parseInt(jta.getText());
            int b=Integer.parseInt(jtb.getText());
            int s=a+b;
            System.out.println(s);
            result.setText(s+" ");
        }
    }
}
