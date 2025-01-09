import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        int pass;

        while (true) {
            System.out.println("Enter username:");
            username = sc.next();
            System.out.println("Enter password:");
            pass = sc.nextInt();

            if (username.equals("srisai25") && pass == 12345) {
                System.out.println("Hello " + username);
                break;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        sc.close();
    }
}
