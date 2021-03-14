package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CarKiFactory {

    private static <T> void bubbleSort(T[] c,Comparator<T> comparator) {
        for(int i=0;i<c.length-1;i++)
        {
            for(int j=0;j<c.length-1-i;j++)
            {
                if(comparator.compare(c[j],c[j+1]) > 0)
                {
                    T temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Car c[] = new Car[5];
        c[0] = new Car(500000,120,"Alto");
        c[1] = new Car(700000,140,"Swift");
        c[2] = new Car(300000,100,"Datsun");
        c[3] = new Car(600000,130,"Nissan");
        c[4] = new Car(1200000,200,"Verna");
        System.out.println(Arrays.toString(c));
        bubbleSort(c, new CarPriceComparator());
        System.out.println(Arrays.toString(c));



    }


}
