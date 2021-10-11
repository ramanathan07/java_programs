import java.util.*;
public class userdefined extends Exception
{
    String msg;
    userdefined(String msg)
    {
        this.msg = msg;
    }
    public String toString()
    {
        return msg;
    }
}
public class NegativeAmtException
{
    public static void main(String[] args)
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int a=s.nextInt();
       
        try
        {
            if(a<0)
            {
                throw new userdefined("Invalid Amount");
            }
            System.out.println("Amount Deposited");
        }
        catch(userdefined e)
        {
            System.out.println(e);
        }
    }
}
