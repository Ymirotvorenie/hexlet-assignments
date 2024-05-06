package exercise;

import java.util.Comparator;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int count) {

        apartments.sort(Comparator.comparing(Home::getArea));

        return apartments.stream()
                .filter(a -> apartments.indexOf(a) < count)
                .map(Home::toString)
                .toList();
    }
}
// END
