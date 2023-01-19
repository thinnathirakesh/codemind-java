import java.util.*;
class Temperature
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextInt();
        double b=32+(a*9/5);
        System.out.println(String.format(Locale.US,"%.2f",b));
    }
}
