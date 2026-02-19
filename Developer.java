import java.util.Scanner;
interface Client {
    void input();
    void output();
}
class Developer implements Client {
    String name;
    double salary;
}

public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username: ");
    name = sc.nextLine();
    System.out.println("Enter salary: ");
    salary = sc.nextDouble();
}

public void output(){
    System.out.println("Username: " + name);
    System.out.println("salary: " + salary);
}