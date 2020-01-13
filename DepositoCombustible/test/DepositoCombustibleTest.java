import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DepositoCombustibleTest {
	
	private DepositoCombustible dc;
	
	
	@Before
	public void inicioPruebas() {
		dc = new DepositoCombustible(60.0,30.0);
	}
	
	@After
	public void finPruebas() {
		dc = null;
	}

	@Test
	public void testGetDepositoNivel() {		
		
		double depositoNivel = dc.getDepositoNivel();
		assertEquals(30.0 , depositoNivel, 0.1);
		
	}

	@Test
	public void testGetDepositoMax() {			
		
		double depositoMax = dc.getDepositoMax();
		assertEquals(60.0, depositoMax, 0.1);
		
	}

	@Test
	public void testEstaVacio() {				// sí
		
		boolean depositoMin = dc.estaVacio();
		assertFalse(depositoMin);
		
	}
	
	@Test
	public void testLlenoAMitad() {

		double mitadDeposito = dc.getDepositoMax() / 2;
		assertEquals(mitadDeposito, dc.getDepositoNivel(), 0.1);
	}

}
