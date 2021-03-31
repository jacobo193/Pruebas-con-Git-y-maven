package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();


    @DisplayName("testing suma 1+1=3")
    @Test
    public void sum() {


        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;


        //act
        long result = basicCalculator.sum(number1, number2);
        //assert
        assertEquals(expectedValue, result);


    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101",
            "200, 1000, 1200",
            "7549, 4569, 12118"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


    @DisplayName("testing resta 1-1=0")
    @Test
    void testRes() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;


        //act
        long result = basicCalculator.sum(number1, number2);
        //assert
        assertEquals(expectedValue, result);


    }

    @DisplayName("Testing several res")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "2,    1,   1",
            "100,  51, 49",
            "101,  100, 1",
            "1200, 1000, 200",
            "12118, 4569, 7549"
    })
    public void severalRes(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.Res(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


    @DisplayName("testing multiplicacion 1*1=1")
    @Test
    void testMul() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;


        //act
        long result = basicCalculator.mul(number1, number2);
        //assert
        assertEquals(expectedValue, result);

    }

    @DisplayName("Testing several mul")
    @ParameterizedTest(name = "{2} * {1} = {1}")
    @CsvSource({
            "0,    1,   0",
            "2,    1,   2",
            "100,  51, 5100",
            "200,  100, 20000",
            "1200, 100, 120000",
            "12, 4, 48"
    })
    public void severalMul(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mul(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);

    }

    @DisplayName("testing division 4/2=2")
    @Test
    void testDiv() {

        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue = 2L;


        //act
        long result = basicCalculator.Div(number1, number2);
        //assert
        assertEquals(expectedValue, result);

    }

    @DisplayName("Testing several division")
    @ParameterizedTest(name = "{4} / {2} = {2}")
    @CsvSource({
            "4,    2,   2",
            "9,    3,   3",
            "8,    2,   4",
            "2,    0,   0",
            "12,   4, 3"
    })
    public void severalDiv(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.Div(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}