import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        float sum=0f;
        for(int i=1;i<=n;i++)
        {
            sum+=(float)1/i;
        }
        System.out.printf("%.2f",sum);
    }
}