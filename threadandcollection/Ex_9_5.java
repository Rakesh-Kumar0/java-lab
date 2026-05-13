//Implementing Thread using Runnable Interface
class Ex_9_5 implements Runnable{
    public void run(){
        System.out.println("Thread is Running");
    }
    public static void main(String args[]){
        System.out.println("Rakesh Kumar");
        Ex_9_5 s1=new Ex_9_5();
        Thread t1=new Thread(s1);
        t1.start();
    }
}
