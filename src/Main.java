import company.Car;
import company.Ford;
import company.Holden;
import company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);

        printStartEngine(car);

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi("Outlander VRX 4WD", 6);

        printStartEngine(mitsubishi);

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford("Ford Falcon", 6);

        printStartEngine(mitsubishi);

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden("Holden Commodore", 6);

        printStartEngine(mitsubishi);

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());
    }


    private static void printStartEngine(Car car) {
    }
}