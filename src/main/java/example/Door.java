package example;

public class Door {
    private static Door door;
    private static boolean status;

    private Door() {
    }

    public static synchronized Door getDoor() {
        if (door == null) {
            door = new Door();
        }
        return door;
    }

    public void closeDoor(boolean status) {
        Door.status = status;
    }

    public void openDoor(boolean status) {
        Door.status = status;
    }

    public void statusDoor() {
        System.out.println(status);
    }
}
