class Students {
    String name;
    int id;
    void show(){
        System.out.println("My name is "+ name + "and my id is " +id );
    }
    public static void main(String args[]){
        Students s1 = new Students();
        s1.name = "abc";
        s1.id = 123;
        s1.show();

    }


}