import java.util.*;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double s=(a+b+c)/2;
        double ans=(s*(s-a)*(s-b)*(s-c));
        double area=Math.sqrt(ans);
        System.out.println(String.format(Locale.US,"%.2f",area));
    }
}