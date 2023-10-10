import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los Kb a convertir: ");
        int Kb = sc.nextInt();
        System.out.printf("%d Kb son %d Mb", Kb, Kb/1000);
        sc.close();
    }
}
