package annotaion;

public class DemoFunctionClass implements DemoFunctional{
    @Override
    public int printAge(int age) {
        return 0;
    }

    @Override
    public void testMessage() {


    }

    public static void main(String[] args) {
        DemoFunctional test = age -> age + 10;
        System.out.println(test.printAge(5));
    }
}
