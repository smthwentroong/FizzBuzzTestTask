import org.example.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void shouldReturnFizz(int value) {
        Assertions.assertArrayEquals("Fizz".getBytes(), FizzBuzz.returnFizzBuzz(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15, 20})
    public void shouldReturnBuzz(int value) {
        Assertions.assertArrayEquals("Buzz".getBytes(), FizzBuzz.returnFizzBuzz(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    public void shouldReturnFizzBuzz(int value) {
        Assertions.assertEquals("FizzBuzz".getBytes(), FizzBuzz.returnFizzBuzz(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7})
    public void shouldReturnIllegalArguementException(int value) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FizzBuzz.returnFizzBuzz(value));
    }
}
