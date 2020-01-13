import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoCombustibleTest.class, DepositoCombustibleTestParametrizado.class,
		DepositoCombustibleTestParametrizadoLlenar.class })
public class PruebaTests {

}
