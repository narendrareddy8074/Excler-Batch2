import java.util.Scanner;
class Demo14 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Enter Values:");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Before Swapping:"+a+" "+b);
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("After Swapping:"+a+" "+b);
    
    }  
}