public class Student{
    String name;
    int marks;

    void display(){
        System.out.println(name + " " + marks);
    }
}

public class data{
    public static void main(String args[]){

        Student s1 = new Student();

        s1.name = "Rakesh";
        s1.marks = 90;

        s1.display();
    }
} 
    

