package flexion;

import static org.junit.Assert.assertTrue;

import flexion.com.flexion.kote.tempconversion.TemperatureConvertor;
import org.junit.Test;

/**
 * Unit test for Temperature Convertor .
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testCentrigradeToFahrenheit() {

        TemperatureConvertor convertor = new TemperatureConvertor();
        double testResult = convertor.getConvertedTemp("100C", "F");
        assertTrue(212.0 == testResult);
    }
}
