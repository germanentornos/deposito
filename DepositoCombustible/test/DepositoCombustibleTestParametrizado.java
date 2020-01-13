import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizado {
	
	 private final double depositoMax = 60.0; 
	 private double depositoNivel;
	 private double cantidad;
	 private double restante;
	 
	 public DepositoCombustibleTestParametrizado(double depNivel, double cant, double res) {	
		 depositoNivel = depNivel;
		 cantidad = cant;
		 restante = res;
	 }	 
	 
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {	                
	                 {40.0, 50.0, 0.0}, {40.0, 40.0, 0.0}, {40.0, 35.0, 5.0}, {40.0, 10.0, 30.0}, {40.0, -20.0, 20.0} 
	           });
	    }
	    
	 @Test
	 public void testConsumir() {
		 DepositoCombustible dp = new DepositoCombustible(depositoMax, depositoNivel);
		 dp.consumir(cantidad);
		 double resultado = dp.getDepositoNivel();
		 assertEquals(restante,resultado,0.1);
	 }	 

}
