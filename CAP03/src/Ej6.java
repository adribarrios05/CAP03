import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura: ");
        double altura = sc.nextDouble();
        System.out.printf("El área del triángulo es %.1f cm^2 ",(base*altura/2));
        sc.close();
    }
}