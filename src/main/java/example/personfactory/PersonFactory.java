package example.personfactory;

import example.Door;

public class PersonFactory {
    public Person callPerson(String speciality, Door door) {
        Person toReturn = null;
        switch (speciality.toLowerCase()) {
            case "teacher":
                toReturn = new Teacher(door);
                break;
            case "student":
                toReturn = new Students(door);
                break;
            case "manager":
                toReturn = new Manager(door);
                break;
            default:
                throw new RuntimeException(speciality + " is unknown speciality");
        }
        return toReturn;
    }
}
