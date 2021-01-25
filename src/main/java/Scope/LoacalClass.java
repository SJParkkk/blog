package Scope;

public class LoacalClass {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner{
        // 외부클래스의 private 멤버도 접근 가능
        int liv = outerIv;
        int liv2 = outerCv;
    }
    void myMethod(){
        int iv = 0;
        final int LV = 0;

        class LocalInner{
            int liv = outerIv;
            int liv2 = outerCv;
            // final 변수가 붙은 것만 접근 가능한데
            // 자바 8부터 자동으로 final변수를 붙여준다 그래서 값을 늘리려고 하면 에러가 난다.
            int liv3 = iv ;
            int liv4 = LV;
        }


    }
}
