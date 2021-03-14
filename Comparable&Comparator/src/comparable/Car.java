package comparable;

public class Car implements Comparable<Car>{
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
        return this.price + " " + this.speed + " " + this.name;
    }

    @Override
    public int compareTo(Car o) {

        //return this.price - o.price;  basis of price
        //return this.speed- o.speed; basis of speed
        return this.name.compareTo(o.name);  // basis of name
    }
}
