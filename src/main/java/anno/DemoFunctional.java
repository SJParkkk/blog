package anno;
/**
 * 람다식에서도 봤듯이 FunctionalInterface는 추상 메소드가 하나만 존재하는 인터페이스를 의미함
 * 1. implement interface 해서 메소드 테스트 해보기
 * 2. functional interface 를 활용한 람다식 다시 구현 (익명 클래스)**/

public interface DemoFunctional {
    int printAge(int age);
    default void testMessage(){
        System.out.println("디폴트 메서드 입니다. 수정할 수 있습니까?");
    }
    static void testStaticMessage(){
        System.out.println("스태틱 메서드 입니다. 수정할 수 있습니까?");
    }


}
