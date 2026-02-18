public class student2 {
    static String collage_name = "ABC";
    int id;
    void show(){
        System.out.println(collage_name + " " + id);
    }
    public static void main(String args[]){
        student2 s1 = new student2();
        s1.id = 101;
        s1.show();
        student2 s2 = new student2();
        s2.collage_name = "DEF";
        s2.id = 102;
        s2.show();
        s1.show();
    }
}   