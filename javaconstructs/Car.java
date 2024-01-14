public class Car {
        
    
    public String model;
    public String engineType; 
    public int vehicleNum;
        
    
    public Car(String model,String engineType,int vehicleNum) {
        this.model = model;
        this.engineType = engineType;
        this.vehicleNum = vehicleNum;
    }
        
   
    public void setModel(String model) {
        this.model = model;
    }
        
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    public void setVehicleNum(int vehicleNum) {
        this.vehicleNum = vehicleNum;
    }
        
    public String getModel() {
        return this.model;
    }
        
    public String getEngineType() {
        return this.engineType;
    }        

    public int getVehicleNum() {
        return this.vehicleNum;
    }
    
    public void printInfo() {
        
        System.out.println("Model " + getModel());
        System.out.println("engineType " + getEngineType());
        System.out.println("VehicleNum " + getVehicleNum());
        
    }
    
    public static void main(String[] args)
    {
        Car car = new Car("Toyota Tercel","Single Cylinder",2342334);
        
        car.printInfo();
        
        System.out.println("Changing the car properties");
        car.setModel("Honda Civic");
        car.setEngineType("Four Cylinder");
        car.setVehicleNum(45453434);
        
        car.printInfo();
    }
        
}