import java.util.Scanner;
class Factorial{
    static int getFactorial(int n){
        if (n==1){
            return 1;
        }return n*getFactorial(n-1);
    }public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of "+n+" is "+getFactorial(n)+".");
        scanner.close();
    }

}

