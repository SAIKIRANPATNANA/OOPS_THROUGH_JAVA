package MainPackage;
import ArithmeticPackage.*;
public class Main{
    public static int addition(int a, int b){
        return Addition.performAddition(a,b);
    }public static int subtraction(int a, int b){
        return Substraction.performSubtraction(a,b);
    }public static int multiplication(int a, int b){
        return Multiplication.performMultiplication(a,b);
    }public static float division(int a, int b){
        return Division.performDivision(a,b);
    }public static float addition(float a, float b){
        return Addition.performAddition(a,b);
    }public static float subtraction(float a, float b){
        return Substraction.performSubtraction(a,b);
    }public static float multiplication(float a, float b){
        return Multiplication.performMultiplication(a,b);
    }public static float division(float a, float b){
        if(b==0){
            return -1;
        }return Division.performDivision(a,b);
    }public static void main(String[] args) {
        System.out.println(subtraction(1,2));
    }
}
