import java.io.*;
public class FileHandling1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("abc.txt");
        String str = "";
        while(true){
            int a = fr.read();
            if(a !=-1){
                str  += (char)a;
            }else {
                break;
            }
        }fr.close();
        int words = 0;
        int vowels = 0;
        int sentences = 0;
        System.out.println(str);
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==' ' || str.charAt(i) == '\n'){
                words++;
            }if(str.charAt(i)=='a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'u'){
                vowels++;
            }if(str.charAt(i)=='\n'){
                System.out.println("yes");
                sentences++;
            }
        }if(words!=0){
            words++;
        }if(sentences!=0){
            sentences++;
        }System.out.println(words);
        System.out.println(vowels);
        System.out.println(sentences);
        FileWriter fw = new FileWriter("xyz.txt");
        for(int i=0; i<str.length(); i++){
            fw.write(str.charAt(i));
        }fw.append("\nHello Bro..!");
        fw.close();
        FileReader f = new FileReader("FileHandling.java");
        String code = "";
        while(true){
            int a = f.read();
            if(a !=-1){
                code  += (char)a;
            }else {
                break;
            }
        }System.out.print(code);
    }
}