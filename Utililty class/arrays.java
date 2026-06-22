import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // 1. Declare the array with a specific length
        int[] myArray_1= {1, 2, 3};
      
      String str = "Ryt567856569664";
      StringBuilder str1= new StringBuilder(str);
      int n=str1.capacity();
      str1.insert(89,"iop");
        System.out.println(n);
    }
}
