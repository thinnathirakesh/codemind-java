import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int su=0;
        boolean p=false;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int x=s.nextInt();
        int y=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]>=x && a[i]<=y)
            {
                System.out.print(a[i]+" ");
                p=true;
            }
        }
        if(p==false)
        {
            System.out.print(-1);
        }
    }
}