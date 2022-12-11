package day15multidimensionalarrayslist;

public class MultidimensionalArrays04 {
    public static void main(String[] args) {

      /*
      Example: 1
      Find the maximum element in a two-multidimensional Arrays.
        { {5,0}, {-2,4}, {65, -12, 23} }
       */

        int arr[][] = { {5,0}, {-2,4}, {65, -12, 230} };

        int max = arr[0][0];

        for(int[] w: arr){
            for(int u: w){
//                if(max<u){
//                    max = u;  // = assignment operator assigns the value of u to max container.
//                }
                max= Math.max(max, u);   // Math.max() does the same as if condition. It selects the max value of the two given.
            }
        }
        System.out.println(max);













    }
}
