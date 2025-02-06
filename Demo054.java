class TimePass {
    public void method1() {
        System.out.println("Method Overloading 1 - No parameters.");
    }

    public void method1(String message) {
        System.out.println("Method Overloading 1 - With message: " + message);
    }

    public void method1(int number) {
        System.out.println("Method Overloading 1 - With number: " + number);
    }
}
public class Demo054 {
    public static void main(String[] args) {
        TimePass s1 = new TimePass();
        s1.method1();
        s1.method1("Hello Malla Reddy University...!"); 
        s1.method1(659); 
    }
}