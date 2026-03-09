public interface A {
    void show();
}

interface B extends A {}
interface C extends A {}

class D implements B, C {

    public void show(){
        System.out.println("Resolved diamond problem");
    }

}

public class diamondProblem {

    public static void main(String args[]){

        D obj = new D();
        obj.show();

    }

} 
    

