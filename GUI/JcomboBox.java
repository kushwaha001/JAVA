//package GUI;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class JcomboBoxDemo extends JFrame implements ActionListener
//{
//    JcomboBox comboTypeList=null;
//    Container c =null;
//    public JcomboBoxDemo() {
//        c = getContentPane();
//        String[] comboTypes = {"J2SE", "J2EE", "STRUTS", "HIBERNATE", "SPRING"};
//        //Create the combo box and 2nd item as Default
//        comboTypeList = new JcomboBox(comboTypes);
//        comboTypeList.setSelectedIndex(2);
//        jta = new JTextArea(10, 20);
//        c.setLayout(new FlowLayout());
//        c.add(comboTypeList);
//        c.add(jta);
//
//        comboTypeList.addActionListener(this);
//
//    }
//    public static void main(String[] args){
//        JcomboBoxDemo jcb=new JcomboBoxDemo();
//        jcb.setVisible(true);
//        jcb.setSize(300,300);
//    }
//    public void actionPerformed(ActionEvent e){
//        JComboBox jcmbType=(JComboBox) e.getSource();
//        String cmbType=(String) jcmbType.getSelectedItem();
//        if(cmbType.equals("J2SE"));
//        {
//            jta.setText(cmbType);
//            jta.setBackGround(Color.CYAN);
//
//        }
//
//    }
//}
