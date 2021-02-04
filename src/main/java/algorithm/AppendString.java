package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppendString {
    public String solution(int n){
        String answer ="";
        for (int i = 0; i < n; i++) {
            answer += i%2 == 0 ? "수":"박";
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        AppendString cl = new AppendString();
        System.out.println(cl.solution(n));
    }
}
