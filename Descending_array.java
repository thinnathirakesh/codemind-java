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
        boolean p=true;
        for(int i=1;i<n;i++)
        {
            if(a[i-1]<a[i])
            {
                p=false;
            }
        }
        if(p==true)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}