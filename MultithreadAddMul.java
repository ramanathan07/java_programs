class addd extends Thread{
    public void run(){
        int a = 4;
        int b = 5;
        int c = a+b;
        
        System.out.println("Addition "+c);
    }
}
class mulll extends Thread{
    public void run(){
        int x = 6;
        int y = 7;
        int z = x*y;
        
        System.out.println("Multiplication "+z);
    }
}
public class MultithreadAddMul{
    public static void main(String[] args)
    {
        addd t1=new addd();
        mulll t2=new mulll();

        t1.start();
        t2.start();
    }

}
