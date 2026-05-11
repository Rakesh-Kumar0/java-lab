//calling run function normally
class Ex_9_3 extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Ex_9_3 s1=new Ex_9_3();
        Ex_9_3 s2=new Ex_9_3();
        s1.run();
        s2.run();
        //s.start(); This will give exception
    }
}

