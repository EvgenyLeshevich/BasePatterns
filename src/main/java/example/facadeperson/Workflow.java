package example.facadeperson;

import example.Door;
import example.personfactory.Manager;
import example.personfactory.Person;
import example.personfactory.Students;
import example.personfactory.Teacher;

public class Workflow {
    Person manager = new Manager(Door.getDoor());
    Person teacher = new Teacher(Door.getDoor());
    Person student = new Students(Door.getDoor());

    WorkingTime workingTime = new WorkingTime();

    public void doWork(){
        workingTime.startWorkingTime();
        manager.doJobBeforeDeadline(workingTime);
    }

    public void dontDoWork(){
        workingTime.finishWorkingTime();
        manager.doJobBeforeDeadline(workingTime);
    }
}
