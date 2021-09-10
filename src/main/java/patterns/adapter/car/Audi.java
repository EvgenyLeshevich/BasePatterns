package patterns.adapter.car;

public class Audi implements Car{
    @Override
    public double getSpeed() {
        return 250;
    }

    @Override
    public double getWeight() {
        return 5000;
    }
}
