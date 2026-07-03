import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void empty_string_should_return_zero(){

        //instance
        StringCalculator calculator = new StringCalculator();

        assertEquals(0,calculator.add(""));
    }
}

