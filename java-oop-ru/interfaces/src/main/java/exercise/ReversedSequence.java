package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String text;

    public ReversedSequence(String text) {
        this.text = new StringBuilder(text).reverse().toString();
    }
    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        char[] chars = text.toCharArray();
        return chars[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.substring(start, end);
    }

    @Override
    public String toString() {
        return text;
    }
}
// END
