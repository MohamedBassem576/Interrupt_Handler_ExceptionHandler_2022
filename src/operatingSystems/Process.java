package operatingSystems;

//Class to represent a simulated process
class Process {
 private String name;
 private ProcessState state;

 public Process(String name) {
     this.name = name;
     this.state = ProcessState.READY;
 }

 public String getName() {
     return name;
 }

 public ProcessState getState() {
     return state;
 }

 public void setState(ProcessState state) {
     this.state = state;
 }
}
