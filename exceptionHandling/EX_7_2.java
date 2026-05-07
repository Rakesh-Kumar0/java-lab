class EX_7_2 {
    public static void main(String args[]){
        System.out.println("Rakesh Kumar");
        System.out.println("1");
        try
        {
        int a=1/0;
        }
        catch(Exception e)
        {
        System.out.println("Handled "+e);
        }
        System.out.println("2");
        System.out.println("3");
        }
}


