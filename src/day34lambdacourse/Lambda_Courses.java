package day34lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Courses {
    public static void main(String[] args) {


        Courses courseTurkishDay = new Courses("Summer", "Turkish Daytime", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Nighttime", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Daytime", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Nighttime", 93, 144);

        List<Courses> coursesList = new ArrayList<>();  // Courses is the name of class; it can also be used as data type
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(checkAverageScoreGreaterThanGivenNum(coursesList, 91));

        System.out.println(checkIfCourseNameHasGivenWord(coursesList, "Urdu"));

        System.out.println(getCourseNameWithHighestAvgScore(coursesList));

        System.out.println(sortCoursesWithAvgScoreInAscendingOrder(coursesList, 2));

    }

    //1. Create a method to check if all average scores are greater than given number

    public static boolean checkAverageScoreGreaterThanGivenNum(List<Courses> list, int num){
      return  list.stream().allMatch(t-> t.getAverageScore()> num);
    }

    // 2. Create a method to check if at least one of the courses names contains the given word

    public static boolean checkIfCourseNameHasGivenWord(List<Courses> list, String word){
        return list.stream().anyMatch(t-> t.getCourseName().contains(word));
    }

    // 3. Create a method to print the course name whose average score is the highest

    public static String getCourseNameWithHighestAvgScore(List<Courses> list){
     return   list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }

    // 4. Sort the list elements according to the average score in ascending order and skip
    //    the element according to the given number

    public static List<Object> sortCoursesWithAvgScoreInAscendingOrder(List<Courses> list, int num){
      return  list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
    }                                                               // collect() is used to create a new list in the functional programming


    // 5. Sort the list elements according to the average score in ascending order and print just the given one.
}
