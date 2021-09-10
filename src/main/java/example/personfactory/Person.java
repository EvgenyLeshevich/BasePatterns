package example.personfactory;

import example.Door;

public abstract class Person {
    private static Door door;

    public Person(Door door) {
        Person.door = door;
    }

    public void closingDoor(boolean status) {
        door.closeDoor(status);
    }

    public void openingDoor(boolean status) {
        door.openDoor(status);
    }

    public void statDoor() {
        door.statusDoor();
    }
}
