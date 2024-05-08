package exercise;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        var entrySet = storage.toMap().entrySet();
        entrySet.forEach(e -> {
            storage.unset(e.getKey());
            storage.set(e.getValue(), e.getKey());

        });
    }
}
// END
