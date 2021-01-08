package my_cafe;

public class NewbyGuest extends LoveCaffine implements Guest{
    private Object Date;
    private int age;

    public NewbyGuest(int age){
        this.age = age;
    }

    @Override
    public void payBill() {
        System.out.println("멤버쉽에 가입할 수 있을까요?");
    }

    @Override
    public void getBeverage() {System.out.println("감사합니다.");}

}
