import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter Elements: ");
        int array[] = new int[n];
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }System.out.print("Enter elelemt to be searched: ");
        int k = scanner.nextInt();
        int low = 0; 
        int high = n-1;
        int flag = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(array[mid]==k){
                flag = 1;
                System.out.println("Your required element is found at index " + mid);
                break;
            }else if(array[mid]>k){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }if(flag==0){
            System.out.println("Your required element is not found");
        }scanner.close();
    }
}