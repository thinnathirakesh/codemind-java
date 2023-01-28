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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double cnt=0,s=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isprime(a[i])==true)
            {
                s=s+a[i];
                cnt++;
            }
        }
        double avg=(s/cnt);
        System.out.printf("%.2f",avg);
    }
}