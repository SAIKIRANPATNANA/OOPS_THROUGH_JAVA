package in.rguktn.even;
public class EvenData{
    public int[] even(){
        int Even[] = new int[50];
        int t = 0;
        for(int i=1; i<=100; i++){
            if(i%2==0){
                Even[t] = i;
                t++;
            }
        }return Even;
    }
}
