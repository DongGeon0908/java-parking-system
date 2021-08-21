import controller.ParkingLotController;
import parking.ParkingSystem;

public class CommandLineApplication {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem();
        new ParkingLotController(parkingSystem).play();
    }
}
