package Scope;

import org.w3c.dom.ls.LSOutput;

/*이름 없는 클래스
 부모클래스 = new 부모클래스(){
    ** 새로운 메소드나 필드를 선언할 수 있지만
       클래스 밖에서 선언이 불가능함 - 부모클래스의 인스턴스이므로 자식클래스의 메소드나 필드 접근 불가 !
 }
* 사용하는 이유 : 객체를 사용할 때마다 new로 생성하는 것은 비효울적이다*/
public class AnonymousClass {
    public static void main(String[] args) {
        Test t1 = new Test(){
            int number = 1;

            void testMethod(){
                System.out.println("익명 클래스 안에 선언된 메소드");
            }

            @Override
            void whatNumber() {
                super.whatNumber();
                testMethod();// 부모 클래스에 있는 메소드에선 새로 선언한 메소드 부를수 있지만
                System.out.println("제 번호는" + number);
            }
        };
        // 익명클래스에 선언된 메서드와 변수는 익명 클래스 밖에서 사용될 수 없다.
        // t1.number 나 t1.testMethod 접근 불가
        t1.whatNumber();

    }

}
class Test{
    private int number = 1;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    void whatNumber(){
        System.out.println("test");
    };
}
