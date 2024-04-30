import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        String number = Integer.toString(num);
        int n = number.length();
        int flag = 0;
        for(int i=0; i<n/2; i++){
            if(number.charAt(i) != number.charAt(n-i-1)){
                flag = 1;
                break;
            }
        }if(flag==0){
            System.out.println("Your entered number "+ number+" is a palindrome.");
        }else {
            System.out.println("Your entered number "+ number+" is not a palindrome.");
        }scanner.close();
    }
}