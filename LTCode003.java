import java.util.Scanner;

public class LTCode003 {
    public int myAtoi(String s) {
        int INT_MIN = Integer.MIN_VALUE;
        int INT_MAX = Integer.MAX_VALUE;
        
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int index = 0;

        
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        int result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }

            result = result * 10 + digit;
            index++;
        }

        result *= sign;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert to integer: ");
        String userInput = scanner.nextLine();

        LTCode003 solution = new LTCode003();

        int result = solution.myAtoi(userInput);
        System.out.println("Converted integer: " + result);

        scanner.close();
    }
}