/*
This is the 10th pattern 
 * 
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 
*/

import java.io.*;
import java.util.*;
class pattern10
{
   public static void main(String [] args)throws IOException {
    
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");

        }
        System.out.println("");
    }
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=i;j++){

            System.out.print("*");

        }
        System.out.println("");}
   } 
}