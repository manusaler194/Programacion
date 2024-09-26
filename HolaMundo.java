// Autor: Fulanito
//Propósito: Saludar a todo el mundo
public class HolaMundo {

	enum Semaforo {verde,rojo,ambar};
	// El método main() es el punto de entrada de la aplicación
	public static void main(String[] args)  {

	Semaforo miSemaforo = Semaforo.verde;
	
	float unFloat = 0.17F;		
	double otroDouble = 5.02E8;
	String caracter= "PORRO";
	int x= 9;
	String cadena="a a";
	int longitud = 3;
	float espacio, expresion;
	espacio = longitud;
	expresion = espacio * longitud;
	



System.out.println("Puedo pasar?" +miSemaforo);
System.out.println("Puedo pasar?" +(miSemaforo==Semaforo.rojo));
System.out.println(unFloat);

System.out.printf("otroDouble = %f" , otroDouble);
System.out.println("-FIN");
System.out.printf("otroDouble = %.2f" , otroDouble);
System.out.println("-FIN");
System.out.printf("otroDouble = %f y %d y %s", otroDouble, x ,caracter);
System.out.println("-FIN");
System.out.println(Math.E);
System.out.println("-FIN");
System.out.println(Math.sqrt(9));
System.out.println("-FIN");
System.out.println(cadena+"="+cadena.length());
System.out.println("\" (hola)\'\t\\");
System.out.println("Hola".charAt(1));

}
}
	