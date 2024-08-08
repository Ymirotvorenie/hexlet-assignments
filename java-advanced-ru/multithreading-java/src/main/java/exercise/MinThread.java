package exercise;

// BEGIN
public class MinThread extends Thread {
    private int[] numbers;
    private int minNumber;

    public MinThread(int[] numbers) {
        this.numbers = numbers;
    }

    public int getMinNumber() {
        return minNumber;
    }

    @Override
    public void run() {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        this.minNumber = min;
    }
}
// END
