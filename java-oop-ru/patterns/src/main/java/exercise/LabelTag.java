package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String labelTag;
    private TagInterface tag;

    public LabelTag(String labelTag, TagInterface tag) {
        this.labelTag = labelTag;
        this.tag = tag;
    }

    @Override
    public String render() {
        return "<label>" + labelTag + tag.render() + "</label>";
    }
}
// END
