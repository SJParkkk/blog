package srcThread;
/*
* join() 현재 실행하고 있는 쓰레드가 다른 쓰레드가 종료될 때까지 기다려주는 method
* Exception은 Interrupt()와 같은 InterruptedException이 됨
* 아래 코드에서 join()이 있고 없고에 따라 main 쓰레드의 종료 시점이 변하게 됨
*/
public class DemoJoin {
    public static void main(String[] args) {
        Thread_01 th_01 = new Thread_01();
        Thread_02 th_02 = new Thread_02();
        th_01.start();
        th_02.start();
//        try{
//            th_01.join();
//            th_02.join();
//        }catch (InterruptedException e){
//
//        }
        System.out.println("<Main종료>");
    }
}
class Thread_01 extends Thread{
    public void run(){
        for (int i = 0; i < 300; i++) {
            System.out.println(new String("-"));
        }
    }
}
class Thread_02 extends Thread{
    public void run(){
        for (int i = 0; i < 300; i++) {
            System.out.println(new String("|"));
        }
    }
}
