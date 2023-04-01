class Solution {
    public int countDigits(int num) {
        int s=0,r=0;
        for(int i=num;i>0;i=i/10)
        {
            r=i%10;
            if(num%r==0)
            s+=1;

        }
        return s;
        
    }
}