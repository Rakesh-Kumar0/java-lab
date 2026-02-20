 class p1 {
    void show(){
        System.out.println("Hello");
    }
}
class c1 extends p1 {
    void display(){
        System.out.println("How are you");
    }
    public static void main(String args[]){
       c1 c = new c1();
       c.show();
       c.display();
    }
}