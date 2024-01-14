public class ObjectCreator {

    public static void main(String[] args) {
		
        Car car1 = new Car("Toyota Tercel","Single Cylinder",2342334);
        Car car2 = new Car("Ford Mustang","DOHC",2394434);
        
        car1.printInfo();
        car2.printInfo();
        
        System.out.println("Changing the car2 properties");
        car2.setModel("Chevorlet Bolt");
        car2.setEngineType("Four Cylinder");
        car2.setVehicleNum(2234234);
        
        car2.printInfo();
    }
}