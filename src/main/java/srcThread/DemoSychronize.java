package srcThread;

public class DemoSychronize {
    public static void main(String[] args) {
        Task task = new Task();
        Thread th1 = new Thread(task);
        Thread th2 = new Thread(task);
        th1.setName("thread_1");
        th2.setName("thread_2");
        th1.start();
        th2.start();
    }
}
class Account{
    int balance = 1000;
    public void withdraw(int money){
        if(balance >= money){
            try{
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName() + "출금 금액 ->>"+ money);
                balance -= money;
                System.out.println(thread.getName() + "잔액 ->>" + balance);
            }catch(Exception e){}
        }
    }
}

class Task implements Runnable{
    Account acc = new Account();
    @Override
    public void run() {
        while(acc.balance > 0){
            int money = (int)(Math.random()*3 + 1)*100;
            acc.withdraw(money);
        }

    }
}
