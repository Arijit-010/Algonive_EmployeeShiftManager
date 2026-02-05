public class Shift {
    int empId;
    String date;
    String startTime;
    String endTime;

    public Shift(int empId, String date, String startTime, String endTime) {
        this.empId = empId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void displayShift() {
        System.out.println("Date: " + date +
                           " | Start: " + startTime +
                           " | End: " + endTime);
    }
}

