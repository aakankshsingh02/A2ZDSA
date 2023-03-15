/* 
This is the 13th Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.*;
 class pattern14 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        
        for(int i=1;i<=n;i++)
        {
            for(char j='A';j<='A'+i;j++)
            {
                System.out.print(j);
                
            }
                
               
                
            System.out.println("");
           
        }
        
       

            
        
    }
    
}
