public class EvenOddSorting {
    public static void main(String[] args){
        int array[] = {16,42,90,1,5,26,30,71,19,7};
        int odd,even;
        if(array.length%2==1){
            even = array.length/2 + 1;
            odd = array.length/2;
        }else {
            odd = array.length/2;
            even = array.length/2;
        }int even_array[] = new int[even];
        int odd_array[] = new int[odd];
        odd = 0;
        even = 0;
        for(int i=0; i<array.length; i++){
            if(i%2==1){
                odd_array[odd] = array[i];
                odd++;
            }else if(i%2==0){
                even_array[even] = array[i];
                even++;
            }
        }for(int i=0; i<odd_array.length; i++){
            for(int j=0; j<odd_array.length-i-1; j++){
                if(odd_array[j]>odd_array[j+1]){
                    odd_array[j]=odd_array[j]^odd_array[j+1];
                    odd_array[j+1]=odd_array[j]^odd_array[j+1];
                    odd_array[j] = odd_array[j]^odd_array[j+1];
                }
            }
        }for(int i=0; i<even_array.length; i++){
            for(int j=0; j<even_array.length-i-1; j++){
                if(even_array[j]>even_array[j+1]){
                    even_array[j] = even_array[j]^even_array[j+1];
                    even_array[j+1] = even_array[j]^even_array[j+1];
                    even_array[j] = even_array[j]^even_array[j+1];
                }
            }
        }odd = 0;
        even = 0;
        for(int i=0; i<array.length; i++){
            if(i%2==1){
                array[i] = odd_array[odd];
                odd++;
            }else{
                array[i] = even_array[even];
                even++;
            }
        }for(int val: array){
            System.out.print(val+" ");
        }
    }
}
