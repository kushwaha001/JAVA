package GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    public static void main(String[] args) {
        FlowLayoutDemo fld=new FlowLayoutDemo();
        fld.setVisible(true);
        fld.setSize(400,500);
    }
    JLabel jl=null;
    JTextArea jta=null;
    JTextField jtf=null;
public FlowLayoutDemo(){
    FlowLayout f1=new FlowLayout();
    setLayout(f1);
    jl=new JLabel("First");
    jta=new JTextArea(30,40);
    jtf=new JTextField(10);
    add(jtf);
    add(jl);
    add(jta);

}
}
