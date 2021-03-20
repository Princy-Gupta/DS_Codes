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