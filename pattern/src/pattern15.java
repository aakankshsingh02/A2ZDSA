

import java.util.*;
 class pattern15 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        
        for(int i=n;i>=1;i--)
        {
            for(char j='A';j<'A'+i;j++)
            {
                System.out.print(j);
                
            }
                
               
                
            System.out.println("");
           
        }
        
       

            
        
    }
    
}
