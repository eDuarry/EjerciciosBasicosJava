/* EJERCICIO 2
2.- Realizar un programa que halle la longitud y el área de una circunferencia cuyo radio en centímetros se introduce por teclado.
Nota: trabajar PI como una precisión de 4 decimales 3.1416.
Fórmulas: Long. = 2xPIxRadio Area = PI x Radio^2
*/

/* PSEUDOCÓDIGO
Programa: LongitudAreaCircunferencia
Autor: Eduardo Duarry España
Entorno:
	radio,longitud,area es numérico real
	CONST PI es numérico real <-- 3.1416
Algoritmo:
	Repetir
		Escribir "Introduzca el radio en centímetros (debe ser mayor que 0): "
		Leer radio
	Hasta radio > 0
	longitud <-- 2*PI*radio
	area <-- PI*radio**2
	Escribir "La circunferencia con radio ",radio," tiene longitud ",longitud," y área ",area
Fin Programa
*/

//Programa: LongitudAreaCircunferencia
//Autor: Eduardo Duarry España
public class Ejercicio2 {
	public static void main(String[] args) {
	//Entorno:
		float radio,longitud,area;
		final float PI=3.1416F;
	//Algoritmo:
		do {
			System.out.println("Introduzca el radio de la circunferencia en centímetros (debe ser mayor que 0): ");
			radio = Leer.datoFloat();
		} while (radio <= 0);
		longitud = 2 * PI * radio;
		area = PI * (float)(Math.pow(radio,2));
		System.out.println("La circunferencia con radio "+radio+"cm tiene longitud "+longitud+"cm y área "+area+"cm");
	} //Fin Programa
}