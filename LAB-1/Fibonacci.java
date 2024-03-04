import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        int i = 0;
        int j = 1;
        if(n!=0){
            if(n==1){
                System.out.print(i + " ");
                n -= 1; 
            }else if(n>=2){
                System.out.print(i + " "+ j + " ");
                n -= 2;
            }for(int k=0; k<n; k++){
                int t = i+j;
                System.out.print(t+" ");
                i = j;
                j = t;
            }
        }scanner.close();
    }
}