import java.io.*;
import java.util.*;
import java.lang.*;
public class Question1 {
  static void PrintPattern(int n, char ch){
    for(int i=1; i<=n; i++){
      if(i%2==1){
        for(int j=0; j<i; j++){
          System.out.print(ch+" ");
        }System.out.println();
      }else{
        for(int j=0; j<i; j++){
         System.out.print((i-1)+" ");
        }System.out.println();
      }
    }return;
  }static int getSumOfTheDigits(int n){
    System.out.println(n);
    while(n>=10){
      int n1 = n;
      n = 0;
      while(n1!=0){
        n += n1%10;
        n1 /= 10;
      }
    }return n;
  }public static void main(String[] args) throws Exception {
      File f1 = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/Question1.java");
      FileReader fr = new FileReader(f1);
      String code = new String();
      int i;
      while((i = fr.read()) != -1){
        code += (char)i;
      }String code_words[] = code.split(" ");
      File f2 = new File("code.txt");
      if(f2.exists()==false){
        f2.createNewFile();
      }FileWriter fw = new FileWriter(f2);
      for(i=0; i<code_words.length;  i++){
        String str = code_words[i];
        String reverse_str =  new String();
        for(int j=str.length()-1; j>=0; j--){
            reverse_str += str.charAt(j);
        }fw.append(reverse_str);
        fw.flush();
      }fr.close();
      fw.close();
      System.out.println(getSumOfTheDigits(1234));
      PrintPattern(5, '*');
   }
}
