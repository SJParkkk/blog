package srcException;

public class CheckedAndUnChecked {
    public static void main(String[] args) {
//        throw new Exception(); // checked 예외
//        throw new RuntimeException();// unchecked 예외
        try{
            int[] arr = new int[10];
            System.out.println(arr[0]);
        }catch(IndexOutOfBoundsException ie){

        }

        }
    }

