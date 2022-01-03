import java.io.*;
abstract class f1
{
    int n;
    int d;
    int x=0;
         int y=1;
          int z;
    abstract void fibonaci();
}
public class Abs_Fibbonacci {
    public static void main(String[] args) throws Exception
 {
     f2 obj = new f2();
     obj.fibonaci();
 }
}
class f2 extends f1
{
    
    void fibonaci()
    {
        try{
        File file = new File("C:\\Users\\Ram\\Documents");
         FileReader fin= new FileReader(file);
         while ((n=fin.read())!= -1){
             System.out.println("Fibonacci series upto "+n+" is :-");
             d=n;
         }
         
      while(z<d)
         {
             System.out.print(c+" ");
             z=x+y;
             x=y;
             y=z;
             
         }
       
         
         
        }catch(IOException e)
        {}
}
}
