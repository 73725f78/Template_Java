import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorTest {


	private static Logger log = LogManager.getLogger(CalculatorTest.class);

	@Test
	public void evaluatesExpression() {

		log.info("Running evaluateExpression");

		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);

	}

}
