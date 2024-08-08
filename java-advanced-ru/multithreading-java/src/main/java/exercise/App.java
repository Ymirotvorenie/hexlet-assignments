package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

class App {
    private static final Logger LOGGER = Logger.getLogger("AppLogger");

    // BEGIN
    public static Map<String, Integer> getMinMax(int[] numbers) {
        MaxThread maxThread = new MaxThread(numbers);
        MinThread minThread = new MinThread(numbers);

        maxThread.start();
        LOGGER.log(Level.INFO, "Thread " + minThread.getName() + " started");
        minThread.start();
        LOGGER.log(Level.INFO, "Thread " + maxThread.getName() + " started");

        try {
            maxThread.join();
            LOGGER.log(Level.INFO, "Thread " + minThread.getName() + " finished");
            minThread.join();
            LOGGER.log(Level.INFO, "Thread " + maxThread.getName() + " finished");
        } catch (InterruptedException e) {
            System.out.println("Поток был прерван");;
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("min", minThread.getMinNumber());
        result.put("max", maxThread.getMaxNumber());

        LOGGER.log(Level.INFO, "Result: " + result);

        return result;
    }
    // END
}
