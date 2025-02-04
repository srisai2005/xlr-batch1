import java.util.Scanner;
public class Demo015 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        sc.close();
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("first : "+x);
        System.out.println("Second : "+y);
        

        
    }
}
