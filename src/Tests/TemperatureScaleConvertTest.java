package Tests;

        import org.junit.Test;

        import static com.goit.gojavaonline.module4.temp.grade.converter.TemperatureScaleConvert.*;
        import static org.junit.Assert.*;


public class TemperatureScaleConvertTest {

    @Test
    public void testFahrenheitToCelsiusConvert() throws Exception {
        assertEquals(28, (fahrenheitToCelsiusConvert(83)));
        assertEquals(-897, (fahrenheitToCelsiusConvert(-1583)));
        assertEquals(-17, (fahrenheitToCelsiusConvert(0)));
    }

    @Test
    public void testCelsiusToFahrenheitConvert() throws Exception {
        assertEquals(69, (celsiusToFahrenheitConvert(21)));
        assertEquals(-328, (celsiusToFahrenheitConvert(-200)));
        assertEquals(32, (celsiusToFahrenheitConvert(0)));
    }
}