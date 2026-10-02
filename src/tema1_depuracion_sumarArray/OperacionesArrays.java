package tema1_depuracion_sumarArray;

/**
 * pruebas con junit usando dos tipos de bucle diferente
 * práctica del uso del modo depuración
 */

public class OperacionesArrays {
	public int sumaArrayFor(int[] array) {
		int resultado = 0;
		for(int i = 0; i<array.length;i++)
			resultado+=array[i];
		return resultado;
	}
	
	public int sumaArrayForEach(int[] array) {
		int resultado = 0;
		for(int n: array)
			resultado+=n;
		return resultado;
	}

}
