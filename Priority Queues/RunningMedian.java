  
import java.util.PriorityQueue;
import java.util.Collections;
public class Solution {

    public static void findMedian(int arr[]) {

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        if(arr.length<1)
            return ;
        

        max.add(arr[0]);
        System.out.print(arr[0]+" ");
        
        for(int i=1;i<arr.length;i++){

            //int x = max.peek();
            if(arr[i] < max.element()){
                max.add(arr[i]);
            }else{
                min.add(arr[i]);
            }
            
            int size = min.size() + max.size();
            if(size %2 == 0 && min.size() != max.size()){
                if(min.size() > max.size()){
                    max.add(min.remove());
                }else{
                    min.add(max.remove());
                }
            }
            
            if(min.size() != max.size()){
                 if(min.size() > max.size()){
                    System.out.print(min.element()+ " ");
                }else{
                     int z = max.peek();
                   System.out.print(z+ " ");
                }
            }else{
                int median = (min.element() + max.element())/2;
                System.out.print(median+ " ");
            }
            
        }
    }
}
