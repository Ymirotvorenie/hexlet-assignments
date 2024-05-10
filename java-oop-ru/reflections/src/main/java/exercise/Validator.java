package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) throws IllegalAccessException {
        Field[] fields = address.getClass().getDeclaredFields();

        var result = new ArrayList<String>();
        for (Field field : fields) {
            if (notNullValid(field, address)) {
                result.add(field.getName());
            }
        }
        return result;
    }

    public static Map<String, List<String>> advancedValidate(Address address) throws IllegalAccessException {
        Field[] fields = address.getClass().getDeclaredFields();
        var result = new HashMap<String, List<String>>();
        for (Field field : fields) {
            if (notNullValid(field, address)) {
                result.put(field.getName(), new ArrayList<>(List.of("can not be null")));
            }
            if (minLengthValid(field, address)) {
                int minLength = field.getAnnotation(MinLength.class).minLength();
                String errorMsg = String.format("length less than %s", minLength);

                result.put(field.getName(),
                        new ArrayList<>(List.of(errorMsg))
                );
            }
        }
        return result;
    }

    public static boolean notNullValid(Field field, Address address) throws IllegalAccessException {
        NotNull annot = field.getAnnotation(NotNull.class);
        if (annot != null) {
            field.setAccessible(true);
            return field.get(address) == null;
        }
        return false;
    }

    public static boolean minLengthValid(Field field, Address address) throws IllegalAccessException {
        MinLength annot = field.getAnnotation(MinLength.class);

        if (annot != null) {
            field.setAccessible(true);
            int minLength = field.getAnnotation(MinLength.class).minLength();
            return field.get(address).toString().length() <= minLength;
        }
        return false;
    }


}
// END
