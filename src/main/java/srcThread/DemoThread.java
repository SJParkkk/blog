package srcThread;

public class DemoThread {
    public static void main(String[] args) {
        ThreadClass th_1 =new ThreadClass();
        th_1.start();
        ThreadRunnable th_2 = new ThreadRunnable();
        // runnable interface 안에는 start()메소드가 구현되어 있지 않다. 그러므로 쓰레드에 추가하려면
        // 다시 Thread 클래스에 인스턴스를 넣어 주어야 한다
        Thread thh = new Thread(th_2);
        thh.start();
    }
}
class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
class ThreadClass extends Thread{
    public void run(){
        for(int i = 0; i <5; i++) {
            System.out.println(getName());
        }
    }
}
