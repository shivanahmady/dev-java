package datastruct;

public class arrays {
    public static void main(String[] args) {
        int sum;
        int[] numbers = new int[6];
        numbers[1] = 001;
        numbers[0] = 100;

        String[] names = { "Steve", "Billy" };

        sum = 0;
        for (int x = 0; x < numbers.length; x++) {
            sum += numbers[x];
        }

        System.out.println(sum);

        sum = 0;
        for (int x : numbers) {
            // x has the value of numbers[x]
            sum += x;
        }

        System.out.println(sum);
    }
}
