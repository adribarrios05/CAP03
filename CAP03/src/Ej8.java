import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca las horas diarias trabajadas: ");
        int a = sc.nextInt();
        System.out.println("Su salario semanal es de "+a*12*7+" €");
        sc.close();
    }
}
