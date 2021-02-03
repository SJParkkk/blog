package anno;
// 왜 어노테이션을 사용하는지
// override의 예로
// 어노테이션 종류
// 커스터 마이즈 어노테이션
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
