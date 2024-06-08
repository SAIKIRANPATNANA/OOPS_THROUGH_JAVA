import java.util.*;
import java.lang.*;
abstract class CricketMatchScoreBoard{
    static int score;
    public void scoring(int runs){
        this.score += runs;
    }
}class Scorer extends CricketMatchScoreBoard{
    final static int overs = 5;
    Scorer(){
        super.score = 0;
    }public void Scoring(int runs){
        this.score += runs;
    }public int getScore(){
        return this.score;
    }
}public class Question4{
    static int[] sortEvenOdd(int [] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j+=2){
                if(j+2<n && a[j]>a[j+2]){
                    a[j] ^= a[j+2];
                    a[j+2] ^= a[j];
                    a[j] ^= a[j+2];
                }
            }
        }for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j+=2){
                if(j+2<n && a[j]>a[j+2]){
                    a[j] ^= a[j+2];
                    a[j+2] ^= a[j];
                    a[j] ^= a[j+2];
                }
            }
        }return a;
    }public static void main(String[] args) {
        int a[] = new int[]{5,2,3,1,4};
        sortEvenOdd(a);
        for(int val: a){
            System.out.print(val+" ");
        }System.out.println();
        Scorer scorer1 = new Scorer();
        Scorer scorer2 = new Scorer();
        int flag = 1;
        try{
            Random r = new Random();
            for(int i=0; i<scorer1.overs*6; i++){
                scorer1.Scoring(r.nextInt(7));
            }System.out.println("Innings Break");
            System.out.println("Team 2 Target: "+ scorer1.getScore());
            for(int i=0; i<scorer2.overs*6; i++){
                scorer2.Scoring(r.nextInt(7));
                if(scorer2.getScore()>scorer1.getScore()){
                    System.out.println("Team 1 own the match with difference "+(scorer2.getScore()-scorer1.getScore())+" runs.");
                    flag = 0;
                    break;
                }
            }
        }finally{
            if(flag==1){
                if(scorer1.getScore()==scorer2.getScore()){
                    System.out.println("Match tied.");
                }else{
                    System.out.println("Team 1 own the match with difference "+(scorer1.getScore()-scorer2.getScore())+" runs.");
                }
            }
        }
    }
}
