interface I1{
    int a = 10;
    void show();
    void dispaly();
}
class B1 implements I1 {
    public void show(){
        System.out.println("Methos show");
    }
    public void dispaly(){
        //a = a + 1;
        System.out.println("Method dispaly " + a);
    }
    public static void main(String[] args) {
        B1 b = new B1();
        b.show();
        b.dispaly();
    }
}
