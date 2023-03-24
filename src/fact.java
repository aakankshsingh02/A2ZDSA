import java.util.*;
class abc{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(recursionFact(n));
    }
    
    public static int recursionFact(int n)
    {
        int p=0;
        if(n==0 || n==1)
        return 1;
        else
        p=n*recursionFact(n-1);
        return p;
        
    }
}