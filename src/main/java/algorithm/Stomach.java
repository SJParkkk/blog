package algorithm;

import java.util.*;

// 프로그래머스 코딩테스트 문제
// 해쉬 - 위장
// 해쉬 키에 value 여러개 저장해서 리턴하는 방법 : 기존의 방법은 나중에 넣은 값만 저장
// 키가 있을 때 그냥 value에 1 넣고 , 없던 키는 원래 value 에 +1을 하는 방식으로 짬
public class Stomach {
    public static int solution(String[][] clothes){
     int answer = 1;
        Map<String, Integer> hm= makeMap(clothes);
        for (Integer i: hm.values()){
         answer *= i + 1 ;
        }
     return answer - 1;
    }
    public static void main(String[] args) {
     String[][] clothes ={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Map<String, Integer> myMap = makeMap(clothes);
        int answer = 1;
        for (Integer integer : myMap.values()) {
            System.out.println(integer);
            answer *= integer + 1;
        }
        // 아무것도 장착 안한 경우 제거해야함
        System.out.println(answer - 1);
        System.out.println(solution(clothes));
    }

    private static Map<String, Integer> makeMap(String[][] clothes) {
        Map<String, Integer> myMap = new HashMap<>();
        int value = 1;
        for (String[] clothe : clothes){
            if(myMap.containsKey(clothe[1])){
                int addValue = myMap.get(clothe[1]) + 1;
                myMap.put(clothe[1], addValue);
            }
            myMap.putIfAbsent(clothe[1],value);
        }
        return myMap;
    }
}

