package Comparator;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        return c1.price - c2.price ;
    }
}
