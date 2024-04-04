import java.util.*;
class CustomException extends Exception {
    CustomException(String str){
        super(str);
    }
}public class VoteForRight{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int age  = scanner.nextInt();
            if(age<18){
                scanner.close();
                throw new CustomException("You are not eligible to vote.");
            }else{
                System.out.println("you are eligible to vote.");
            }
        }catch (CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }scanner.close();
    }
}
