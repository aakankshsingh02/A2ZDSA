class Solution {
    public int differenceOfSum(int[] a) {
        int s=0,c=0,r=0;
        for(int i=0;i<a.length;i++)
        {
          s=s+a[i];
        
        while(a[i]>0)
        {
            r=a[i]%10;
            c=c+r;
            a[i]=a[i]/10;

        }
        
    }
    return Math.abs(s-c);
}
}