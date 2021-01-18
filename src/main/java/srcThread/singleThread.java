package srcThread;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class singleThread {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("입력한 값은: " + input);
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try{
                sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
