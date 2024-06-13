package in.rguktn.data;
import in.rguktn.even.EvenData;
import in.rguktn.odd.OddData;
public class FinalData {
    public static void display(){
        EvenData ed = new EvenData();
        OddData od = new OddData();
        int Even[] = ed.even();
        int Odd[] = od.odd();
        for(int i=0; i<Even.length; i++){
            System.out.println(Even[i]);
        }for(int i=0; i<Odd.length; i++){
            System.out.println(Odd[i]);
        }return;
    }public static void main(String[] args) {
        display();
    }
}
