import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la cantidad de pesetas: ");
        int pesetas = sc.nextInt();
        System.out.printf("%d pesetas son %.2f", pesetas, pesetas/166.386);
        sc.close();
    }
}