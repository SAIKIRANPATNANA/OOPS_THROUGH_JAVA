import java.util.Scanner;
public class oxygenTracking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] array2D = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter oxygen level for person " +(i+1)+ " on track " +(j+1)+ ": ");
                array2D[i][j] = scanner.nextInt();
                while(array2D[i][j]<1 || array2D[i][j]>100){
                    System.out.println("Invalid Input!");
                    System.out.print("Enter oxygen level for person " +(i+1)+ " on track " +(j+1)+ ": ");
                    array2D[i][j] = scanner.nextInt();
                }
            }
        }int[] average = new int[3];
        for(int i=0; i<3; i++){
            average[i] = 0;
            for(int j=0; j<3; j++){
                average[i] += array2D[i][j]; 
            }average[i] /= 3;
        }int flag = 0;
        for(int i=0; i<3; i++){
            if(average[i]<70){
                System.out.println("person-"+(i+1)+" is unfit.");
            }else{
                flag = 1;
            }
        }if(flag==0){
            System.out.println("all persons are unfit.");
        }else{
            int some = average[0];
            flag = 0;
            for(int i=1; i<3; i++){
                if(some==average[i]){
                    flag = 0;
                }else{
                    flag = 1;
                    break;
                }
            }if(flag==0){
                System.out.println("All are having same average oxygen level.");
            }else {
                // int top = 0;
                int higher = -1000;
                for(int i=0; i<3; i++){
                    if(higher<average[i]){
                        higher = average[i];
                        // top = i+1;
                    }
                }if(higher>70){
                    for(int i=0; i<3; i++){
                        if(higher==average[i]){
                            System.out.println("person-"+(i+1)+" is the performer.");
                        }
                    }
                }
             
            }
        }scanner.close();
    }
}
