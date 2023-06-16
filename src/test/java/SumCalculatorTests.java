import javadev.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class SumCalculatorTests {

    //+перевірити чи сума всіх чисел до 1 дорівнює 1
    //+перевірити чи сума всіх чисел до 3 дорівнює 6
    //+перевірити чи сума всіх чисел до 0 викидає виключення IllegalArgumentException

    private SumCalculator sum;

    @BeforeEach
    public void beforeEach() {
        sum = new SumCalculator();
    }

    @Test
    void testForSums() {
        Map<Integer, Integer> testValues = new HashMap<>();
        testValues.put(1, 1);
        testValues.put(3, 6);
        testValues.put(5, 15);

        testValues.forEach((n, expected) -> Assertions.assertEquals(expected, sum.sum(n)));
    }

    @Test
    void testThatSumFor0ThrowsIllegalArgumentException() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sum.sum(0));
    }

}
