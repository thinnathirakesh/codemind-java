import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int Ic=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=Ic;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            Ic-=1;
        }
    }
}