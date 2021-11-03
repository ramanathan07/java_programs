public class DaemonThreadEg extends Thread{  
 public void run(){  
  if(Thread.currentThread().isDaemon()){
   System.out.println("daemon thread");  
  }  
  else{  
  System.out.println("user thread");  
 }  
 }  
 public static void main(String[] args){  
  DaemonThreadEg trd1=new DaemonThreadEg();
  DaemonThreadEg trd2=new DaemonThreadEg();  
  DaemonThreadEg trd3=new DaemonThreadEg();  
  
  trd1.setDaemon(true);
    
  trd1.start(); 
  trd2.start();  
  trd3.start();  
 }  
}  
