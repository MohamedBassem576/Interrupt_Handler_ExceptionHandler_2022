package operatingSystems;

public class Main {
    public static void main(String[] args) {
        SimulatedOS os = new SimulatedOS();

        // Create processes
        Process processA = new Process("Process A");
        Process processB = new Process("Process B");

        // Simulate interrupt and exception handling
        Event asyncEvent = os.generateRandomEvent();
        os.handleInterrupt(asyncEvent);

        Event syncEvent = os.generateRandomEvent();
        os.handleException(syncEvent);

        // Execute processes
        os.executeProcess(processA);
        os.executeProcess(processB);
    }
}
