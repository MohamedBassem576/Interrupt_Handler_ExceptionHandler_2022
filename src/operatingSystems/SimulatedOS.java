package operatingSystems;

import java.util.Random;

//Simulated OS class
class SimulatedOS {
 private Process currentProcess;

 public SimulatedOS() {
     this.currentProcess = null;
 }

 // Method to generate a random event
 public Event generateRandomEvent() {
     Random random = new Random();
     return Event.values()[random.nextInt(Event.values().length)];
 }

 // Interrupt handler for asynchronous events
 public void handleInterrupt(Event event) {
     switch (event) {
         case KEY_PRESS:
             // Post the key value into a system area near the bottom of memory
             System.out.println("Key pressed. Post the key value into memory.");
             break;
         case DISK_READ_COMPLETE:
             // Set disk status and perform read/write operations
             System.out.println("Disk controller finished reading data. Set disk status accordingly.");
             break;
         // Handle other asynchronous events here
     }
 }

 // Exception handler for synchronous events
 public void handleException(Event event) {
     switch (event) {
         case REQUEST_HEAP:
             // Check if possible, then allocate if so
             System.out.println("Requesting more heap. Check if possible, then allocate if so.");
             break;
         case DIVIDE_BY_ZERO:
             // Kill the current process
             System.out.println("Attempt to divide by zero. Killing the current process.");
             if (currentProcess != null) {
                 currentProcess.setState(ProcessState.TERMINATED);
             }
             break;
         case ACCESS_PRIVILEGED_MEMORY:
             // Reallocate a new space in memory
             System.out.println("Attempt to access privileged memory. Reallocate a new space in memory.");
             break;
         // Handle other synchronous events here
     }
 }

 // Method to execute a process
 public void executeProcess(Process process) {
     currentProcess = process;
     currentProcess.setState(ProcessState.RUNNING);

     // Simulate the execution of the process (replace with actual implementation)
     System.out.println("Executing process: " + currentProcess.getName());

     // Set the process state to terminated after execution
     currentProcess.setState(ProcessState.TERMINATED);
     currentProcess = null;
 }
}
