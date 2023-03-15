

import java.util.*;
 class pattern16 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        
        for(int i=1;i<=n;i++)
        {
           
            for(int j=1;j<=i;j++)
            {
                 char ch='A' ;
                System.out.print((char)(ch + i-1));
                
            }
                
               
                
            System.out.println("");
           
        }
        
       

            
        
    }
    
}
