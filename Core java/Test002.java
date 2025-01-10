import java.util.Scanner;
public class Test002 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String reply;
    
            while (true) {
                System.out.println("Enter value:");
                reply = sc.next();
                sc.close();
    
                if (reply.equals("yes") ) {
                    System.out.println("Happy Sankranthi ");
                    break;
                }
                System.out.println("Enter value:");
                reply = sc.next();
                // else{
                //     return;
                // }
                }
            }
          
        }