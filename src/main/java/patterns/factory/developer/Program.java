package patterns.factory.developer;

public class Program {
    public static void main(String[] args) {
        Developer developerOne = createDeveloperBySpeciality("java").createDeveloper();
        developerOne.writeCode();
        Developer developerTwo = createDeveloperBySpeciality("php").createDeveloper();
        developerTwo.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        DeveloperFactory toReturn = null;
        switch (speciality.toLowerCase()){
            case "java":
                toReturn = new JavaDeveloperFactory();
                break;
            case "c++":
                toReturn = new CppDeveloperFactory();
                break;
            case "php":
                toReturn = new PhpDeveloperFactory();
                break;
            default:
                throw new RuntimeException(speciality + " is unknown speciality");
        }
        return toReturn;
//        if (speciality.equalsIgnoreCase("java")) {
//            return new JavaDeveloperFactory();
//        } else if (speciality.equalsIgnoreCase("c++")) {
//            return new CppDeveloperFactory();
//        } else if (speciality.equalsIgnoreCase("php")) {
//            return new PhpDeveloperFactory();
//        } else {
//            throw new RuntimeException(speciality + " is unknown speciality");
//        }
    }
}
