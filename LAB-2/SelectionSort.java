import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items to sort: ");
        int n  = scanner.nextInt();
        int array[] = new int[n];
        System.out.print("Enter items: ");
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }for(int i=0; i<n-1; i++){
            int min_idx = i;
            for(int j=i+1; j<n; j++){
                if(array[min_idx]>array[j]){
                    min_idx = j;
                }
            }if(min_idx!=i){
                array[i] ^= array[min_idx];
                array[min_idx] ^= array[i];
                array[i] ^= array[min_idx];
            }
        }System.out.print("Sorted array of items: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }System.out.println();
        scanner.close();
    }
}
