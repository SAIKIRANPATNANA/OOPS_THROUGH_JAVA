import java.util.Scanner;
class SwapNumbers{
    public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("enter numbers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("Before Swapping "+m+" "+n);
        SwapBusiness sb = new SwapBusiness(m,n);
        sb.swap();
        sb.display();
        scanner.close();
    }
}class SwapBusiness{
    int m,n;
    public SwapBusiness(int m, int n) {
        this.m = m;
        this.n = n;
    }void swap(){
        this.m = this.m^this.n;
        this.n = this.m^this.n;
        this.m = this.m^this.n;
        return;
    }void display(){
        System.out.println("After Swapping: "+this.m+" "+this.n);
        return;
    }
}