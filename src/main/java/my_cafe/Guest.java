package my_cafe;

public interface Guest{
// public abstract 부분 생략 가능
    void payBill();
    void getBeverage();
    default void openDoors(){
        System.out.println("문을 열고 들어옵니다.");
    }
    static void closeDoors(){
        System.out.println("문을 닫고 나갑니다.");
    }

}
