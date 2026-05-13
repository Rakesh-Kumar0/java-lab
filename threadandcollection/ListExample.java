import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        System.out.println("Rakesh Kumar");
        ArrayList<String> list = new ArrayList<>();
        list.add("Rakesh");
        list.add("Kumar");
        list.add("Rakesh"); // duplicate allowed

        System.out.println(list);
    }
}
