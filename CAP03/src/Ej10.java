import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los Mb a convertir: ");
        int Mb = sc.nextInt();
        System.out.printf("%d Mb son %d Kb", Mb, Mb*1000);
        sc.close();
    }
}
