class Shape 
{ 
     public void display() 
     { 
         System.out.println("Shape display()"); 
     } 
} 
public class Rectangle extends Shape 
{ 
     @Override
     public void display() 
     { 
         System.out.println("Rectangle display(int )"); 
     } 
  
     public static void main(String args[]) 
     { 
         Rectangle rect = new Rectangle(); 
         rect.display(); 
     } 
}