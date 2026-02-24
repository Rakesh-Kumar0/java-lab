interface I1 {
   
    int a = 10;
    void show();
    void dispaly();
}
interface I2{
    void output();
}
interface I3 {
    void method();
}

class B1 implements I1,I2 {
    public void show(){
        System.out.println("Methos show");
    }
    public void dispaly(){
        //a = a + 1;
        System.out.println("Method dispaly " + a);
    }

     public void output(){
        
        System.out.println("Method output " );
     }
    public static void main(String[] args) {
        B1 b = new B1();
        b.show();
        b.dispaly();
        b.output();
    }
}

