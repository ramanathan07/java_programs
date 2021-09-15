import java.lang.Math;
public class Polymorphism
{
    public void area(int s)
    {
        System.out.print(s*s);
    }
    public void area(int l, int b)
    {
        System.out.print(l*b);
    }
    public void area(int a, int b, int c)
    {
        double s1=(a+b+c)/2;
        System.out.print(Math.sqrt(s1*(s1-a)*(s1-b)*(s1-c)));
    }
    public static void main(String args[])
    {
        Polymorphism o = new Polymorphism();
        o.area(3);
        o.area(4,5);
        o.area(6,7,8);
    }
}
