import java.io.*;
public class StreamAddition
{
    public static void main(String[] args) throws Exception
    {
        int num1,num2,sum;
        BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers to add:");
        num1 = Integer.parseInt(o.readLine());
        num2 = Integer.parseInt(o.readLine());
        sum = num1+num2;
        System.out.println("Sum:"+sum);
    }
}
