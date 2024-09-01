package MesozoicEdenParkManagerCh8;

import java.util.Arrays;

public class Employee {
    private String name;
    private String jobTitle;
    private int yearsExperience;
    private String[] schedule;

    public Employee(String jobTitle, int yearsExperience, String name, String[] schedule) {
        this.jobTitle = jobTitle;
        this.yearsExperience = yearsExperience;
        this.name = name;
        this.schedule = schedule;//new String[7];//{"09:00 - 17:00", "09:00 - 17:00", "09:00 - 17:00", "09:00 - 17:00", "09:00 - 17:00", "N/A", "N/A"};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String[] getSchedule() {
        String[] newArr = Arrays.copyOf(schedule,7);
        return newArr;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }
    public String getScheduleToString() {
        StringBuilder scheduleToString = new StringBuilder();
        String[]days = new String[]{"Mon","Tues","Wed","Thurs","Fri","Sat","Sun"};
        for(int index = 0; index<7; index++){
            scheduleToString.append(days[index]+ " : " + schedule[index]+"  ");
        }
        return scheduleToString.toString();
    }
}
