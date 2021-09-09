package patterns.factory.logistics;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставка наземным путём.");
    }
}
