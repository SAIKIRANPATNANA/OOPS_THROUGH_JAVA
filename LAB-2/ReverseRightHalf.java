public class ReverseRightHalf{
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int n = array.length;
        int dupArray[] = new int[n/2];
        for(int i=0; i<n/2; i++){
            dupArray[i] = array[n-i-1];
        }int i,j;
        for(i=n/2,j=0; i<n; i++,j++){
            array[i] = dupArray[j];
        }for(int val: array){
            System.out.print(val+" ");
        }
    }
}