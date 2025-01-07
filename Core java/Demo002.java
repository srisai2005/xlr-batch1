import java.util.Scanner;

public class Demo002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        System.out.println("Enter base: ");
        double b = sc.nextDouble();
        sc.close();
        double area = 0.5*h*b; 
        System.out.println("Area of triangle is : "+area);

    }
    
}
