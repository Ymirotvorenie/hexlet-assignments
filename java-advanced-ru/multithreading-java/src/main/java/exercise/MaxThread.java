package exercise;

// BEGIN
public class MaxThread extends Thread {
    private int[] numbers;

    private int maxNumber;

    public MaxThread(int[] numbers) {
        this.numbers = numbers;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public void run() {
        int max = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        this.maxNumber = max;
    }
}
// END
