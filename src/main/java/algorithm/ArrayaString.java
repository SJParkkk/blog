package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayaString {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String collect = Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        String hello = Stream.of("a", "b", "c").collect(Collectors.joining());
        System.out.println(hello);
        System.out.println(collect);
        String[] split = s.split("");

        Arrays.sort(split, Collections.reverseOrder());
        for (String s2:split) {
            System.out.println(s2);
        }
        System.out.println(String.join("", split));

    }
}
