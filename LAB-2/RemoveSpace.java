import java.util.*;
public class RemoveSpace{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter String: ");
            String sentence = scanner.nextLine();
            String mod_sentence = "";
            for(int i=0; i<sentence.length(); i++) {
                if(sentence.charAt(i)!=' '){    
                    mod_sentence += sentence.charAt(i);
                }
            }System.out.println("Your entered string without spaces is " + mod_sentence);
            scanner.close();
        }

}