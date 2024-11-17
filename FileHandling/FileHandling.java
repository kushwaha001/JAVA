package FileHandling;

import java.io.*;
public class FileHandling {
    public static void main(String[] args)  {
        File f1=null;//Declare these outside try block
        FileWriter fw = null;
        try {
            f1 = new File("C:\\Users\\ASUS\\Desktop\\SEM-3\\JAVA\\FileHandling.FileHandling");
            boolean status = f1.exists();
            System.out.println("Befor status " + status);
            f1.createNewFile();
            boolean status1 = f1.exists();
            System.out.println("After status " + status1);

            String name = f1.getName();
            System.out.println(name);

            File f2 = new File("C:\\Users\\ASUS\\Desktop\\SEM-3\\JAVA\\ExceptionHandling");
            System.out.println("1" + f2.exists());
            System.out.println(f2.isFile());
            System.out.println(f2.isDirectory());

            fw = new FileWriter(f1);
            fw.write("Hello ,Kanishk here!!");
            System.out.println("Length of File :" + f1.length());
            FileReader fr=new FileReader(f1);

            int vowel=0;
            for (int i = 0; i < f1.length(); i++) {
                char s[] = new char[(int) f1.length()];
                System.out.println(s);

            }
            File f3 = new File("C:\\Users\\ASUS\\Desktop\\SEM-3\\JAVA");
            f3.mkdir();
            System.out.println("2 " + f3.isDirectory());
            System.out.println(f3.exists());

            int fcount = 0;
            int dcount = 0;

            String[] all = new String[0];
            for (String name1 : all) {
                File f4 = new File("C:\\Users\\ASUS\\Desktop\\SEM-3\\JAVA");
                if (f4.isFile()) ;
                {
                    fcount++;
                }
                if (f4.isDirectory()) {
                    dcount++;
                }
            }
            System.out.println("File " + fcount);
            System.out.println("Directory " + dcount);

            all = f3.list();
            File fall[] = f3.listFiles();

        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
finally
        {
            try
            {
                if(fw!=null)
                {
                    fw.flush();
                    fw.close();
                    fw =null;
                    System.out.println("Length of File "+f1.length());
                }
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}



