import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
    
        int tens = number / 10;  
        int ones = number % 10;  
        
        int sum = tens + ones;
        System.out.println(tens + " + " + ones + " = " + sum);
        
        }
}