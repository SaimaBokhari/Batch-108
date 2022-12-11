package day18datetimeclassandvarargs;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a =12;
        int b = a++;
        System.out.println(b);  //12
        System.out.println(a);  // 13  Post Increment

        // Java comes from the top and left. Java sees container b, then sees assignments operator
        // and gets the msg that the next value needs to be assigned to b. When Java reaches 12 (value of a),
        // Java immediately assigns it to b without looking at the ++ sign. Hence, b=12
        // Then Java sees increment sign (++), so it increases the value of (a). Hence, a=13

        int x = 15;
        int y = x--;
        System.out.println(y);
        System.out.println(x); // 14  Post Decrement

        int m = 21;
        int n = ++m;      // Pre Increment
        System.out.println(m); //22
        System.out.println(n); //22

        int t = 32;
        int u = --t;  //Pre Decrement
        System.out.println(t);  // 31
        System.out.println(u);  // 31














    }
}
