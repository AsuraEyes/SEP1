import java.util.ArrayList;
import java.util.Objects;

/**
 * A class containing information about employee
 * @author Marketa Lapcikova, Timothy Johan Engkar
 * @version 1.0
 */

public class Employee {
    private String firstName, lastName;
    private MyDate dateOfBirth;
    private ArrayList<Project> projects;

    /**
     * 3-argument constructor initializing the Employee
     * @param firstName first name(s) of the employee
     * @param lastName last name(s) of the employee
     * @param dateOfBirth date of birth of the employee
     */
    public Employee(String firstName, String lastName, MyDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth.copy();
        projects = new ArrayList<Project>();
    }

    /**
     * Gets the list of employees he/she ever worked with on the same project
     * @return ArrayList of type String of names of coworkers
     */
    public ArrayList<String> getCoWorkers(){
        return null;
    }

    /**
     * Gets the ratio between the employees estimated and spent time on his/her tasks
     * @return number of type double being 1 if the estimated and spent time are equal
     */
    public double getProductivity(){
        return 0;
    }

    /**
     * Gets the number equal to total time spent on doing tasks
     * @return number of hours spent on tasks
     */
    public double getTotalSpentTime(){
        return 0;
    }

    /**
     * Gets the number equal to total time estimated on doing tasks
     * @return number of hours estimated on tasks
     */
    public double getTotalEstimatedTime(){
        return 0;
    }

    /**
     * Gets the list of projects this employee ever worked on
     * @return ArrayList of type Project including the projects he/she worked on
     */
    public ArrayList<Project> getProjectsWorkedOn(){
        return null;
    }

    /**
     * Sets first name(s) of the employee in case of change
     * @param firstName first name(s) of the employee
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the first name(s) of the employee
     * @return the first name(s) of the employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets last name(s) of the employee in case of change
     * @param lastName last name(s) of the employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the last name(s) of the employee
     * @return the last name(s) of the employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the date of birth of the employee
     * @return MyDate date of birth of the employee
     */
    public MyDate getDateOfBirth() {
        return dateOfBirth.copy();
    }

    /**
     * Compares the Employee with another object
     * @param obj the object we are comparing this Employee to
     * @return true if the two objects are equal, false if otherwise
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)){
            return false;
        }
        Employee other = (Employee) obj;
        return firstName.equals(other.firstName) &&
                lastName.equals(other.lastName) &&
                dateOfBirth.equals(other.dateOfBirth) &&
                projects.equals(other.projects);
    }
}
