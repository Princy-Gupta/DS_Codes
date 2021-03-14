package StringSort;

import java.util.*;

public class Names {

    String name;

    Names(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Names> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = s.next();
            Names name = new Names(str);
            li.add(name);
        }

        Collections.sort(li, new Comparator<Names>() {
            @Override
            public int compare(Names o1, Names o2) {
                if(o2.name.contains(o1.name))
                {
                    return 1;
                }
                else if(o1.name.contains(o2.name))
                {
                    return -1;

                }
                return o1.name.compareTo(o2.name);
            }
        });

        int i=0;
        while(i < li.size())
        {
            System.out.println(li.get(i));
            i++;
        }
    }
}