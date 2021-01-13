package srcException;

import java.lang.management.MemoryType;

public class CustomizeException {

    class MyRuntimeException extends RuntimeException{
        // Exception 클래스를 안쓰는 이유: try -catch 문을 빼서 코드의 복잡성을 낮추기 위함
        MyRuntimeException(String msg){
            super(msg); // 조상인 RuntimeException 클래스의 생성자를 호출한다.
        }
    }
    class MyException extends Exception{
        public MyException(String message) {
            super(message);
        }
    }
}
