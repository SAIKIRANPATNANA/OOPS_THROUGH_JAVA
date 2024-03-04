import java.util.Scanner;
public class FrequencyCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        int flag[] = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            if(flag[i] == 0){
                int c = 0;
                for(int j=0; j<str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)){
                        flag[j] = 1;
                        c += 1;
                    }
                }if(c != 0){
                    System.out.println( str.charAt(i) + ": " + c);
                }
            }
        }scanner.close();
    }
}
