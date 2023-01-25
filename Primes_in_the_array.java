import java.util.*;
class Main 
{
    static boolean isprime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isprime(a[i])==true)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}