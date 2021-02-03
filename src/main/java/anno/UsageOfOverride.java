package anno;
// override의 예로
// 표준 어노테이션 종류

class A {
    public void systemOutPrintln(){
        System.out.println("in A");

    }
}
class B extends A{

    public void systemOutPrintLn(){
        System.out.println("in B");

    }
}
public class UsageOfOverride {
    public static void main(String[] args) {
        B obj = new B();
        obj.systemOutPrintln();
    }
}
