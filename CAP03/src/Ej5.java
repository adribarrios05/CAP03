import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura: ");
        double altura = sc.nextDouble();
        System.out.printf("El área del rectángulo es %.1f cm^2 ",(base*altura));
        sc.close();
    }
}
