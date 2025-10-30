class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] c=new double[n][2];
        for(int i=0;i<n;i++){
            c[i][0]=position[i];
            c[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(c,(a, b)->Double.compare(b[0], a[0]));
        int f=0;
        double pre=0;
        for(int i=0;i<n;i++) {
            double t=c[i][1];
            if(t>pre) {
                f++;
                pre=t;
            }
        }
        return f;
    }
}