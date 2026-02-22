class EX_4 {

    String college = "UPES";

    void showCollege() {
        System.out.println("College Name: " + college);
    }
}

class Child extends EX_4 {

    String name = "Rakesh Kumar";

    void showName() {
        System.out.println("Student Name: " + name);
    }
}

public class EXP_Inheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.showCollege();   // inherited method
        c.showName();      // child method
    }
}
