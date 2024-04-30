import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }System.out.print("Enter element to be searched: ");
        int k = scanner.nextInt();
        int flag = 0;
        System.out.println("Enter elelemts: ");
        for(int i=0; i<array.length; i++){
            if(array[i]==k){
                flag = 1;
                System.out.println("Your required element is found at index " + i);
            }
        }if(flag==0){
            System.out.println("Your required element is not found");
        }scanner.close();
    }
}