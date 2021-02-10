package kmitl.esd.homework2.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMeanTest {

    float[] f1 = new float[]{1f,3f,2f,4f,5f};
    AverageMean calculator = new AverageMean();

    @Test
    void getAverage() {
        assertEquals(3, calculator.getAverage(f1));
    }
}