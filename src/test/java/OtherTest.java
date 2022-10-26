import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
@ContextConfiguration( locations={"classpath:beans.xml"} )
public class OtherTest{


	private static Logger log = LogManager.getLogger(OtherTest.class);

	@Autowired 
	@Qualifier("cal")
	private Calculator cal;

	@BeforeEach
	void runBeforeEveryTest() {
		log.info("@BeforeEach executed");
	}

	@Test
	public void testing(){

		log.info("==================================================Other Testing");

		log.debug("Working Directory = " + System.getProperty("user.dir"));
		
		assertEquals(3, cal.evaluate("2+1"));
	}

    @Test
    public void addNumber() {
        log.info("==================================================TestX");
        Assertions.assertEquals(2, 2, "1 + 1 should equal 2");
    }

	@BeforeAll
	public static void init(){
		log.info("==================================================BeforeAll init() method called");
	}
}
