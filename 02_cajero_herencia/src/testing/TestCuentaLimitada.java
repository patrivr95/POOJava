package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CuentaLimitada;

class TestCuentaLimitada {
	CuentaLimitada cuenta;
	@BeforeEach
	void setUp() throws Exception {
		cuenta=new CuentaLimitada(50, 20);
	}

	@Test
	void testExtraer() {
		cuenta.extraer(10);
		assertEquals(40, cuenta.getSaldo());
		cuenta.extraer(30);
		assertEquals(20, cuenta.getSaldo());
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(30);
		assertEquals(80, cuenta.getSaldo());
	}

}
