import java.util.Scanner;
public class D6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter password: ");
        int Pass=sc.nextInt();
        sc.close();
        while (username == "srisai25" && Pass == 12345 ) {
            System.out.println("HEllO"+username);
            break;
            
        }
       
    }   
    
}
