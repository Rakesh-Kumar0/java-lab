public class CountVowels {
    public static void main(String[] args) {
        String name = "Rakesh Kumar".toLowerCase();
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
