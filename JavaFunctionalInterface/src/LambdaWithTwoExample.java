
public class LambdaWithTwoExample {
	
	interface FuncExpr 
    { 
        int execute(int x, int y); 
    } 
  
     
  
    private int executor(int x, int y, FuncExpr fexpr) 
    { 
        return fexpr.execute(x, y); 
    } 

	public static void main(String[] args) {
		FuncExpr sum = (int x1, int x2) -> x1 + x2; 
		  
         
        FuncExpr product = (int x1, int x2) -> x1 * x2; 
  
 
        LambdaWithTwoExample example = new LambdaWithTwoExample(); 
  

        System.out.println("Sum is " + 
                          example.executor(9, 4, sum)); 
  
         
        System.out.println("Product is " + 
        		example.executor(7,3, product));

	}

}
