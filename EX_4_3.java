class Person {

    String name = "Rakesh Kumar";

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    int roll = 590013590;

    void showRoll() {
        System.out.println("Roll No: " + roll);
    }
}

public class EX_4_3 {
    public static void main(String[] args) {

        Student s = new Student();

        s.display();   // inherited method
        s.showRoll();
    }
}


