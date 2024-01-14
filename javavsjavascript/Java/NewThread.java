public class NewThread extends Thread
{  
  public void run()
  {  
    System.out.println("Thread running now");  
  }
  
  public static void main(String args[])
  {  
    NewThread newThread =new NewThread();  
    newThread.start();  
  }  
} 