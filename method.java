class method {
    static void show(){
        System.out.println("This is static function ");
    }
    void display(){
        System.out.println("This is Non static function ");
    }
    public static void main(String args[]){
        method m1 = new method();
        m1.show();
        m1.display();
        
    }
    
}