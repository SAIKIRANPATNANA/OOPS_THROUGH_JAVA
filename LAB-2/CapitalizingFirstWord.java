import java.util.*;
public class CapitalizingFirstWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentecne: ")   ;
        String sentence = scanner.nextLine();
        String pascal_sentence = " ";
        pascal_sentence += sentence.substring(0,1).toUpperCase();
        for(int i=1; i<sentence.length(); i++){
            if(sentence.charAt(i-1) == ' ' && sentence.charAt(i)!=' '){
                pascal_sentence += sentence.substring(i, i+1).toUpperCase();
            }else {
                pascal_sentence += sentence.charAt(i);
            }
        }System.out.println("sentence in pascal case: "+pascal_sentence);
        scanner.close();
    }
}
