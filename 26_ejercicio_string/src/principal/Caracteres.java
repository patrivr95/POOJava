package principal;

import java.util.Arrays;

public class Caracteres {

	public static void main(String[] args) {
		String datos="Sevilla-30.0-21.7-24.8,Málaga-18.4-25.5-28.3,Alicante-24.6-11.8-26.4-20.2";
		
		Arrays.stream(datos.split(",")) //Stream<String> cada cadena contiene los datos de la ciudad
			.flatMap(s->Arrays.stream(s.split("-")).skip(1)) //Stream<String> cada cadena es solo la temperatura
			.mapToDouble(s->Double.parseDouble(s)) //DoubleStream
			.average()
			.orElse(0.0);
		

	}

}
