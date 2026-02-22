public class EX_4_2 {

    static class Grandparent {
        void showGrandparent() {
            System.out.println("This is Grandparent class");
        }
    }

    static class Parent extends Grandparent {
        void showParent() {
            System.out.println("This is Parent class");
        }
    }

    static class Child extends Parent {
        void showChild() {
            System.out.println("This is Child class");
        }
    }

    public static void main(String[] args) {
        System.out.println("Rakesh Kumar ");
        Child c = new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();
    }
}