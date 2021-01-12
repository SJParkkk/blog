package srcException;

public class ThrowException {
    public static void main(String[] args) {
        try{
            Exception a = new Exception("오류 발생");
            throw a;
//            throw new Exception ("오류 발생");
        }catch(Exception a){
            System.out.println("에러 메세지 " + a.getMessage());
//            a.printStackTrace();
        }
        System.out.println("--------------The End----------------");
    }
}
