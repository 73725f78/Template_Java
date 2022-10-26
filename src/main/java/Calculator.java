import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {

	private static Logger log = LogManager.getLogger(Calculator.class);

	public int evaluate(String expression) {
		int sum = 0;
		for (String summand: expression.split("\\+"))
			sum += Integer.valueOf(summand);

		log.info("Testing logs");
		log.debug("Testing logs");
		return sum;
	}
}
