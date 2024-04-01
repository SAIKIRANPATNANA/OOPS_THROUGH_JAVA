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
            }
        }catch (CustomException exception){
            // System.out.println(exception.getMessage());
            exception.printStackTrace();
        }scanner.close();
    }
}