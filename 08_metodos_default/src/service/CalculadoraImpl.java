package service;

public class CalculadoraImpl implements Calculadora, Estadistica {

	@Override
	public int suma(int a, int b) {
		return a+b;
	}

	@Override
	public int resta(int a, int b) {
		return a-b;
	}

	@Override
	public int media(int[] nums) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumatorio(int[] nums) {
		// TODO Auto-generated method stub
		return Calculadora.super.sumatorio(nums);
	}
	
	/*public int sumatorio(int[] datos) {
		//return datos.length;
		return Calculadora.super.sumatorio(datos);
	}*/
	

}
