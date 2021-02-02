package calculator;

import java.util.function.BiFunction;

public class Calculator {
//    staic add(BiFunction<Integer, Integer, Integer> function){
//        return
//    }
    BiFunction<Integer,Integer,Integer> sum = (integer, integer2) -> integer + integer2;
    private final BiFunction<Integer, Integer, Integer> multi = ((integer, integer2) -> integer*integer2);

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sum = (a,b)->a+b;
        BiFunction<Integer,Integer,Integer> minus = (a,b)->a-b;
        BiFunction<Integer,Integer,Integer> multi = (a,b)-> a*b;
        BiFunction<Integer,Integer,Integer> div = (a,b) ->a/b;
        Calculator cal = new Calculator();
        System.out.println(cal.sum.apply(5,6));
        Integer apply = sum.apply(1, 2);
        System.out.println("apply = " + apply);
    }

}
