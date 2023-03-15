/* 
This is the 13th Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.*;
 class pattern13 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int s=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
                s=s+1;
            }
                
               
                
            System.out.println("");
           
        }
        
       

            
        
    }
    
}
