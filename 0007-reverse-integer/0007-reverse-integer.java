class Solution {
    public int reverse(int x) {
        int r=0,j=0;
        int k= Integer.MAX_VALUE;
       if(x<0)
        {
            x*=-1;
            for(int i=x;i>0;i=i/10){
               r=i%10;
                if(j> Integer.MAX_VALUE/10 || j< Integer.MIN_VALUE/10)
            {
                return 0;
            }
              j=j*10+r; 
            }
            j*=-1;
            return j;
        }
        else{
        for(int i=x;i>0;i=i/10)
        {
            r=i%10;
            if(j> Integer.MAX_VALUE/10 || j< Integer.MIN_VALUE/10)
            {
                return 0;
            }
            j=j*10+r;
            
            
        }
        return j;
        }
    }}
