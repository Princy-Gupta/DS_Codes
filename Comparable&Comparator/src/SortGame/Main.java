package SortGame;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        List<Employess> li = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String name = s.next();
            int salary = s.nextInt();
            if(salary > x)
            {
                Employess emp = new Employess(name,salary);
                li.add(emp);
            }

        }

        Collections.sort(li, new Comparator<Employess>() {
            @Override
            public int compare(Employess o1, Employess o2) {
                if(o1.salary == o2.salary)
                {
                    return o1.name.compareTo(o2.name);
                }
                return o2.salary-o1.salary;
            }
        });
        System.out.println(li);
    }
}
