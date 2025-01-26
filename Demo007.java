import java.util.Scanner;
public class Demo007 {
        public static void main (String[] args){
            String name;
            int age;
            long phone_number;
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            age = sc.nextInt();
            phone_number = sc.nextLong();
            System.out.println("Name is"+name+"and age is "+age+" and phone number is "+phone_number);
            }
        }
