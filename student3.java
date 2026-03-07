class Student3 {
    int id;
    String name;
    static String college = "ABC College";

    Student3(int i, String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String args[]){
        Student3 s1 = new Student3(1,"Rakesh");
        Student3 s2 = new Student3(2,"Rahul");

        s1.display();
        s2.display();
    }
}