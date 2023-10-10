import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la cantidad de euros: ");
        double euros = sc.nextDouble();
        System.out.printf("%.2f euros son %d pesetas", euros, (int)Math.round(euros*166.386));
        sc.close();
    }
}
