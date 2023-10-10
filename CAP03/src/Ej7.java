import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la base imponible: ");
        int base = sc.nextInt();
        System.out.printf("El total de su factura es de %.2f €", (base+base*0.21));
        sc.close();
    }
}
