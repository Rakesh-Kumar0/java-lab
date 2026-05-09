public class EX_7_3 {
    public static void main(String args[]) {
        System.out.println("Rakesh Kumar");
        System.out.println("1");

        try {
        String s = null;
        System.out.println(s.length());
        }
        finally {
        System.out.println("The finally block will always be executed.");
        }
    }
}
