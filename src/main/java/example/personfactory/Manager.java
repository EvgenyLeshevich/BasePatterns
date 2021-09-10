package example.personfactory;

import example.Door;

public class Manager extends Person {
    public Manager(Door door) {
        super(door);
    }

    @Override
    public void closingDoor(boolean status) {
        System.out.println("Manager closing door...");
        super.closingDoor(status);
    }

    @Override
    public void openingDoor(boolean status) {
        System.out.println("Manager opening door...");
        super.openingDoor(status);
    }

    @Override
    public void statDoor() {
        super.statDoor();
    }
}
