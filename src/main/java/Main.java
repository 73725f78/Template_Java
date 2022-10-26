import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

	private static Logger log = LogManager.getLogger(Main.class);
	
	public static void main(String arg[]){

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Calculator c = (Calculator) context.getBean("cal");


		log.info("Testing calculator 2+5:" + c.evaluate("5+4"));

		log.debug("Exit main");
	}
}
