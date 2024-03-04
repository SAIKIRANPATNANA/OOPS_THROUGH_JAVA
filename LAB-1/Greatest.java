import java.util.Scanner;
class Greatest{
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("enter any three numbers here: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is the greatest number.");
            }else{
            	System.out.println(c+" is the greatest number.");
	    }
        }else if(b>a){
             if(b>c){
                System.out.println(b+" is the greatest number.");
            }else{
            	System.out.println(c+" is the greatest number.");
	    }scanner.close();
	}
    }
}
