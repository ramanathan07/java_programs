class add
{
  float x=666.f;
  float y=0235.f;
}
public class Add_Float extends add
{
    float z=x+y;
    public static void main(String args[])
    {
        Add_Float o= new Add_Float();
        System.out.print(""+o.z);
    }
    
}
