package Scope;

public class Outer2 {
    class InstanceInner{
        int iv = 10;
    }
    static class StaticInner{
        int iv = 200;
        static int cv = 300;
    }
    void myMethod(){
        class LocalInner{
            int iv = 400;
        }
    }
}
class example{
    public static void main(String[] args) {
        Outer2 ot = new Outer2();
        Outer2.InstanceInner ii = ot.new InstanceInner();
        //인스턴스 클래스의 인스턴스를 생성하려면
//        Outer2.InstanceInner = new Outer2.InstanceInner();
        System.out.println("ii.iv" + ii.iv);
        //static 변수는 클래스를 생성하지 않고도 접근이 가능함
        System.out.println("Outer.StaticInner.cv: " + Outer2.StaticInner.cv);

        // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다
        Outer2.StaticInner si = new Outer2.StaticInner();
        System.out.println("si.iv"+si.iv);

    }
}
