//Write a Java program to check if a number is Armstrong or not


//Armstrong number is a number that is equal to the sum of cubes of its digits

import java.util.Scanner;

public class Demo052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int original = number, sum = 0;
        
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;  
            number /= 10;
        }
        
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
