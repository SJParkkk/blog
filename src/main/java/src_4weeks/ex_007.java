package src_4weeks;

public class ex_007 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int i: arr){
            if(i == 1){//i가 1일 경우
                System.out.println("1은 출력하지 않습니다!");
                continue;// 아래의 코드는 실행하지 않고 다음 인자로 넘어갑니다
            }
            System.out.println(i);// 출력값: 1은 출력하지 않습니다!,2,3,4,5,6
        }
    }
}
