package patterns.facade;

public class Job {
    public void doJob(){
        System.out.println("Job in progress...");
    }

    public void dontJob(){
        System.out.println("Job is not in progress...");
    }
}
