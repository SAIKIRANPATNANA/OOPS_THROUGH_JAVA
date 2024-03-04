public class EqualSumPartition {
    public static void main(String[] args){
        int array[] = {1,2,3,4,10};
        int sum = 0;
        for(int val: array){
            sum += val;
        }int sum_array[] = new int[array.length];
        sum_array[0] = array[0];
        for(int i=1; i<array.length; i++){
            sum_array[i] = 0;
            sum_array[i] += sum_array[i-1]+array[i];
        }int result_idx = -1;
        for(int i=0; i<array.length; i++){
            if(sum_array[i] == sum-sum_array[i]){
                result_idx = i;
                break;
            }
        }if(result_idx!=-1){
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
                if(i==result_idx){
                    System.out.println();
                }
            }
        }
    }
}
