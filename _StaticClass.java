public class _StaticClass {
   static class Inner {
        void show(){
            System.out.println("Static inner class");
        }
    }

    public static void main(String args[]){
        _StaticClass.Inner obj = new _StaticClass.Inner();
        obj.show();
    }
}

