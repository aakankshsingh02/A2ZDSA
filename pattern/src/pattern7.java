/* 
This is the seventh Pattern
    *
   ***
  *****
 *******
*********

*/

import java.util.*;
class pattern7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j= 0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j= 0;j<2*i+1;j++)
            {
                System.out.print("*");

            }
            for(int j= 0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}