interface Machine
{
    
    int distanceTravelled=100;
    public int getDistance();
}
interface Vehicle
{
    int  velocity=50;
    public int getVelocity();
}
class Plane implements Machine, Vehicle
{
    int time;
    int velocity;
    int distanceTravelled;
    
    
    public Plane(int velocity, int time)
    {
        this.velocity = velocity;
        this.time = time;
    }
    
    public int getDistance()
    {
        distanceTravelled= velocity*time; 
        System.out.println("Total Distance  is : "+distanceTravelled);
        return distanceTravelled;
    }
    public int getVelocity()
    {
        int velocity=distanceTravelled/time;
        System.out.println("Velocity  is : "+ velocity);
        return velocity;
    }
}
public class Truck implements Machine, Vehicle
{
    int time;
    int velocity;
    int distanceTravelled;
    
    
    public Truck(int velocity, int time)
    {
        this.velocity = velocity;
        this.time = time;
    }
    
    public int getDistance()
    {
        distanceTravelled= velocity*time; 
        System.out.println("Total Distance  is : "+distanceTravelled);
        return distanceTravelled;
    }
    public int getVelocity()
    {
        int velocity=distanceTravelled/time;
        System.out.println("Velocity  is : "+ velocity);
        return velocity;
    }
    public static void main(String args[])
    {
        Truck truck = new Truck(50,2);
        truck.getDistance();
        truck.getVelocity();
		
		Plane plane = new Plane(1000,3);
        plane.getDistance();
        plane.getVelocity();
    }
}
