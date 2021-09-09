package patterns.factory.logistics;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставка морским путём.");
    }
}
