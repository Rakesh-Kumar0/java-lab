import java.util.Scanner;

public class EX_3_1 {
    public static void main(String[] args){

        System.out.println("Rakesh Kumar");

        Scanner sc = new Scanner(System.in);

        int age;
        String name;

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();   // to clear the buffer

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.println("hello " + name + " you are " + age + " years old");

        sc.close();
    }
}

