package exercise;

import java.util.HashMap;
import java.util.Map;

import static exercise.Utils.readFile;
import static exercise.Utils.serialize;
import static exercise.Utils.unserialize;
import static exercise.Utils.writeFile;

// BEGIN
public class FileKV implements KeyValueStorage {
    String path;

    public FileKV(String path, Map<String, String> data) {
        this.path = path;
        writeFile(path, serialize(data));
    }

    @Override
    public void set(String key, String value) {
        var data = unserialize(readFile(path));
        data.put(key, value);
        writeFile(path, serialize(data));
    }

    @Override
    public void unset(String key) {
        var data = unserialize(readFile(path));
        data.remove(key);
        writeFile(path, serialize(data));
    }

    @Override
    public String get(String key, String defaultValue) {
        return unserialize(readFile(path)).getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<String, String>(unserialize(readFile(path)));
    }
}
// END
