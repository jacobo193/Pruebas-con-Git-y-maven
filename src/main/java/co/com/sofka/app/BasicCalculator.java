package co.com.sofka.app;

import com.sun.jdi.LongValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.print.attribute.standard.MediaSize;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
    public Long sum(Long number1, Long number2){
            logger.info("Summing {} + {}", number1, number2);
            return number1 + number2;
        }
    // TODO : hacer resta, multiplicacion y division



    public Long Res (Long number1, Long number2){
        logger.info("Resta {} - {}", number1, number2);
        return number1 - number2;
    }
    public Long mul (Long number1, Long number2){
        logger.info("Multiplicacion {} * {}", number1, number2);
        return number1 * number2;
    }

    public long Div (Long number1, Long number2){
        try {
            logger.info("Division {} / {}", number1, number2);
            return number1 / number2;
        }catch (ArithmeticException e){
           logger.info("No se puede dividir por 0!");
           return (long)0;
        }
    }

}
