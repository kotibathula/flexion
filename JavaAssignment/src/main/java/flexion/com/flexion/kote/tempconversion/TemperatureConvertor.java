package flexion.com.flexion.kote.tempconversion;

import flexion.com.flexion.kote.tempconversion.common.Celsius;
import flexion.com.flexion.kote.tempconversion.common.Fahrenheit;
import flexion.com.flexion.kote.tempconversion.common.Kelvin;
import flexion.com.flexion.kote.tempconversion.common.Rankine;

public class TemperatureConvertor {

  /**
   * returns the converted temperature value
   *
   * @param userInputTemperature - format <value>
   * @param targetUnit           -  must be one of the <C|K|F|R>
   * @return -output value
   */
  public double getConvertedTemp(String userInputTemperature, String targetUnit) throws IllegalArgumentException {

    double returnValue = 0;
    
    if (userInputTemperature != null
        && targetUnit != null) {
      try {
        targetUnit = targetUnit.trim().toLowerCase();
        userInputTemperature = userInputTemperature.trim();

        //verify the string is not empty:
        if ((userInputTemperature.length() > 0) && targetUnit.length() > 0) {
          String inputTempUnit = userInputTemperature.substring(userInputTemperature.length() - 1);
          double inputTempValue = Double.parseDouble(userInputTemperature.substring(0, userInputTemperature.length() - 1));
          returnValue = convertedValue(inputTempUnit.toLowerCase(), targetUnit, inputTempValue);
        }

      } catch (NumberFormatException nf) {
        throw new IllegalArgumentException("input temperature values");
      }
    } else {
      throw new IllegalArgumentException("Null values are not allowed");
    }

    return returnValue;
  }

  private double convertedValue(String inputTempUnit, String targetUnit, double inputTemperatureValue) {
    double correctTempValue = 0;

    if (inputTempUnit.equals("c")) {
      return Celsius.fromCelsius(inputTemperatureValue, targetUnit);
    } else  if (inputTempUnit.equals("f")) {
        return Fahrenheit.fromFahrenheit(inputTemperatureValue, targetUnit);
    } else  if (inputTempUnit.equals("k")) {
        return Kelvin.fromKelvin(inputTemperatureValue, targetUnit);
    } else  if (inputTempUnit.equals("r")) {
       return Rankine.fromRankine(inputTemperatureValue, targetUnit);  
    }
 
    return correctTempValue;
  }

}