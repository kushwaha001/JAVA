package GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class List extends JFrame implements ListSelectionListener {
    JList list;
    String [] listColorNmaes={"J2SE","J2EE","STRUTS","HIBERNATE","SPRING"};
    Color[] listColorValues={Color.cyan,Color.BLUE,Color.GREEN,Color.YELLOW,Color.WHITE};
    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
