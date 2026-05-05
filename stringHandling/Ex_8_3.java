//Comparative Analysis
class Ex_8_3{
    public static void main(String args[]){
        System.out.println("Rakesh Kumar");
        String s1="Welcome";
        String s2="Welcome";
        String s3=new String("Welcome");
        String s4=new String("Welcome");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
