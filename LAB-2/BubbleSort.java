import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items to sort: ");
        int n  = scanner.nextInt();
        int array[] = new int[n];
        System.out.print("Enter items: ");
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(array[j] > array[j+1]){
                    array[j] ^= array[j+1];
                    array[j+1] ^= array[j];
                    array[j] ^= array[j+1];
                }
            }
        }System.out.print("Sorted array of items: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }System.out.println();
        scanner.close();
    }
}
