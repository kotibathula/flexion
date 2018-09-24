package flexion;

import flexion.com.flexion.kote.tempconversion.TemperatureConvertor;
import java.util.Scanner;

/**
 * Main program that takes the teacher's input and compares with the student response.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* Set up variables */
        String inputTemperature = null, targetUnit=null;;
        double studentResponse = 0;
        double correctTempValue=0;

        Scanner keyboard = new Scanner (System.in);

        System.out.print("Please enter the Input temperature: ");
        inputTemperature = keyboard.nextLine();

        System.out.println("Please enter the Target Units:" );
        targetUnit  = keyboard.nextLine();

        System.out.println("Please enter student response:");
        studentResponse = keyboard.nextDouble();
        keyboard.close();

        try {
            TemperatureConvertor convertor = new TemperatureConvertor();
            correctTempValue = convertor.getConvertedTemp(inputTemperature, targetUnit);
            System.out.println("correctTempValue:"+ correctTempValue);
        }catch (IllegalArgumentException ile) {
            System.out.println("Invalid Input");
        }

        if(correctTempValue == studentResponse)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }


}
