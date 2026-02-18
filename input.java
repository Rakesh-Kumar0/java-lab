import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

         System.out.println("My name is "+ name + " and i am  " + age + " years old.");
         sc.close();

    }
}

        


        // System.out.print("Enter your age: ");
        // int age = sc.nextInt(); 
        // System.out.print("Enter your name: ");
        // String name = sc.next(); 
        // System.out.println("My age is "+ age + " years old." + " and my name is " + name);
        
    
    
