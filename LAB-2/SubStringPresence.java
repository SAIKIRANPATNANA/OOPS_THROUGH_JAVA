import java.util.*;
public class SubStringPresence{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter String: ");
            String sentence = scanner.nextLine();
            System.out.print("Enter SubString: ");
            String substr = scanner.nextLine();
            String mod_sentence = "";
            for(int i=0; i<sentence.length(); i++) {
                if(sentence.charAt(i)!=' '){    
                    mod_sentence += sentence.charAt(i);
                }
            }int flag = 0;
            for(int i=0; i<mod_sentence.length(); i++){
                if(mod_sentence.charAt(i)==substr.charAt(0)){
                    int t = i+1;
                    for(int j=1; j<substr.length(); j++){
                        if(mod_sentence.charAt(t)==substr.charAt(j)){
                             flag = 1;
                        }else {
                            flag  = 0;
                        }t++;
                    }
                }if(flag == 1){
                    System.out.println("Your entered substring is found in the given string");
                    break;
                }
            }if(flag==0){
                System.out.println("Your entered substring is NOT found in the given string");
            }scanner.close();
        }

}