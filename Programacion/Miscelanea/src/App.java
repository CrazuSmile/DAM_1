
public class App {

    public static int minimo(int... nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimo(3, 2, 21, 5, 1));
    }
}
