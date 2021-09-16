package example.personfactory;

import example.Door;
import example.facadeperson.Job;
import example.facadeperson.WorkingTime;

public abstract class Person implements Job {
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

    // Adapter

    public abstract double getSalary();

    // Facade

    public void doJobBeforeDeadline(WorkingTime workingTime){
        if(workingTime.isActiveWorkingTime()){
            doJob();
        } else {
            dontDoJob();
        }
    }
}
