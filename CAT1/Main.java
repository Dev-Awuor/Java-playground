abstract class Vehicle {
    private String licensePlate;

    public Vehicle(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract String displayInfo();
 
}

class StaffVehicle extends Vehicle implements Parkable {
    public StaffVehicle(String licensePlate){
        super(licensePlate);
    }

    public void park() {
        System.out.print("Staff vehicle is parking");
    }

    @Override
    public String displayInfo(){
        return "This is a staff vehicle with license plate: " +getLicensePlate();
    }
}

public class Main {
    public static void main(String[] args){
        StaffVehicle myVehicle = new StaffVehicle("KAPS-123");
        System.out.println(myVehicle.displayInfo());
        myVehicle.park();
    }
}