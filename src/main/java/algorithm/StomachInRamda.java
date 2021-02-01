package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1.람다식으로 풀어보기/ Merge
/**
 default V merge(K key, V value, BiFunction<T,U, R>) {
 K key가 없으면 V 있으면 있는값 (연산자) 들어온 값
 * **/
public class StomachInRamda {
    public static int solutionInMerge(String[][] str){
        Map<String, Integer> category = new HashMap<>();
        for (String[] s : str){
            category.merge(s[1], 1 , (a,b)->a+b);
        }
        int answer = 1;
        for(Integer i : category.values()){
            answer *= i;
        }
        return answer - 1;

    }

    public static void main(String[] args) {
        String[][] clothes ={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solutionInMerge(clothes));
    }

}
