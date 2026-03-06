public class handling {
   public static void main(String args[]){
        try{
            int a = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");
        }
    }
}

