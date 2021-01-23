package srcException;


public class re_Throwing {
    public static void main(String[] args) {
        try{
            method();
        }catch(Exception e){
            System.out.println("main에서 예외가 처리 되었습니다.");
        }

    }
    static void method() throws Exception{
        try{
            throw new Exception();

        }catch(Exception e){
            System.out.println("method 에서 예외가 처리 되었습니다.");
            throw e;
        }
    }
}
