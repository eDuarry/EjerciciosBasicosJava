/* EJERCICIO 4
4.- Realizar un programa que calcule el volumen y área de la esfera.
*/

//Programa: X
//Autor: Eduardo Duarry España
public class Ejercicio4 {
	public static void main(String[] args) {
	//Entorno:
		float radio,volumen,area;
		//final float PI = 3.1416F;
	//Algoritmo:
		do {
			System.out.println("Introduzca el radio de la esfera (debe ser mayor que 0): ");
			radio = Leer.datoFloat();
		} while (radio <= 0);
		volumen = 4*(float)Math.PI*(float)Math.pow(radio,3)/3;
		area = 4*(float)Math.PI*(float)Math.pow(radio,2);
		System.out.println("La esfera con radio "+radio+" tiene volumen "+volumen+" y area "+area".");
	} //Fin Programa
}