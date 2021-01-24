package Scope;
/*자바의 정석 : 클래스 변수와 인스턴스 변수 예제
* 인스턴스 변수는 인스턴스가 생성될 때 마다 생성
* 클래스 별로 다른 값을 유지할 수 있음
* 클래스 변수는 인스턴스가 하나의 저장 공간을 공유하므로, 항상 공통된 값을 유지함*/
public class DemoClass {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}
