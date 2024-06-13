import java.util.*;
import java.io.*;
import java.lang.*;
public class JavaFinal {
    public static void main(String[] args) throws Exception{
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // System.out.println(a+b);
        // if(a%400==0){
        //     System.out.println("It's a leap year.");
        // }else if(a%100!=0 && a%4==0){
        //     System.out.println("It's a leap year");
        // }else{
        //     System.out.println("It's not a leap year");
        // }
        FileReader fr = new FileReader("xyz.txt");
        BufferedReader br = new BufferedReader(fr);
        String xyz = "";
        String line = br.readLine();
        while(line!=null){
            xyz += line+'\n';
            line = br.readLine();
        }br.close();
        FileWriter fw = new FileWriter("pqr.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(xyz);
        bw.flush();        
        bw.close();
    }
}
