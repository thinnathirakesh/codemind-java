import java.util.*;
class Circle
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double area=3.14*a*a;
        System.out.println(String.format(Locale.US,"%.2f",area));
    }
}

