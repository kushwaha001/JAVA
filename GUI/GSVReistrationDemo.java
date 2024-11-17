package GUI;

import javax.swing.*;
import java.awt.*;

public class GSVReistrationDemo extends JFrame {
    public static void main(String[] args) {
        GSVReistrationDemo gsv=new GSVReistrationDemo();
        gsv.setVisible(true);
        gsv.setTitle("Registartion Page");
        gsv.setSize(400,500);
        gsv.pack();
//        JOptionPane
    }
    JLabel lfname,laddress,lgender,lhobbies;
    JTextField tfname,taddress;
    JRadioButton male,female;
    ButtonGroup bg;
    JCheckBox hobbies;
    JButton reset;
    JPanel jp1,jp2,jp3,mp;
     GSVReistrationDemo()
     {
         mp=new JPanel();
         jp1=new JPanel();
         jp1.setLayout(new GridLayout(2,2));
         lfname=new JLabel("Fname");
         laddress=new JLabel("Address");
         tfname=new JTextField();
         taddress=new JTextField();

         jp1.add(lfname);
         jp1.add(tfname);
         jp1.add(laddress);
         jp1.add(taddress);

         mp.add(jp1);
         jp2=new JPanel();
         jp2.setLayout(new GridLayout(1,3));
         lgender=new JLabel("Gender");

     }
}
