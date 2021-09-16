package example.facadeperson;

public class WorkingTime {
    private boolean activeWorkingTime;

    public boolean isActiveWorkingTime() {
        return activeWorkingTime;
    }

    public void startWorkingTime(){
        System.out.println("Working time is active");
        activeWorkingTime = true;
    }

    public void finishWorkingTime(){
        System.out.println("Working time is not active");
        activeWorkingTime = false;
    }
}
