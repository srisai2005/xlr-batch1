import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username,pass;
        do{
            System.out.println("Hello Mallareddy Unversity, Please Login: ");
            System.out.print("Enter username: ");
            username = sc.next();
            System.out.print("Enter password: ");
            pass = sc.next();
            break;
        }while((!username.equals("Srisai"))||(!pass.equals("12345")));
        System.out.println("Successfully logged in.");
    }
}
