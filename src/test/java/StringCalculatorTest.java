import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void empty_string_should_return_zero(){

        //instance
        StringCalculator calculator = new StringCalculator();

        assertEquals(0,calculator.add(""));
    }

    @Test
    public void single_number_should_return_number(){
        //instance
        StringCalculator calculator = new StringCalculator();

        assertEquals(2,calculator.add("2"));
    }

    @Test
    public void two_comma_separated_numbers_should_return_sum(){
        //instance
        StringCalculator calculator = new StringCalculator();

        assertEquals(3, calculator.add("1,2")); 
    }

    @Test
    public void unknown_amount_of_numbers_should_return_sum(){
        //instance
        StringCalculator calculator = new StringCalculator();

        assertEquals(6, calculator.add("1,2,3"));  
    }

    @Test
    public void newline_delimeter_should_be_supported(){
        //instance
        StringCalculator calculator = new StringCalculator();

        assertEquals(6 , calculator.add("1\n2,3"));
    }

    @Test
    public void support_different_delimeters(){
        //instance
        StringCalculator calculator = new StringCalculator();

        assertEquals(6, calculator.add("//;1;2;3"));
    }
}

