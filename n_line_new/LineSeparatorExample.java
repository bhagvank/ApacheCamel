public class LineSeparatorExample
{

  public static void main(String[] args)
  {
	 String line1 = "Line1.";
	 String line2 = "Line2.";
	 String line3 = line1 + System.getProperty("line.separator") + line2;
	 
	 System.out.println(line3);
  
  }

}