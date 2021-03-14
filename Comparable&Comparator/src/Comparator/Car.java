package Comparator;

import java.util.Comparator;

public class Car  {
    int price;
    int speed;
    String name;

    Car(int price,int speed,String name)
    {
        this.price = price;
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: "+this.name + ",speed: "+this.speed+ ",price: " + this.price;
    }


}
