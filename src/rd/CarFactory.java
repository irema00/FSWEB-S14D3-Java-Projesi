package rd;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla", "Electrical car", 100, 4);
        CarSkeleton hybridCar = new HybridCar("toyota", "tt", 0.8, 100, 4);
        CarSkeleton gasCar = new GasPoweredCar("test", "test gas car", 0.6, 4);
        printDriveResult(electricCar);
        printDriveResult(hybridCar);
        printDriveResult(gasCar);
    }

    private static void printDriveResult(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.drive());
    }
}
