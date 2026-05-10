//Here, thread is not start, it is executed normally
class Ex_9_1 extends Thread{
    public void run(){
        System.out.println("Thread is Running...");
        }
    public static void main(String args[]){
        System.out.println("Rakesh Kumar");
        Ex_9_1 s=new Ex_9_1();
        s.run();
    }
}
