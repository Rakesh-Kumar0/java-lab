public class EX_3_2 {

    static void show() {
        System.out.println("This is static method!");
    }

    void display() {
        System.out.println("This is non-static method!");
    }

    public static void main(String[] args) {

        System.out.println("Rakesh KUmar");

        EX_3_2 s1 = new EX_3_2();
        s1.show();
        s1.display();
    }
}

