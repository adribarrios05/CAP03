import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, intdoduzca el primer número: ");
        double x = sc.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        double y = sc.nextDouble();
        System.out.printf("x = %.1f%n", x);
        System.out.printf("y = %.1f%n", y);
        System.out.printf("x + y = %.1f%n", x+y);
        System.out.printf("x - y = %.1f%n", x-y);
        System.out.printf("x * y = %.1f%n", x*y);
        System.out.printf("x / y = %.17f%n", x/y);
        sc.close();
        
        
    }
}
