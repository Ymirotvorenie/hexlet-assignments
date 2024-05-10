package exercise;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    private String name;
    private Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = new LinkedHashMap<>(attributes);
    }

    public String getTagName() {
        return name;
    }

    public String getAttributesString() {
        return attributes
                .entrySet()
                .stream()
                .map(e -> String.format(" %s=\"%s\"", e.getKey(), e.getValue()))
                .collect(Collectors.joining());
    }

    public String toString() {
        return String.format("<%s%s>", getTagName(), getAttributesString());
    }
}
// END
