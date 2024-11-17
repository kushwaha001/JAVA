package FileHandling;

import java.io.File;

public class Extension {
    public static void main(String[] args) {
        int pdf=0;
        int cpp=0;
        int java=0;
        File f3 = new File("C:\\Users\\ASUS\\Desktop\\SEM-3\\JAVA");
        String[] all = f3.list();
        for (String name : all) {

            System.out.println(name);
            int l=name.lastIndexOf('.');
            String ex_name=name.substring(l+1);
            if(ex_name.equals("pdf")){
                pdf++;
                }
            if(ex_name.equals("cpp")){
                cpp++;
            }
            if(ex_name.equals("java")){
                java++;
            }
            }
        System.out.println("cpp: "+cpp+" java: "+java+" pdf: "+pdf);
        }
    }

