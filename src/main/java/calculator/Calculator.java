package calculator;

import java.util.function.BiFunction;
import java.util.function.Function;
//todo funcitonalInterface로 람다식 구현해보기
public class Calculator {
//    staicadd(BiFunction<Integer, Integer, Integer> function){
//        return
//    }
    private final BiFunction<Integer,Integer,Integer> sum = (integer, integer2) -> integer + integer2;
    private final BiFunction<Integer, Integer, Integer> multi = ((integer, integer2) -> integer*integer2);

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sum = (a,b)->a+b;
        BiFunction<Integer,Integer,Integer> minus = (a,b)->a-b;
        BiFunction<Integer,Integer,Integer> multi = (a,b)-> a*b;
        BiFunction<Integer,Integer,Integer> div = (a,b) ->a/b;
        Integer apply = sum.apply(1, 2);
        System.out.println("apply = " + apply);
    }

}
