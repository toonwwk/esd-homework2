package kmitl.esd.homework2.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMedianTest {

    float[] f1 = new float[]{1f,3f,2f,4f,5f};
    AverageMedian calculator = new AverageMedian();

    @Test
    void getAverage() {
        assertEquals(3f, calculator.getAverage(f1));
    }
}