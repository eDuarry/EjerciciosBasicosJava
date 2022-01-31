/* EJERCICIO 3
3.- Realizar un programa que lea una hora expuesta en hora, minutos y segundos y la convierta en segundos.
*/

/* PSEUDOCÓDIGO
Programa: ConvertirASegundos
Autor: Eduardo Duarry España
Entorno:
	horas,minutos,segundos,res es numérico real
Algoritmo:
	Repetir
		Escribir "Introduce horas >=0 y <=24: "
		Leer horas
	Hasta horas>=0 y horas<=24
	Repetir
		Escribir "Introduce minutos >=0 y <=60: "
		Leer minutos
	Hasta minutos>=0 y minutos<=60
	Repetir
		Escribir "Introduce segundos >=0 y <=60: "
		Leer segundos
	Hasta segundos>=0 y segundos<=60
	res = horas*3600+minutos*60+segundos
	Escribir "La hora introducida en segundos son ",segundos," segundos"
Fin Programa
*/

//Programa: ConvertirASegundos
//Autor: Eduardo Duarry España
public class Ejercicio3 {
	public static void main(String[] args) {
	//Entorno:
		short horas,minutos,segundos;
		int res;
	//Algoritmo:
		do {
			System.out.println("Introduce horas >=0 y <24: ");
			horas = Leer.datoShort();
		} while (horas < 0 || horas > 24);
		do {
			System.out.println("Introduce minutos >=0 y <=60: ");
			minutos = Leer.datoShort();
		} while (minutos < 0 || minutos > 60);
		do {
			System.out.println("Introduce segundos >=0 y <=60: ");
			segundos = Leer.datoShort();
		} while (segundos < 0 || segundos > 60);
		res = horas*3600+minutos*60+segundos;
		System.out.println("La hora introducida en segundos son "+res+" segundos");
	} //Fin Programa
}