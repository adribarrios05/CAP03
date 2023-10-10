import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular el volumen de un cono");
        System.out.print("Introduzca el radio en cm de la base: ");
        double radio = sc.nextDouble();
        System.out.print("Introduce la altura en cm del cono: ");
        double altura = sc.nextDouble();
        double vol = (3.1416*radio*radio*altura)/3;
        System.out.printf("El volumen del cono es de %.2f cm³ ",vol);
        sc.close();

    }
}
