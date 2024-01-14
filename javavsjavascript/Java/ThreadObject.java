public class ThreadObject implements Runnable
{  
  public void run()
  {  
    System.out.println("ThreadObject running");  
  }  
  
public static void main(String args[])
{  
  ThreadObject threadObject =new ThreadObject();  
  Thread thread =new Thread(threadObject);  
  thread.start();  
 }  
}