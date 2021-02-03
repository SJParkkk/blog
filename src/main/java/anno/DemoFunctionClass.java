package anno;

/**
 * Test Annotation
 * **/
public class DemoFunctionClass implements DemoFunctional {
    @Override
    public int printAge(int age) {
        return 0;
    }

    @Override
    public void testMessage() {
        System.out.println("디폴트 메서드만 수정이 가능하네요.");
    }


    public static void main(String[] args) {
        DemoFunctional test = age -> age + 10;
        test.testMessage();
        //  구현체의 스태틱 메소드 어떻게 사용하지?
        // interface 자체적으로 접근해야 함
        DemoFunctional.testStaticMessage();
        DemoFunctionClass testClass  = new DemoFunctionClass();
        testClass.testMessage();
        System.out.println(test.printAge(5));
    }
}
