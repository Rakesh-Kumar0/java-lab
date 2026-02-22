public class EX_2_1 {

    String College_name = "UPES";
    String name;

    void show() {
        System.out.println(name + " " + College_name);
    }

    public static void main(String[] args) {

        EX_2_1 k = new EX_2_1();
        k.name = "Rakesh Kumar";
        k.show();

        EX_2_1 k2 = new EX_2_1();
        k2.name = "Ram";
        k2.College_name = "def";
        k2.show();

        k.show();
    }
}