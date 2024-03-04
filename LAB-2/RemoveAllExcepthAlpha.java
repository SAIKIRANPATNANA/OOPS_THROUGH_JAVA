import java.util.Scanner;

public class RemoveAllExcepthAlpha {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String alpha = "";
        for(int i=0; i<sentence.length(); i++){
            int ch = (int) sentence.charAt(i);
            if(ch>=65 && ch<= 90 || ch>=97 && ch<=122){
                alpha += sentence.charAt(i);
            }
        }System.out.println("Alphabets in sentence: " + alpha);
        System.out.println("Count of characters: " + sentence.length());
        scanner.close();
    }
}
