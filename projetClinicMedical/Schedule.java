public class Schedule {
    private List<String> workingDays;
    private List<String> workingHours;

    public Schedule() {
        this.workingDays = new ArrayList<>();
        this.workingHours = new ArrayList<>();
    }

    public void addWorkingDay(String day) {
        workingDays.add(day);
    }

    public void addWorkingHour(String hour) {
        workingHours.add(hour);
    }

    public List<String> getWorkingDays() {
        return workingDays;
    }

    public List<String> getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        return "Working Days: " + workingDays + ", Working Hours: " + workingHours;
    }
}

