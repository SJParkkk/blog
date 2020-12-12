package src_4weeks;

public class ex_002 {
    public static void main(String[] args) {
        int x = 5;
        if(x % 2 == 0){
            System.out.println("x는 짝수입니다.");
        }else if(x % 2 == 1){
            System.out.println("x는 홀수 입니다.");
        }else{// x가 짝수도 아니고, 홀수도 아니라면
            System.out.println("짝수도, 홀수도아닙니다");
        }
    }
}
