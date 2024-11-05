package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> children;

    public PairedTag(String tag, Map<String, String> attributes, String tagBody, List<Tag> children) {
        super(tag, attributes);
        this.tagBody = tagBody;
        this.children = children;
    }

    @Override
    public String toString() {
        var result = String.format("<%s", getTag());

        if (getAttributes().isEmpty()) {
            result += ">";
        } else {
            var entries = getAttributes().entrySet();
            var tags = entries.stream()
                    .map(e -> String.format(" %s=\"%s\"", e.getKey(), e.getValue()))
                    .collect(Collectors.joining());
            result += tags + ">";
        }

        result += tagBody;

        if (children.isEmpty()) {
            return result + String.format("</%s>", getTag());
        }
        var childrenTags = children.stream()
                .map(Tag::toString)
                .collect(Collectors.joining());

        return result += childrenTags + String.format("</%s>", getTag());
    }
}
// END
