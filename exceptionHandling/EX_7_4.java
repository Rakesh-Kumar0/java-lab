import java.io.*;

public class EX_7_4 {

    void show(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote.");
        } else {
            System.out.println("Welcome! You are eligible to vote.");
        }
    }

    public static void main(String args[]) throws IOException {
        System.out.println("Rakesh Kumar");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your age:");
        int age = Integer.parseInt(br.readLine());

        EX_7_4 t1 = new EX_7_4();  
        t1.show(age);
    }
}
