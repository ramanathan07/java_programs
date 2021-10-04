interface ADD
{
    public void SUM();
}
public class ADD_FLOAT_INTERFACE implements ADD
{
    public void SUM()
    {
        float x = 0.12f;
        float y = 0.45f;
        float z = x+y;
        System.out.println(z+"");
    }
    public static void main(String[] args)
    {
        ADD_FLOAT o = new ADD_FLOAT();
        o.SUM();
    }
}
