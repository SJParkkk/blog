package Scope;
/*자바의 정석 : 클래스 변수와 인스턴스 변수 예제
* 인스턴스 변수는 인스턴스가 생성될 때 마다 생성
* 클래스 별로 다른 값을 유지할 수 있음
* 클래스 변수는 인스턴스가 하나의 저장 공간을 공유하므로, 항상 공통된 값을 유지함
* ++ 스태틱 클래스와 인스턴스 클래스의 접근성도 다뤄보고자 함 */
public class DemoClass {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;

    class InstanceInner{};
    static class StaticInner{};

    InstanceInner iv = new InstanceInner();
    StaticInner ic = new StaticInner();

    static void StaticMethod(){
        // static메서드 안에선 static인스턴스 접근이 불가능하다.
//        InstanceInner iv = new InstanceInner();/
        // 굳이 선언하고 싶으면 outer class를 선언하고 사용해야함
        DemoClass Dc = new DemoClass();
        InstanceInner ic = Dc.new InstanceInner();
        StaticInner si = new StaticInner();
    }
    void instanceMethod(){
        // 인스턴스 메서드에서 전부 접근 가능
        InstanceInner Ic = new InstanceInner();
        StaticInner SI = new StaticInner();
        DemoClass Dc = new DemoClass();
    }

    void myMethod(){
        // 지역변수 내에서 선언된 클래스는 지역 변수 밖에서 생성할 수 없다
        class LocalInner{}
        LocalInner li = new LocalInner();
    }
}
