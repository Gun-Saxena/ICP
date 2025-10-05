package ICP.Assignment7;

class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==0) return 0;
        if(n==1)return arr[0];
        int res[]=new int[n+1];
        res[0]=arr[0];
        res[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            res[i]=Math.max(res[i-2]+arr[i],res[i-1]);
        }
        return res[n-1];

    }
}