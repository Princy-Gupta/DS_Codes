package SortGame;

public class Employess {
    String name;
    int salary;

    Employess(String name,int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " "+salary;
    }
}
