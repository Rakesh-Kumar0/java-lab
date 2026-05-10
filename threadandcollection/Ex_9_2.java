//Here, thread is started
//Starting a thred by extending the Thread class
class Ex_9_2 extends Thread{
    public void run(){
    System.out.println("Thread is Running...");
    }
    public static void main(String args[]){
        System.out.println("Rakesh Kumar");
    Ex_9_2 s=new Ex_9_2();
    s.start();
    //s.start();// This will give exception
    }
}

