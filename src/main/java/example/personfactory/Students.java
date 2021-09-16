package example.personfactory;

import example.Door;

public class Students extends Person {
    public Students(Door door) {
        super(door);
    }

    @Override
    public void closingDoor(boolean status) {
        System.out.println("Student closing door...");
        super.closingDoor(status);
    }

    @Override
    public void openingDoor(boolean status) {
        System.out.println("Student opening door...");
        super.openingDoor(status);
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public void doJob() {
        System.out.println("Students write code");
    }

    @Override
    public void dontDoJob() {
        System.out.println("Students don't write code");
    }
}
