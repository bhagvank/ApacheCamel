interface Mobile{  
void move();  
void jump();  
void leap(); 
void eat();  
}  
  
abstract class Animal implements Mobile{  
public void eat(){System.out.println("living on other animals");}  
}  
  
class Tiger extends Animal{  
public void move(){System.out.println("moving");}  
public void jump(){System.out.println("jumping");}  
public void leap(){System.out.println("leaping");}  
}  
  
class AbstractClassExample{  
public static void main(String args[]){  
Mobile animal =new Tiger();  
animal.move();  
animal.jump();  
animal.leap();  
animal.eat();  
}

}  