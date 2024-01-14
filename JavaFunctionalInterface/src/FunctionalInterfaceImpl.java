@java.lang.FunctionalInterface 
interface greeting{  
    public void greet(String message);
    int hashCode();  
    String toString();  
    boolean equals(Object obj); 
}  
public class FunctionalInterfaceImpl implements greeting{  
    public void greet(String message){  
        System.out.println("The Greeting is "+message);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceImpl finterface = new FunctionalInterfaceImpl();  
        finterface.greet("Good Morning");  
    }  
}
