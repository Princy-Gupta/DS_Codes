package com.java.priorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSorted {

    class Node{
        int val;
        int row;
        int col;
        Node(int val,int row,int col)
        {
            this.row = row;
            this.val = val;
            this.col = col;
        }

        @Override
        public String toString() {
            return  this.val+" ";
        }
    }

    public void mergeK(int arr[][])
    {

        PriorityQueue<Node> q = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.val-o2.val;
            }
        });

        for(int i=0;i<arr.length;i++)
        {
            q.add(new Node(arr[i][0],i,0));
        }

        List<Integer> li = new ArrayList<>();
        while(!q.isEmpty())
        {
            Node n = q.poll();
            int val = n.val;
            int row = n.row;
            int col = n.col;

            if(col+1 < arr[row].length)
            {
                q.add(new Node(arr[row][col+1],row,col+1));
            }

            li.add(val);
        }

        System.out.println(li);
    }

    public static void main(String[] args) {
        int arr[][] = {{2,6,12,5},{1,3,14,20},{4,5,8,10}};
        MergeKSorted m = new MergeKSorted();
        m.mergeK(arr);
    }

}
