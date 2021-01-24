package Scope;

public class ClassAndInstanceVariable {
    public static void main(String[] args) {
        // 클래스 변수는 인스턴스를 생성 안하고도 출력할 수 있음 : static 이므로 stack 에 올라가 있음
        System.out.println(DemoClass.height);
        System.out.println(DemoClass.width);

        DemoClass card1 = new DemoClass();
        card1.kind = "Heart";
        card1.number = 13;

        DemoClass card2 = new DemoClass();
        card2.kind = "Spade";
        card2.number = 15;

        System.out.println(card1.kind +"숫자는" + card1.number);
        System.out.println(card2.kind + "숫자는" + card2.number);

        //클래스 변수의 값을 변형하면 모든 인스턴스의 값도 변경됨!
        //그러므로 card1, card2와 같은 인스턴스 변수로  클래스 변수를 바꾸는 것 보단
        //클래스명으로 바꿔 주는 것이 좀 더 명시적이다.
//        card1.height = 70;
//        card1.width = 50;
        DemoClass.height = 70;
        DemoClass.width = 50;

        System.out.println(card1.height +"넓이는" + card1.width);
        System.out.println(card2.height +"넓이는" + card2.width);


    }
}
