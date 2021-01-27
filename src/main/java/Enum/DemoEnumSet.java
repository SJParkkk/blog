package Enum;
import java.util.EnumSet;

enum Menu2{
    AMERICANO, LATTE, CHOCO, TEA;
}

public class DemoEnumSet {

    public static void main(String[] args) {
        EnumSet<Menu2> set1,set2,set3,set4;
        //adding element
        set1 = EnumSet.of(Menu2.AMERICANO,Menu2.LATTE, Menu2.CHOCO);
        // set1이 가지고 있지 않은 값 출력 enum 클래스 전부를 set에 추가하면 빈 리스트 리턴
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(Menu2.class);
        set4 = EnumSet.range(Menu2.AMERICANO, Menu2.CHOCO);
        System.out.println(set4);
        // removing element
        set4.remove(Menu2.AMERICANO);

        System.out.println(set4);
        System.out.println(set4.contains(Menu2.AMERICANO));
        System.out.println(set2);
    }
}
