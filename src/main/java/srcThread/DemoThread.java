package srcThread;

public class DemoThread {
    public static void main(String[] args) {
        ThreadClass th_1 =new ThreadClass();
        th_1.setPriority(3);// 우선 순위 변경
        System.out.println(th_1.getPriority());
        ThreadRunnable th_2 = new ThreadRunnable();
        Thread thh = new Thread(th_2);
        System.out.println(thh.getPriority());
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
