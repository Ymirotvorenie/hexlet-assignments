package exercise;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();
    private FileKV storage;

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.CREATE);

        storage = new FileKV(filepath.toString(), Map.of("key1", "value1", "key2", "value2"));
    }

    // BEGIN
    @Test
    public void testFileKVGet() {
        assertThat(storage.get("key1", "default")).isEqualTo("value1");
        assertThat(storage.get("key3", "default")).isEqualTo("default");
    }

    @Test
    public void testFileKVSet() {
        storage.set("key3", "value3");
        assertThat(storage.get("key3", "default")).isEqualTo("value3");
    }

    @Test
    public void testFileKVUnset() {
        storage.unset("key1");
        assertThat(storage.get("key1", "default")).isEqualTo("default");
    }

    @Test
    public void testFileKVToMap() {
        assertThat(storage.toMap()).isEqualTo(Map.of("key1", "value1", "key2", "value2"));
    }
    // END
}
