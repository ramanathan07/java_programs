class ThreadSynchronized
{
    public void printTable(int n)
    {
        synchronized(this)
        {
            for(int i=1;i<=15;i++)
            {
                System.out.println(n*i);
                try
                {
                    Thread.sleep(400);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class Thread1 extends Thread
{
    ThreadSynchronized t;
    Thread1(ThreadSynchronized t)
    {
        this.t=t;
        
    }
    public void run()
    {
        t.printTable(5);
    }
}
class Thread2 extends Thread
{
    ThreadSynchronized t;
    Thread2(ThreadSynchronized t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(100);
    }
}
class TestSynchronizedBlock1
{
    public static void main(String[] srgs)
    {
        ThreadSynchronized obj = new ThreadSynchronized();
        Thread1 thr1 = new Thread1(obj);
        Thread2 thr2 = new Thread2(obj);
        thr1.start();
        thr2.start();
    }
}
