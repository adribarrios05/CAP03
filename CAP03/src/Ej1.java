import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa multiplica dos números");
        System.out.print("Por favor, introduzca el primer número: ");
        int a = sc.nextInt();
        System.out.print("Por favor, introduzca el segundo número: ");
        int b = sc.nextInt();
        System.out.println(a+"*"+b+"="+a*b);
        sc.close();
    }
}
