package srcException;

public class CustomizeExceptionDemo {
    public static void main(String[] args) {
        try{
            install();
        }catch(InstallException ie){
            ie.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void install() throws InstallException{
        try{
            payMoney();
        }catch(LeakMoney LM){
            InstallException ie = new InstallException("결제 중 예외 발생");
            ie.initCause(LM);
            throw ie;

        }catch(LeakPoint LP){
            InstallException ie = new InstallException("결제 중 예외 발생");
            ie.initCause(LP);
            throw ie;
        }
    }

    public static void payMoney() throws LeakMoney, LeakPoint {
        if (!enoughMoney()) {
            throw new LeakMoney("잔액이 부족합니다.");
        }
        if (!enoughPoint()) {
            throw new LeakMoney("포인트가 부족합니다.");
        }

    }

    private static boolean enoughPoint() {
        return true;
    }
    static class InstallException extends Exception{
        public InstallException(String message) {
            super(message);
        }
    }

    private static boolean enoughMoney() {
        return false;
    }

    class LeakPoint extends Exception{
        public LeakPoint(String message) {
            super(message);
        }
    }
    static class LeakMoney extends Exception{
        public LeakMoney(String message) {
            super(message);
        }
    }

}
