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

    @Override
    public double getSalary() {
        return 2000;
    }

    @Override
    public void doJob() {
        System.out.println("The teacher teaches students to write code");
    }

    @Override
    public void dontDoJob() {
        System.out.println("The teacher don't teaches students to write code");
    }
}
