package kmitl.esd.homework2.strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageMean implements Average{
    @Override
    public Float getAverage(float[] a) {
        Float sum = 0.0f;

        for (Float num : a) {
            sum += num;
        }

        return sum/(a.length);
    }
}
