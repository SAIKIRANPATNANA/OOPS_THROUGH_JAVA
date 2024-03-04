import java.util.Scanner;
class Prime{
    public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("enter numeber: ");
        int n = scanner.nextInt();
        int flag = 1;
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println(n+ " is not a prime number.");
                flag = 0;
                break;
            }
        }if(n>1 && flag==1){
            System.out.println(n+ " is a prime number.");
        }else{
            System.out.println(n+" is not a prime number.");
        }scanner.close();
    }
}
