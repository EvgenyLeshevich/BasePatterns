package example;

import example.adapter.PersonAdapter;
import example.adapter.PersonAdapterImpl;
import example.facadeperson.Workflow;
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

        PersonAdapter teacherAdapter = new PersonAdapterImpl(teacher);
        System.out.println(teacher.getSalary() + "BYN = " + teacherAdapter.getSalary() + "$");
        PersonAdapter managerAdapter = new PersonAdapterImpl(manager);
        System.out.println(manager.getSalary() + "BYN = " + managerAdapter.getSalary() + "$");
        PersonAdapter studentAdapter = new PersonAdapterImpl(student);
        System.out.println(student.getSalary() + "BYN = " + studentAdapter.getSalary() + "$");

        Workflow workflow = new Workflow();
        workflow.doWork();
        workflow.dontDoWork();
    }
}
