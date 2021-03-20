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