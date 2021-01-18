package srcThread;

public class DemoThread {
    public static void main(String[] args) {
        ThreadClass th_1 =new ThreadClass();
        th_1.setPriority(3);// 우선 순위 변경
        System.out.println(th_1.getPriority());
        // runnable interface 안에는 start()메소드가 구현되어 있지 않다. 그러므로 쓰레드에 추가하려면
        // 다시 Thread 클래스에 인스턴스를 넣어 주어야 한다
        ThreadRunnable th_2 = new ThreadRunnable();
        Thread thh = new Thread(th_2);
        System.out.println(thh.getPriority());
//      위의 두줄과 동일, Thread thh = new Thread(new ThreadRunnable());
        thh.start();
        th_1.start();

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
