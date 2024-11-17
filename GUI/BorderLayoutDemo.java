package GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public static void main(String[] args) {
        BorderLayoutDemo bld = new BorderLayoutDemo();
        bld.setVisible(true);
        bld.setSize(400, 500);
        bld.setTitle("Border Layout");
    }

    JButton jb1 = null;
    JButton jb2 = null;
    JButton jb3 = null;
    JButton jb4 = null;
    JButton jb5 = null;
    JLabel jl1 = null;
    JTextArea jta = null;
    JTextField jtf = null;
    JPanel pflow = null;
    JPanel pgrid = null;

    public BorderLayoutDemo() {
        jb1 = new JButton("Center");
        add(jb1, BorderLayout.CENTER);

        jb2 = new JButton("West");
        add(jb2, BorderLayout.WEST);

        jb3 = new JButton("South");
        add(jb3, BorderLayout.SOUTH);

        jb4 = new JButton("East");
        add(jb4, BorderLayout.EAST);

        jb5 = new JButton("North");
        add(jb5, BorderLayout.NORTH);

        pflow = new JPanel();
        pflow.setLayout(new FlowLayout());
        jta = new JTextArea(10, 10);
        jtf = new JTextField(10);
        jl1 = new JLabel("Welcome");

        pflow.add(jta);
        pflow.add(jtf);
        pflow.add(jl1);

        pgrid = new JPanel();
        pgrid.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pgrid.add(new JButton("I" + (i * 3 + j)));
            }
        }

        add(pgrid, BorderLayout.CENTER);
        add(pflow,BorderLayout.NORTH);
    }
}
