package patterns.adapter.car;

public class Main {
    public static void main(String[] args) {
        Car audi = new Audi();
        CarAdapter audiAdapter = new CarAdapterImpl(audi);
        System.out.println(audiAdapter.getSpeed());
    }
}
