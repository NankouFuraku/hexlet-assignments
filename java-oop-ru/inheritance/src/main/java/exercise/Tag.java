package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    public String getTag() {
        return tag;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    private String tag;
    private Map<String, String> attributes;

    public Tag(String tag, Map<String, String> attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }

    public String toString() {
        var result = String.format("<%s", tag);

        if (attributes.isEmpty()) {
            return result + ">";
        }

        var entries = attributes.entrySet();
        var tags = entries.stream()
                .map(e -> String.format(" %s=\"%s\"", e.getKey(), e.getValue()))
                .collect(Collectors.joining());

        return result + tags + ">";
    }
}
// END
