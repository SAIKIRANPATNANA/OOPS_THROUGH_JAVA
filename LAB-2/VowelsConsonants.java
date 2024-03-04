import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args){
        System.out.print("Enter sentence: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        int v,c,d,s,spl;
        v = c = d = s = spl = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v += 1;
            }else if((int)ch>=97 && (int)ch<=122){
                    c += 1;
            }else if((int)ch >= 48 && (int)ch <= 57){
                    d += 1;
            }else if(str.charAt(i) == ' '){
                    s += 1;
            }else{
                spl += 1;
            }
        }
        System.out.println("Number of vowels: "+v);
        System.out.println("Number of consonants: "+c);
        System.out.println("Number of spaces: "+s);
        System.out.println("Number of words: "+(s+1));
        System.out.println("Number of digits: "+d);
        System.out.println("Number of special characters: "+spl);
        scanner.close();
    }
}