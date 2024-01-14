/**
 *  Lambda Thread
 */


public class LambdaThread {

	/**
	 * Default Constructor 
	 */
	public LambdaThread() {
		
	}

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Thread(() -> System.out.println("running")).start();

	}

}
