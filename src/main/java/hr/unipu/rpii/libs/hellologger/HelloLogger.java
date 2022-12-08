package hr.unipu.rpii.libs.hellologger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogger {
    public static void main(String[] args) {
        //Creating the Logger object
        Logger logger = LoggerFactory.getLogger("Logger");

        //Logging the information
        logger.info("Ovo je info");
        logger.warn("Ovo je warning");
        logger.error("Ovo je error");
    }
}
