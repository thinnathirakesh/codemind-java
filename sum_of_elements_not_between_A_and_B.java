import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int su=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int x,y;
        x=s.nextInt();
        y=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]>=x && a[i]<=y)
            {
                continue;
            }
            else
            {
                su+=a[i];
            }
        }
        System.out.println(su);
    }
}