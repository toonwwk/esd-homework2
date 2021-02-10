package kmitl.esd.homework2.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AverageMedian implements Average {
    // -> structural inheritance
    @Override
    public Float getAverage(float[] a) {
        // determine the index in the middle
        int index = a.length / 2;;
        // sort values
        Arrays.sort(a);

        if (a.length % 2 != 0)
            return a[index];
        return (a[index] + a[index-1])/2;
    }
}
