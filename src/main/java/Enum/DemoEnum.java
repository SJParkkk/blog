package Enum;

import java.util.Arrays;

enum Menu {
    AMERICANO(4100), LATTE(4600), CHOCO(5000), TEA(5500);

    private int value;

    Menu(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
/* enum 은 내부적으로 이렇게 바뀐다.
   enum 상수는 객체를 나타낸다
class Menu{
    public static final Menu AMERICANO = new Menu();
    public static final Menu LATTE = new Menu();
    public static final Menu CHOCO = new Menu();
    public static final Menu TEA = new Menu();
}
**/
class Test{
    public static String name;
    public static final Test test = new Test();

}

enum Color{
    Red,Green;
}
public class DemoEnum {
    public static void main(String[] args) {
//        System.out.println("================인스턴스 생성해보기=============");
//        Menu m2 = new Menu();//컴파일 에러 발생

        //사용법
        System.out.println(Menu.AMERICANO);
        System.out.println(Menu.AMERICANO.ordinal());

        //values()메소드 사용해보기
        Menu arr[] = Menu.values();
        for (Menu menu : arr) {
            System.out.println(menu + "index : "+ menu.ordinal());
        }
        System.out.println(Menu.valueOf("AMERICANO"));
        // 객체의 주소값이 출력됨
        System.out.println(Test.test);
        // Menu m1은 이넘안에 Americano상수를 가진 Menu를 생성하라는 의미
        // 새로운 상수로의 생성이 불가능함 즉, 정해진 열거형 상수 내에서 객체를 생성해야함
        Menu m1 = Menu.AMERICANO;

        System.out.println(m1.getValue());
        System.out.println(Menu.LATTE.getValue());

        System.out.println("===========valueof()매소드 활용해보기=================");
        System.out.println(Color.valueOf("Red"));
        System.out.println(Menu.valueOf("AMERICANO"));

    }
}
