package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DemoBox extends JFrame implements ItemListener {
    public static void main(String[] args) {
        DemoBox db=new DemoBox();
        db.setVisible(true);
        db.setSize(500,500);
        db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JCheckBox cb1,cb2;
    JRadioButton jb1,jb2;
    ButtonGroup bg;
    JTextArea jta;
    Container c=null;
    public DemoBox() {
        setLayout(new FlowLayout());
        cb1 = new JCheckBox("JAVA");
        cb2 = new JCheckBox("Python");
        jb1 = new JRadioButton("C", true);
        jb2 = new JRadioButton("CPP", false);
        bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        jta = new JTextArea(10, 20);
        jta.setBackground(Color.cyan);
        c = getContentPane();
        c.add(cb1);
        c.add(cb2);
        c.add(jb1);
        c.add(jb2);
        c.add(jta);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        jb1.addItemListener(this);
        jb2.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e){
        String msg=" ";
        if(cb1.isSelected()){
            msg=msg+"\n"+cb1.getText();
        }
        if(cb2.isSelected()){
            msg=msg+"\n"+cb2.getText();
        }
        jta.setText(msg);
        msg="";
    }

}