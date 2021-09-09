package patterns.factory.logistics;

public class Main {
    public static void main(String[] args) {
        Transport transportOne = planDelivery("sea").createTransport();
        transportOne.deliver();
    }
    static Logistics planDelivery(String logistics){
        Logistics toReturn = null;
        switch (logistics.toLowerCase()){
            case "road":
                toReturn = new RoadLogistics();
                break;
            case "sea":
                toReturn = new SeaLogistics();
                break;
            default:
                throw new RuntimeException(logistics + " is unknown.");
        }
        return toReturn;
    }
}
