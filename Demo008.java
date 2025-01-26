import java.util.Scanner;
public class Demo008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = " ";
        String pwd = " ";
        String reply;
        do {
            System.out.println("Welcome to mallareddy University");
            System.out.println("have you visited our site eariler");
            reply = sc.nextLine();
            if (reply.equals("no")) {
                System.out.println("Login Here");
                System.out.println("please enter the login id: ");
                loginid = sc.nextLine();
                System.out.println("please enter the password: ");
                pwd = sc.nextLine();
            }else{
            System.out.println("Your valid Customer");
            }
        } while ((loginid == "Yashwanth") && (pwd == "123456"));
        
    }
}
