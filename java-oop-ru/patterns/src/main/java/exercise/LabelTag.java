package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String labelText;
    private TagInterface tag;

    public LabelTag(String labelText, TagInterface tag) {
        this.labelText = labelText;
        this.tag = tag;
    }

    public String render() {
        return "<label>" + labelText + tag.render() + "</label>";
    }
}
// END
