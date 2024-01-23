package company;

public class Ford extends Car {
    public Ford(String name, int cylinders) {
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
