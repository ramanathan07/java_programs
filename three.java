//Multiple Inheritence using interface
interface one
{
    public void area(int a);
}
interface two
{
    public void area(int l, int b);
}
public class three implements one,two
{
    public void area(int a)
    {
        System.out.print(a*a);
    }
    public void area(int l, int b)
    {
        System.out.print(l*b);
    }
    public static void main(String args[])
    {
        three o=new three();
        o.area(6);
        o.area(7,8);
    }
}
