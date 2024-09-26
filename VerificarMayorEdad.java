import java.util.Scanner;

public class VerificarMayorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su día de nacimiento (DN): ");
        int DN = scanner.nextInt();

        System.out.println("Ingrese su mes de nacimiento (MN): ");
        int MN = scanner.nextInt();

        System.out.println("Ingrese su año de nacimiento (AN): ");
        int AN = scanner.nextInt();

        
        System.out.println("Ingrese el día actual (DA): ");
        int DA = scanner.nextInt();

        System.out.println("Ingrese el mes actual (MA): ");
        int MA = scanner.nextInt();

        System.out.println("Ingrese el año actual (AA): ");
        int AA = scanner.nextInt();

        
        if ((AA - AN > 18) || (AA - AN == 18 && (MA > MN || (MA == MN && DA >= DN)))) {
            System.out.println("Tiene 18 años o más.");
        } else {
            System.out.println("No tiene 18 años cumplidos.");
        }

        
        scanner.close();
    }
}