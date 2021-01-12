package srcException;

public class MultiCatch {
    static class ExceptionA {// 부모 클래스 예외
        String messageA;
        public ExceptionA(String message) {
            this.messageA = message;
        }
    }

    static class ExceptionB extends ExceptionA {// 자식 클래스 예외
        String messageB;
        public ExceptionB(String message, String messageB) {
            super(message);
            this.messageB = messageB;
        }
    }
    public static void main(String[] args) {

        try {

        }catch(ArithmeticException ae){
            
//        catch (ExceptionB | ExceptionA e) {
//        부모 클래스만 써주는 것 과 같으므로 불필요한 코드는 제거하라는 의미에서 오류 발생

        }
    }
}