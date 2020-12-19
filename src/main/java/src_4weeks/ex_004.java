package src_4weeks;

public class ex_004 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        String[] arr2 = {"a", "b", "c", "d"};
        for (int i : arr) {
            System.out.println(arr[i]);//출력 0,1,2,3,4,5,6,7
        }
        for (String a : arr2) {
            System.out.println(a);// 출력 a,b,c,d
        }
    }
}
