import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int x=s.nextInt();
        int y=s.nextInt();
        int min=100;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=x && a[i]<=y)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
            }
        }
        if(min==100)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(min);
        }
    }
}