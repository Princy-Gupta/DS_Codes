package SegmentTree;

public class SegmentTree {
    public static void main(String[] args) {
        int input[] = {0,1,5,2,-3,4,1};
        int segment[] = new int[4*input.length];
        build(input,segment,1,1,6);
        for(int i=1;i< segment.length;i++)
        {
            if(segment[i]!=0)
            System.out.print(segment[i] + " ");
        }
        System.out.println();
        System.out.println(query(segment,1,1,3,1,6));
        input[2] = -2;
        update(input,segment,1,1,6,2);
        for(int i=1;i< segment.length;i++)
        {
            if(segment[i]!=0)
                System.out.print(segment[i] + " ");
        }

    }

    private static void update(int[] input, int[] segment, int ci, int l, int r, int ii) {
        if(l==r)
        {
            segment[ci] = input[l];
            return;
        }
        int mid = (l+r)/2;
        if(ii <= mid)
        {
            update(input,segment,2*ci,l,mid,ii);
        }
        else
        {
            update(input,segment,2*ci+1,mid+1,r,ii);
        }
        segment[ci] = Math.min(segment[2*ci],segment[2*ci+1]);
    }

    private static int query(int[] segment,int ci, int ql, int qr, int sl, int sr) {
        //no overlap
        if(sr < ql || sl > qr)
            return Integer.MAX_VALUE;
        // complete overlap
        if(sl >= ql && sr <= qr)
            return segment[ci];

        //partial overlap
        int mid = (sl+sr)/2;
        int left = query(segment,2*ci,ql,qr,sl,mid);
        int right = query(segment,2*ci+1,ql,qr,mid+1,sr);
        int ans = Math.min(left,right);
        return ans;

    }

    private static void build(int[] input, int[] segment, int ci, int l, int r) {
        if(l == r)
        {
            segment[ci] = input[l];
            return;
        }
        int mid = (l+r)/2;
        build(input,segment,2*ci,l,mid);
        build(input,segment,2*ci+1,mid+1,r);
        segment[ci] = Math.min(segment[2*ci],segment[2*ci+1]);

    }
}
