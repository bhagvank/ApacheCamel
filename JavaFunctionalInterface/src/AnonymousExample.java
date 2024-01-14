/**
 * Anonymous Example
 */

/**
 * @author bhagvan.kommadi
 *
 */
public class AnonymousExample {

	/**
	 * Default Constructor
	 */
	public AnonymousExample() {
		
	}

	/**
	 *  main method
	 * @param args
	 */
	public static void main(String[] args) {

		
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Running");
			}
		}).start();
		

	}

}
