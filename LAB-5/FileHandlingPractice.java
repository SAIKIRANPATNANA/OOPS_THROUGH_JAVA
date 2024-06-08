import java.util.*;
import java.io.*;
public class FileHandlingPractice {
    public static void main(String[] args) throws Exception {
        File f1 = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5");
        String [] files = f1.list();
        for(String str: files){
            File f2 = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5",str);
            if(f2.isDirectory()){
                System.out.println(str + "is a directory.");
            }else if(f2.isFile()){
                System.out.println(str + "is a file.");
            }
        }File f3 = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt");
        if(f3.exists()){
            System.out.println("It already exists.");
        }else{        
            f3.createNewFile();
        }FileInputStream fis = new FileInputStream("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt");
        int i = 0;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        }fis.close();
        FileOutputStream fos = new FileOutputStream("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt",true);
        String s = "Radha is loved by raju.\n";
        byte b[] = s.getBytes();
        fos.write(143);
        fos.write(b);
        fos.flush();
        fos.close();
        File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt");
        FileReader fr = new FileReader(f);
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }char c[] = new char[(int)f.length()];
        fr = new FileReader(f);
        fr.read(c);
        System.out.println(c);
        fr.close();
        FileWriter fw = new FileWriter("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt",true);
        fw.write("Radha is loved by raju.\n");
        fw.flush();
        fw.close();
        fw = new FileWriter("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt",true);
        String st = "Radha is loved by raju.\n";
        char ch[] = new char[st.length()];
        st.getChars(0,st.length(),ch,0);
        fw.write(ch,0,ch.length);
        fw.flush();
        fw.close();
        fr = new FileReader("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }br.close();
        fr.close();
        fw = new FileWriter("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Radha is loved by raju.\n");
        bw.newLine();
        bw.flush();
        bw.close();
        fw.close();
        PrintWriter pw = new PrintWriter("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/sai.txt");
        pw.write("Radha is loved by raju.\n");
        pw.flush();
        pw.close();
    }
}
