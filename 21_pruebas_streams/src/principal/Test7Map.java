package principal;

import java.util.stream.Stream;

public class Test7Map {

	public static void main(String[] args) {
		Stream<String> cadenas = Stream.of("caballo", "tigre", "pan", "vino", "leche", "agua", "tierra", "montaña");
		//cuantos de estos nombres tienen más de 5 caracteres?
		cadenas
		.map(n->n.length()) //el resultado de la llamada map va a ser un stream pero de Integer
		.filter(n->n>5)
		.count();
	}

}
