package day23encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

        Student std1 = new Student();  // create student object
        System.out.println(std1.name); // can read name

        // std1.id; // can't read it coz it's private. so we create getter()

        System.out.println(std1.getStdId());
        System.out.println(std1.getStdGpa());

        // to update (assign the new value and then print getDisease().
        std1.setDisease(null);
        System.out.println(std1.getDisease()); // null

        std1.setStdGpa(4.0);
        System.out.println(std1.getStdGpa());  // 4.0





    }
}
