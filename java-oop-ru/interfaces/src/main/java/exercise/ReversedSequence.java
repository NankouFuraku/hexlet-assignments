package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String reversedSequence;
    public ReversedSequence(String sequence) {
        this.reversedSequence = new StringBuilder(sequence).reverse().toString();
    }

    public int length() {
        return toString().length();
    }

    public char charAt(int index) {
        return toString().charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return toString().subSequence(start, end);
    }

    public String toString() {
        return reversedSequence;
    }
}
// END
