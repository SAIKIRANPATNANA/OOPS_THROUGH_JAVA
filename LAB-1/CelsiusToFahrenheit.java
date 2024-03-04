import java.util.Scanner;
public class CelsiusToFahrenheit{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        float celsius_temp = scanner.nextFloat();
        float fahrenheit_temp = ((9*celsius_temp)/5)+32;
        System.out.println("Temperature in Fahrenheit: "+fahrenheit_temp+" F");
        scanner.close();
    }
}