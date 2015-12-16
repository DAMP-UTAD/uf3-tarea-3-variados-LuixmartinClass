package Ejercicio13;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class a {
	public int a(int suela, int anio) {
		int aumento = suela + ((20 * suela) / 100);
		System.out.println("Ahora tiene un sueldo de " + aumento);
		return aumento;
	}
	
	public int b(int suelb, int anio) {
		int aumento = suelb + ((5 * suelb) / 100);
		System.out.println("Ahora tiene un sueldo de " + aumento);
		return aumento;
	}
	public int c(int suelc) {
		
		System.out.println("Ahora tiene un sueldo de " + suelc);
		return suelc;
		
	}

}
/*
 * a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10
 * años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
 */
/*
 * b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años,
 * otorgarle un aumento de 5 %.
 */
/*
 * c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin
 * cambios.
 */