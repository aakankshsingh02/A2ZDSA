/* 
This is the Third Pattern
1      1
12    21
123  321
12344321

*/

import java.util.*;
 class pattern12 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int s=2*(n-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
                
            }
                
                for(int k=1;k<=s;k++)
                {
                    System.out.print(" ");
                }
                for (int j=i;j>=1;j--)
                {
                    System.out.print(j);
                }
                
            System.out.println("");
            s=s-2;
        }
        
       

            
        
    }
    
}
