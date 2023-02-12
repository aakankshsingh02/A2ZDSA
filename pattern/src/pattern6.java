/* 
This is the First Pattern

12345
1234
123
12
1

*/

import java.util.*;
public class pattern6 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        
       

            
        
    }
    
}
