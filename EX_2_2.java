public class EX_2_2 {
    static String College_name = "ABC";
    String name;

    void show() {
        System.out.println(College_name + " " + name);
    }

    public static void main(String[] args) {

        EX_2_2 k = new EX_2_2();
        k.name = "Rakesh Kumar";
        k.show();

        EX_2_2 k2 = new EX_2_2();
        EX_2_2.College_name = "DEF";
        k2.name = "S2";
        k2.show();

        k.show();
    }
}
