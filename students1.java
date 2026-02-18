public class students1 {
    String collage_name = "ABC";
    int id;
    void show(){
        System.out.println(collage_name + " " + id);
    }
    public static void main(String args[]){
        students1 s1 = new students1();
        s1.id = 101;
        s1.show();
        students1 s2 = new students1();
        s2.collage_name = "DEF";
        s2.id = 102;
        s2.show();
        s1.show();
    }
}   
    

