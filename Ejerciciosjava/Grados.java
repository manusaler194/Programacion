import java.util.Scanner;

public class Grados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.println("Ingrese los grados centigrados");
     float gr = scanner.nextFloat();
    
     float reamur = 80*gr/100;
     float farenheit = gr*180/100+32;
     float kelvin = gr*100 / gr+273;


     
     System.out.println("Los grados son " +  gr );
     System.out.println("En reamur es " +  reamur);
     System.out.println("En farenheit es " +  farenheit );
     System.out.println("En farenheit es " +  kelvin );


     
    }
}