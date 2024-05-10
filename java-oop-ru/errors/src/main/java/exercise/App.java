package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            System.out.println((int) Math.ceil(circle.getSquare()));
        } catch (NegativeRadiusException ex) {
            System.out.println(ex.msg);
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
