package com.java.Graphs;

import java.util.*;


public class UndirectedGraph {
    Map<Integer, List<Integer>> map;

    private UndirectedGraph()
    {
        this.map = new HashMap<>();
    }
    private void addEdge(int v1, int v2) {
        List<Integer> Listv1 = map.getOrDefault(v1, new ArrayList<>());
        Listv1.add(v2);

        List<Integer> Listv2 = map.getOrDefault(v2,new ArrayList<>());
        Listv2.add(v1);

        map.put(v1,Listv1);
        map.put(v2,Listv2);
    }
    private void displayAdjList() {
        for(int key : map.keySet())
        {
            System.out.println(key + "-"+ map.get(key));
        }
    }
    private void bfs(int src)
    {
        HashMap<Integer,Boolean> vis = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        vis.put(src,true);

        while(!q.isEmpty())
        {
            int first = q.remove();

            List<Integer> fChild = map.get(first);

            for(int child : fChild)
            {
                if(!vis.containsKey(child))
                {
                    q.add(child);
                    vis.put(child,true);
                }
            }
            System.out.print(first + " ");
        }
    }

    private void dfs(int src) {
        this.dfsUtil(src,new HashMap<>());
    }

    private void dfsUtil(int src, HashMap<Integer,Boolean> vis) {
        System.out.print(src + " ");
        vis.put(src,true);

        List<Integer> srcChild = map.get(src);
        for(int child : srcChild )
        {
            if(!vis.containsKey(child))
            {
                dfsUtil(child,vis);
            }

        }
    }
    private void printConnected(int src) {
        HashMap<Integer,Boolean> vis = new HashMap<>();
        for(int vertex : map.keySet())
        {
            if(!vis.containsKey(vertex))
            {
                dfsUtil(vertex,vis);
            }
        }
    }

    private void TreeBurnTime(int src) {
        HashMap<Integer,Integer> vis = new HashMap<>();
        for(int i : map.keySet())
        {
            vis.put(i,Integer.MAX_VALUE);
        }
        vis.put(src,0);
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while(!q.isEmpty())
        {
            int origin = q.poll();
            List<Integer> childs = map.get(origin);
            for(int child : childs )
            {
                if(vis.get(child) == Integer.MAX_VALUE)
                {
                    q.add(child);
                    int originValue = vis.get(origin);
                    int childValueNew = originValue+1;
                    vis.put(child,originValue+1);
                    System.out.println("Time taken to burn from "+ origin + " to " + child + " is " + childValueNew);

                }
            }
        }
    }



    public static void main(String[] args)
    {
        UndirectedGraph q = new UndirectedGraph();

        // Undirected Graph Implementation
      /*  q.addEdge(1,2);
        q.addEdge(2,3);
        q.addEdge(2,4);
        q.addEdge(3,4);
        q.displayAdjList();*/

        // BFS

        q.addEdge(0,1);
        q.addEdge(0,3);
        q.addEdge(0,4);
        q.addEdge(1,2);
        q.addEdge(2,3);
        //q.addEdge(5,6);
       // q.addEdge(5,7);
       // q.addEdge(6,7);
        q.displayAdjList();
        //q.bfs(0);
        //q.dfs(0);
        //q.printConnected(0);
        q.TreeBurnTime(0);
    }




}

