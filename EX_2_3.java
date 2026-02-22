public class EX_2_3 {
    String College_name ="UPES" ; 
    String name;   //non-static variable 
    int sap;

    void show(){
        System.out.println("Name: " + name + "sap: " + sap + "\nUniversity name: " + College_name);
    }

    public static void main( String[] args ) {
        EX_2_3 S1 = new EX_2_3();   //new -> keyword for creating an object, Classname()->constructor
        S1.name = "Rakesh Kumar\n";
        S1.sap = 590013590;
        S1.show();
    }
}
