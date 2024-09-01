package ch8Exercises;

public class Ch8Ex2 {

}
class Employee{
    private String name;
    private String jobTitle;
    private int yearsExperience;

    public Employee(String name, String jobTitle, int yearsExperience){
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearsExperience = yearsExperience;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle(){
        return getJobTitle();
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
