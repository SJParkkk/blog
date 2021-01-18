package srcThread;

import javax.swing.*;

public class multiThread {
    public static void main(String[] args) throws Exception {
        Threadex th_1 = new Threadex();
        th_1.start();

        String input = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("입력받은 값은"+input);
    }
}
class Threadex extends Thread{
    public void run(){
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
            try{
                sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
