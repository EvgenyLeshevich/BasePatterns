package patterns.factory.logistics;

public class SeaLogistics implements Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
