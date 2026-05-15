public class CountWords {
    public static void main(String[] args) {
        String sentence = "Rakesh Kumar is a student";
        String[] words = sentence.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
