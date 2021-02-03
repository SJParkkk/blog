package anno;

import java.util.Date;

public class DemoDeprecated {
    @Deprecated
    int printTemperature(int degree){
     return degree;
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.getDate();
        DemoDeprecated demo = new DemoDeprecated();
        int todayDegree = demo.printTemperature(-6);
        System.out.println(todayDegree);
    }
}
