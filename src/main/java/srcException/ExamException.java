package srcException;

import java.util.ArrayList;
import java.util.List;

public class ExamException {
    public static void main(String[] args) {
        List<Object> objectNumberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objectNumberList.add(i+10);
            objectNumberList.add(String.valueOf(i));
            objectNumberList.add(i*0.1);
        }
        System.out.println(objectNumberList);
     //todo 오류뜨는거 cast
        //todo 그거 잡아서 맞는 형으로 타입 캐스팅하고 분류해봐 string 형이랑 int형 배열 따로따로 무작위로 들어가있고 순서 모른다고 가정해
        // Object 리스트안의 타입을 분류하시오.
        // 캐스팅오류나서  변환 해줘야함 심지어 double 형까지 있음?
        List<String> StringNumberList =new ArrayList<>();
        List<Integer> intNumberList= new ArrayList<>();
        List<Double> DoubleNumberList = new ArrayList<>();
        for (Object o : objectNumberList) {
            try{
                String s = (String) o;
                StringNumberList.add(s);
            }catch(ClassCastException CE){
                try{
                    Integer k =(Integer)o;
                    intNumberList.add(k);
                }catch (ClassCastException CE2){
                    Double D = (Double) o;
                    DoubleNumberList.add(D);
                }
            }
        }
        System.out.println(StringNumberList);
        System.out.println(intNumberList);
        System.out.println(DoubleNumberList);
    }

}

