package tema1_depuracion_sumarArray;

/**
 * Pruebas de las clases de operaciones sin uso de junit --> debug.
 */

public class UsaOperacionesArrays{
	//ponemos con el doble click a la izquierda un punto de parada 
	public static void main (String[] args) {
		OperacionesArrays oa = new OperacionesArrays();
		int [] arrayPruebas = {1,2,3,4,5,6,7,8,9,10};
		int suma = oa.sumaArrayForEach(arrayPruebas);
		System.out.println("La suma de los elementos del array es: " + suma);
	}
}