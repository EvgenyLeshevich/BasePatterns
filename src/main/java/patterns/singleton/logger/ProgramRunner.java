package patterns.singleton.logger;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");

        ProgramLogger.getProgramLogger().showLogFile();

//        ProgramLogger programLogger = ProgramLogger.getProgramLogger();
//        programLogger.addLogInfo("Second Logger");
//        programLogger.showLogFile();
    }
}
