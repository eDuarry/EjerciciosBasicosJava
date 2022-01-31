/* EJERCICIO 1
1.- Realizar un programa que calcule el área de un rectángulo.
Fórmula: Area = Base x Altura. 
*/

/* PSEUDOCÓDIGO
Programa: AreaRectangulo
Autor: Eduardo Duarry España
Entorno:
	area,base,altura es numérico real
Algoritmo:
	Repetir
		Escribir "Introduzca la base (debe ser mayor que 0): "
		Leer base
	Hasta base > 0
	Repetir
		Escribir "Introduzca la altura (debe ser mayor que 0):"
		Leer altura
	Hasta altura > 0
	area <-- base * altura
	Escribir "El área del rectángulo es: ",area
Fin Programa
*/

//Programa: AreaRectangulo
//Autor: Eduardo Duarry España
public class Ejercicio1 {
	public static void main(String[] args) {
	//Entorno:
		int area,base,altura;
	//Algoritmo:
		do {
			System.out.println("Introduzca la base (debe ser mayor que 0): ");
			base = Leer.datoInt();
		} while (base <= 0);
		do {
			System.out.println("Introduzca la altura (debe ser mayor que 0): ");
			altura = Leer.datoInt();
		} while (altura <= 0);
		area = base * altura;
		System.out.println("El área del rectángulo es: "+area);
	} //Fin Programa
}