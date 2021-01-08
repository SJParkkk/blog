package my_cafe;

public abstract class RegularGuest extends JoinMembership implements Guest{
    public Object Date;
    @Override
    public void payBill() {
        System.out.println("좋은하루 보내세요");
    }

    @Override
    public void getBeverage() {
        System.out.println("내일 또 뵈요");
    }

    @Override
    public void JoinDate() {
        System.out.println("가입일은 오늘 날짜 입니다.");
        System.out.println(Date);
    }
}
