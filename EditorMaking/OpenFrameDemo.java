package EditorMaking;

import javax.swing.*;
import java.io.*;

public class OpenFrameDemo extends JFrame {
    private JTextArea jta;

    public OpenFrameDemo(File f1) {
        jta = new JTextArea();

        try {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String msg, msg1 = "";

            while ((msg = br.readLine()) != null) {
                msg1 += msg + "\n";  // Use msg1 to accumulate text with line breaks
            }
            jta.setText(msg1);
            add(jta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}


