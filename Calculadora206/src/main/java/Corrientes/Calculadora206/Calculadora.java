package Corrientes.Calculadora206;

public class Calculadora {

	public int sumar(int i, int j) {
		// TODO Auto-generated method stub
		
		double parcial=(double)i + (double)j;
		if(parcial>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		
		return i+j;
	}

}
