import java.util.Scanner;
class EvenOdd{
    public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("enter number: ");
        int n = scanner.nextInt();
        if(n%2==1){
            System.out.println(n+" is an odd number.");
        }else{
            System.out.println(n+" is an even number.");
        }scanner.close();
    }
}
