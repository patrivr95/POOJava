package service;

public interface Calculadora {
	int suma(int a, int b);
	int resta(int a, int b);
	default int multiplicar(int a, int b) {
		return a*b;
	}
	default int sumatorio(int[] nums) {
		int suma=0;
		for(int n:nums) {
			suma+=n;
		}
		return suma;
	}
}
