package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// 문자열 내의 p와 y의 개수가 같으면 true
// 대소문자를 구별하지 않음
// 람다식: .chars() , 원시 타입 char 는 ''로 비교해야 함.

public class ConuntPAndY {
    public static void main(String[] args) {
        String str = "Pyy";
        System.out.println("람다식 풀이 :" + solution(str));
        String upperCase = str.toUpperCase(Locale.ROOT);
        String[] sList = upperCase.split("");

        int pCase= 0;
        int yCase = 0;
        for (String s : sList) {
            System.out.println(s);
            if(s.equals("P")){
                pCase +=1;
            }else if(s.equals("Y")){
                yCase +=1;
            }
        }
        System.out.println(pCase);
        System.out.println(yCase);
    }
    public static boolean solution(String s){
        s = s.toUpperCase(Locale.ROOT);
        return s.chars().filter(s1 -> s1 == 'P').count() == s.chars().filter(s2 ->'Y'==s2).count();
    }
}

