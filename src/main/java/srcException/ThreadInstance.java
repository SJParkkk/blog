package srcException;

public class ThreadInstance {
    public static void main(String[] args) {
        ThreadClass th_1 = new ThreadClass();
        Runnable r = new ThreadRunnable();
        Thread th_2 = new Thread(r);
        th_1.start();
        th_2.start();
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
