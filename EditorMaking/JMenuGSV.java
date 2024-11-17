package EditorMaking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JMenuGSV extends JFrame implements ActionListener, FocusListener {
    public static void main(String[] args) {
        JMenuGSV jmg=new JMenuGSV();
        jmg.setTitle("Note");
        jmg.setSize(500,500);
        jmg.setVisible(true);
        jmg.pack();
    }
    JMenuBar menu;
    JMenu file, edit,view,font;
    JMenuItem open,save,saveas,print,cut,copy,paste,tm,arial;
    JCheckBoxMenuItem password;
    public JMenuGSV(){
        menu=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");
        view=new JMenu("View");
        font=new JMenu("Font");
        menu.add(file);
        menu.add(edit);
        menu.add(view);

        open=new JMenuItem("Open");
        save=new JMenuItem("Save");
        saveas=new JMenuItem("SaveAs");
        print=new JMenuItem("Print");
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        tm=new JMenuItem("tm");
        arial=new JMenuItem("arial");
        password=new JCheckBoxMenuItem("Password");

        font.add(tm);    font.add(arial);     file.add(open);
        file.add(save);  file.add(saveas);     file.add(font);
        file.add(print);  edit.add(cut);        edit.add(paste);

        edit.add(password); add(menu, BorderLayout.NORTH);
        open.addActionListener(this);        save.addActionListener(this);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==open){
           JFileChooser jfc=new JFileChooser();
           int openStatus=jfc.showOpenDialog(this);
           if (openStatus==jfc.APPROVE_OPTION){
               File f1=jfc.getSelectedFile();
               System.out.println(f1.getAbsolutePath());
               OpenFrameDemo ofd=new OpenFrameDemo(f1);
               ofd.setVisible(true);
               ofd.setSize(500,500);
           }

       }  JTextArea jta=new JTextArea();

        if(e.getSource()==save){
       JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (FileWriter fw = new FileWriter(fileToSave)) {

                fw.write(jta.getText());  // Save JTextArea content to the file
                JOptionPane.showMessageDialog(this, "File saved successfully!");
            } catch (IOException e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
