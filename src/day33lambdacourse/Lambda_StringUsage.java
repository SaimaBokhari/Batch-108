package day33lambdacourse;

import day32lambdacourse.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lambda_StringUsage {
    public static void main(String[] args) {

        List<String> l= new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Tom");
        l.add("Ben");

        printUppercase(l);
        System.out.println();

        printUppercase02(l);
        System.out.println();

        printEleSortedByLengths(l);  // TOM BEN MARK JOHN ALLEY MARRY AMANDA TUCKER JACKSON ALBERTO
        System.out.println();

        printEleInReverseOrderSortedByLength(l);  // JACKSON ALBERTO AMANDA TUCKER ALLEY MARRY MARK JOHN TOM TOM BEN
        System.out.println();

        printDistinctEleSortedByLastChar(l);  // AMANDA MARK TOM JOHN JACKSON BEN ALBERTO TUCKER ALLEY MARRY
        System.out.println();

        printSortedByLengthAndSortedByInitial(l);  // BEN TOM TOM JOHN MARK ALLEY MARRY AMANDA TUCKER ALBERTO JACKSON
        System.out.println();

//        removeElementGreaterThanFiveLength(l);   // [TOM, ALLEY, MARK, JOHN, MARRY, TOM, BEN]
//        System.out.println();

//        printRemoveIfStartingWithAOrEndingWithN01(l); // [TOM, MARK, MARRY, TOM]
//        System.out.println();
//
//        printRemoveIfStartingWithAOrEndingWithN02(l);  // [TOM, MARK, MARRY, TUCKER, TOM]
//        System.out.println();

//        removeIfLengthBetweenFiveAndNineOrEndingWithO(l);  // [TOM, MARK, JOHN, TOM, BEN]
//        System.out.println();

        System.out.println(checkLengthIfLessThanTwelve(l));  // true
        System.out.println();

        System.out.println(isInitialX(l));  // true
        System.out.println();

        System.out.println(isEndingWithN(l));
        System.out.println();

    }

    // 1. Create a method to print all list elements in uppercase.

    public static void printUppercase(List<String> list ){

        // 1st way:

        list.stream().map(String::toUpperCase).forEach(UtilsClass::printWithSpace);
        // TOM ALLEY MARK AMANDA JOHN JACKSON MARRY ALBERTO TUCKER BEN

        //map() is used to update the data/elements
    }

    // 2nd way:
    public static void printUppercase02(List<String> list ){
        // using stream() is not a must for collections
       list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }

    // 2. Create a method to print the elements after ordering according to their lengths (number of letters in them -> ascending order)

    public static void printEleSortedByLengths(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printWithSpace);
    }

    // 3.Create a method to print the elements after ordering according to their lengths (In reverse order, the longest element first)

    public static void printEleInReverseOrderSortedByLength(List<String> list){
        list.
                stream().
                sorted(Comparator.comparing(String::length).
                reversed()).forEach(UtilsClass::printWithSpace);
    }

    // 4. Create a method to sort the distinct elements by using their last characters

    public static void printDistinctEleSortedByLastChar(List<String> list){
        list.
                stream().
                distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).
                forEach(UtilsClass::printWithSpace);
    }

    /*
    We are not creating a method because it is easy to find first char ==> t-> t.charAt(0) for this one
    We could ve just used  t-> t.charAt(t.length-1) for the last char but creating method in Utils class is easier
     */

    // 5.Create a method to sort the elements according to their lengths then according to their first character

    public static void printSortedByLengthAndSortedByInitial(List<String> list){ // for first character, we use charAt(0) method as usual
        list.
                stream().
                sorted(Comparator.comparing(String::length).
                        thenComparing(t-> t.charAt(0))).
                forEach(UtilsClass::printWithSpace);
    }

    // 6. Remove the elements if the length of the element is greater than 5

//    public static void removeElementGreaterThanFiveLength(List<String> list){
//        list.removeIf(t -> t.length()>5);
//        System.out.println(list);
//    }

    // 7. Remove the elements if the element is starting with 'A', 'a' or ending with 'N', 'n'

    // 1st way:
//    public static void printRemoveIfStartingWithAOrEndingWithN01(List<String> list){
//        list.removeIf(t-> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(t.length()-1)== 'N'|| t.charAt(t.length()-1)=='n');
//        System.out.println(list);
//    }
//
//    // 2nd way:
//    public static void printRemoveIfStartingWithAOrEndingWithN02(List<String> list){
//        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
//        System.out.println(list);
//    }

    // 8. Remove the elements if the length is between 5 and 9 or ending with 'o'.

//    public static void removeIfLengthBetweenFiveAndNineOrEndingWithO(List<String> list){
//        Predicate<String> checkCondition = t-> (t.length()>4 && t.length()<10) || t.endsWith("o");
//
//        list.removeIf(t-> checkCondition.test(t));
//        System.out.println(list);
//    }
    // we can move the condition part (starting from t-> ....) to checkCondition ... we create this variable from
    // Predicate interface (functional interface) .. and in this Predicate data type, we use test() and put the 't'
    // elements ... it returns boolean

    // 9. Create a method to check if the lengths of all elements are less than 12

    public static boolean checkLengthIfLessThanTwelve(List<String> list){
        return list.stream().allMatch(t-> t.length()<12);
                // allMatch() returns whether all elements of this stream match the provided predicate(condition).
    }

    // other way
    public static boolean isLengthLessThanTwelve(List<String> list){

        Predicate<String> checkCondition = t-> t.length()<12;

        boolean a =  list.stream().allMatch(t-> checkCondition.test(t));
        System.out.println(a);
        return a;

    }

    //10. Create a method to check if the initial of any element is not 'X'

    public static boolean isInitialX(List<String> list){
      return  list.stream().noneMatch(t-> t.startsWith("X"));
    }
    // noneMatch() checks None of the element should match the given condition

    // 11. Create a method to check if at least one of the elements ending with lowercase 'n'.

    public static boolean isEndingWithN(List<String> list){
       return list.stream().anyMatch(t-> t.endsWith("N"));
    }






}
