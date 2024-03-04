import java.util.Scanner;
class Coprimes{
    static int gcf(int a,int b){
        while(a%b!=0){
            int t = a%b;
            a = b;
            b = t; 
        }if(b==1){
            return 1;
        }return 0;
    }public static void main(String[] args){ 
    	Scanner scanner = new Scanner(System.in);
        System.out.print("enter any two numbers here: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(gcf(a,b)==1){
		System.out.println(a+ " & " + b + " are coprimes.");
	    }else{
		System.out.println(a+ " & " + b + " are not coprimes.");            
	    }scanner.close();

   }
}

