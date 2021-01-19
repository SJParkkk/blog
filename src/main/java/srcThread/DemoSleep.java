package srcThread;

public class DemoSleep {
    public static void main(String[] args) {
        Thread_1 thread_1 = new Thread_1();
        Thread_2 thread_2 = new Thread_2();
        thread_1.start();
        thread_2.start();
        try{
            System.out.println("sleep시작");
            thread_1.sleep(50);//thread_1을 sleep하는 것이 아니라 현재 실행중인 thread를 종료 시킨다.
        }catch(InterruptedException ie){

        }
        System.out.println("<main종료>");
    }
}
class Thread_1 extends Thread{
    public void run(){
        for (int i = 0; i <100; i++) {
            System.out.println("*");
        }
        System.out.println("<thread1종료>");
    }
}
class Thread_2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("&");
        }
        System.out.println("<thread2종료>");
    }
}