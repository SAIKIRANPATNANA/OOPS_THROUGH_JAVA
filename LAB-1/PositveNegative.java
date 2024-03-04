import java.util.Scanner;
class PositiveNegative{
    public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("enter number: ");
        int n = scanner.nextInt();
        if(n>0){
            System.out.println(n+" is positive number.");
        }else if (n<0){
            System.out.println(n+" is negative number.");
        }else {
            System.out.println(n+" is neither negative nor positive.");
        }scanner.close();
    }
}
