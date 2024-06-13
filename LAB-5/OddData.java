package in.rguktn.odd;
public class OddData{
    public int[] odd(){
        int Odd[] = new int[50];
        int t = 0;
        for(int i=1; i<=100; i++){
            if(i%2==1){
                Odd[t] = i;
                t++;
            }
        }return Odd;
    }
}