//Concept of Multithreading
class Ex_9_4 extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        System.out.println("Rakesh Kumar");
        Ex_9_4 s1=new Ex_9_4();
        Ex_9_4 s2=new Ex_9_4();
        s1.start();
        s2.start();
        //s.start(); This will give exception
    }
}
