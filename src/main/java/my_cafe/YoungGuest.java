package my_cafe;

public class YoungGuest extends JoinMembership implements Guest{


    private Object Date;

    @Override
    public void JoinDate() {
        System.out.println("멤버쉽 가입일은"+ Date);
    }

    @Override
    public void savePoint() {
        System.out.println("적립되었습니다.");
    }

    @Override
    public void getCoupon() {
        System.out.println("쿠폰이 발행되었습니다.");

    }

    @Override
    public void payBill() {
        System.out.println("학생 할인 되나요?");

    }

    @Override
    public void getBeverage() {
        System.out.println("블로그에 사진 올려도 될까요?");

    }
}
