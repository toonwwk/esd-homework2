package kmitl.esd.homework2.strategy;

import java.util.ArrayList;

//strategy interface for calculate average
public interface Average {
    // Average interface is an abstraction of the
    // median and mean algorithm
    // Simplification, filter, loss of information:
    // calculation is NOT here.
    // -> structural inheritance
    Float getAverage(float[] a);

}
