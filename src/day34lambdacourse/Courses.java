package day34lambdacourse;

public class Courses {
    /*
    Pojo classes are the classes where we store our constantly needed
    variables and constructor.

    For mostly used methods, we use UtilsClass; for mostly used variables, we use pojo class.
     */

    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    //1)Constructor without parameter
    public Courses() {   // can be used to create an object Courses course1 = new Courses();
    }

    //2)Constructor with all parameters
    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        // Courses turkishCourse = new Courses( Summer, )
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    //3)getters() and setter()  Java beans

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    //4)toString()
    @Override
    public String toString() { // we use toString() to get the result printed on the console after get() and set() methods
        return "Course: Season=" + Season + ", courseName=" + courseName + ", averageScore=" + averageScore
                + ", numberOfStudents=" + numberOfStudents;
    }
}
