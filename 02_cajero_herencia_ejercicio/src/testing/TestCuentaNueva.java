package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CuentaNueva;

class TestCuentaNueva {
	CuentaNueva cuenta;
	@BeforeEach
	void setUp() throws Exception {
		cuenta=new CuentaNueva(50, 20);
	}

	@Test
	void testExtraerSaldo() {
		cuenta.extraerSaldo(10);
		assertEquals(40, cuenta.getSaldo());
		cuenta.extraerSaldo(30);
		assertEquals(20, cuenta.getSaldo());
	}

	@Test
	void testIngresarSaldo() {
		cuenta.ingresarSaldo(30);
		assertEquals(80, cuenta.getSaldo());
	}

}
