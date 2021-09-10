package example.personfactory;

import example.Door;

public class Teacher extends Person {
    public Teacher(Door door) {
        super(door);
    }

    @Override
    public void closingDoor(boolean status) {
        System.out.println("Teacher closing door...");
        super.closingDoor(status);
    }

    @Override
    public void openingDoor(boolean status) {
        System.out.println("Teacher opening door...");
        super.openingDoor(status);
    }
}
