package Scope;

import java.util.function.Consumer;

/**
 * 인프런 더 자바,8 코드를 가지고 학습하였습니다.
 * 람다식은 final 변수 effective final 변수로만 만들수 있음
 * effective final 변수 중에 값의 변경이 없는 변수를 의미
 */

public class Lambda {
    public static void main(String[] args) {
        int a = 2;
        Runnable runnable = () -> {
//                a++;// inner 클래스에서는 final 로 선언된 변수만 사용이 가능하므로 새로운 값을 할당할 수 없다
            System.out.println("a의 값은" + a);
        };
        runnable.run();

    }
}
