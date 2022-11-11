import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        double[] Random = {2, 1, -7, 1, 3, 4, -2, 9, -4, 3, -5, 7, 7, 2, 8, 8, -2, 2, -5, 4, 2, 4, 1, 1, -3, 3, 10, 1};
        double Average = 0;
        int Count = 0;
        boolean control = false;
        for (double number : Random) {
            if (number < 0) {
                control = true;

            } else if (number < 0 && control) ;
            {
                Average += number;
                Count++;
                System.out.println(number);
                System.out.println(Arrays.toString(Random) + "= " + Average / number);
            }


        }
    }
}
