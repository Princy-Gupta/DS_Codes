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
