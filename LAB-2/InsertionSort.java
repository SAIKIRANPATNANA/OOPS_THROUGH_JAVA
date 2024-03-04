import java.util.Scanner;
public class InsertionSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items to sort: ");
        int n  = scanner.nextInt();
        int array[] = new int[n];
        System.out.print("Enter items: ");
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }for(int i = 1; i<n; i++){
            int j = i-1;
            int trend = array[i];
            while(j!=-1 && array[j]>trend){
                array[j+1] = array[j];
                j--;
            }array[j+1] = trend;
        }System.out.print("Sorted array of items: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }System.out.println();
        scanner.close();
    }
}
