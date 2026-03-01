interface A {
    void show();
}

interface B {
    void display();
}

class Demo implements A, B {
    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("Interface B method");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
        obj.display();
    }
}