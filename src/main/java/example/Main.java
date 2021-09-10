package example;

import example.personfactory.Person;
import example.personfactory.PersonFactory;

public class Main {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        Person teacher = personFactory.callPerson("teacher", Door.getDoor());
        Person student = personFactory.callPerson("student", Door.getDoor());
        Person manager = personFactory.callPerson("manager", Door.getDoor());

        teacher.statDoor();
        teacher.openingDoor(true);
        teacher.statDoor();
        student.statDoor();
        student.closingDoor(false);
        student.statDoor();
        manager.statDoor();
        manager.openingDoor(true);
        manager.statDoor();

    }
}
