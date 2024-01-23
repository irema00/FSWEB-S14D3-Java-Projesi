package company;

public class Holden extends Car {
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting!";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + " is accelerating!";
    }

    @Override
    public String brake() {

        super.brake();
        return getName() + " is braking!";
    }
}
