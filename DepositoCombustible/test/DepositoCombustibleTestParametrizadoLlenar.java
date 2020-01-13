import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizadoLlenar {
	
	 private final double depositoMax = 60.0; 
	 private double depositoNivel;
	 private double cantidad;
	 private double restante;
	 
	 public DepositoCombustibleTestParametrizadoLlenar(double depNivel, double cant, double res) {	
		 depositoNivel = depNivel;
		 cantidad = cant;
		 restante = res;
	 }	 
	 
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {	                
	                 {10.0, 60.0, 60.0}, {10.0, 50.0, 60.0}, {10.0, 45.0, 55.0}, {10.0, 10.0, 20.0}, {10.0, -20.0, 10.0} 
	           });
	    }
	    
	 @Test
	 public void testFill() {
		 
		 DepositoCombustible dp = new DepositoCombustible(depositoMax, depositoNivel);
		 dp.fill(cantidad);
		 double resultado = dp.getDepositoNivel();
		 assertEquals(restante,resultado,0.1);
	 }	 

}
