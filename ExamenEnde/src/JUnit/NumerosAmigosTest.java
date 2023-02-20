package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumerosAmigosTest {

	@Test
	void testAmigo() {
		NumerosAmigos na = new NumerosAmigos(220, 284);
		boolean rst = true;
		assertEquals(rst, na.amigo());
	}

	@Test
	void testEsN1IgualAN2() {
		NumerosAmigos na = new NumerosAmigos(0, 0);
		int rst = 0;
		assertNull(na.esN1IgualAN2());
	}
	@Test
	void testAmigoMal() {
		NumerosAmigos na = new NumerosAmigos(220, 200);
		assertFalse(na.amigo());
	}
	@Test
	void testAmigoPerfecto() {
		NumerosAmigos na = new NumerosAmigos(496, 496);
		assertTrue(na.amigo());
	}
	@Test
	void testEsCeroN1() {
		NumerosAmigos na = new NumerosAmigos(0, 284);
		assertNull(na.esN1IgualAN2());
	}
	@Test
	void testN1yN2SonIguales() {
		NumerosAmigos na = new NumerosAmigos(30, 30);
		assertEquals(1, na.esN1IgualAN2());
	}
	@Test
	void testN1yN2NoSonIguales() {
		NumerosAmigos na = new NumerosAmigos(30, 15);
		assertNotEquals(1, na.esN1IgualAN2());
	}
}
