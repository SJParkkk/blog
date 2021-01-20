package srcThread;

public class DemoDaemon {
    public static void main(String[] args) {
        DaemonThread dth_1 = new DaemonThread("dth_1");
        dth_1.setDaemon(true);
        dth_1.start();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException ie){

        }
        System.out.println("메인쓰레드 종료");
    }
}
class DaemonThread extends Thread{
    public DaemonThread(String name) {
        super(name);
    }
    public void run(){
        while (true){//1초마다 메세지를 출력하는 메소드 루프로 돌아서 계속 반복해야 함
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){

            }
            System.out.println("DaemonThread종료");
        }
//        if(Thread.currentThread().isDaemon()){
//
//            System.out.println(getName()+"is Daemon thread");
//
//        }else {
//            System.out.println(getName() + "is User thread");
//        }


    }

}
