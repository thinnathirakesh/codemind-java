import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int s1=0,s2=0;
            int a[]=new int[n];
            for(int j=0;j<n-1;j++)
            {
                a[j]=s.nextInt();
            }
            for(int x=1;x<=n;x++)
            {
                s1+=x;
            }
            for(int y=0;y<n;y++)
            {
                s2+=a[y];
            }
            System.out.println(s1-s2);
        }
    }
}