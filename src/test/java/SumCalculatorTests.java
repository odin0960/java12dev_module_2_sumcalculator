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
        Map<Integer, Integer> testedValues = new HashMap<>();
        testedValues.put(1,1);
        testedValues.put(3,6);
        testedValues.put(5,15);

        testedValues.forEach((n, expected) -> {
            Assertions.assertEquals(expected, sum.sum(n));
        });

    }

    @Test
    void testThatSumFor0ThrowsIllegalArgumentException() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sum.sum(0));
    }

}
