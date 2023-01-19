import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int temp;
        while(t>0)
        {
            int I=s.nextInt();
            int r=s.nextInt();
            int cnt=0;
            for(int i=I;i<=r;i++)
            {
                temp=i%10;
                if(temp==2 || temp==3 || temp==9)
                {
                    cnt++;
                }
            }
            t--;
            System.out.println(cnt);
        }
    }
}