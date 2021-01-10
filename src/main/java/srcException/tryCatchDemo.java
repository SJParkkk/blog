package srcException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    정의 : 프로그램 실행시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
    목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행 상태를 유지하는 것
    형태
    try{
        // 예외가 발생할 가능성이 있는 문장들을 넣는다.
        // 예외가 발생하면, 발생한 예외의 해당하는 클래스의 인스턴스가 생성 -> catch블럭을 돌면서 true인 catch 블럭을 실행
    }catch(Exception1 e1){
        //Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 넣는다.
    }

    **괄호를 생략할 수 없음
*/
public class tryCatchDemo {
    public static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        List<Person> memberList = new ArrayList<>();
        memberList.add(new Person("박소정", 26));
        memberList.add(new Person("김재준", 26));
        memberList.add(new Person("박재선", 28));
        memberList.add(new Person("박재훈", 30));

        List<Integer> ageList = memberList.stream().map(Person::getAge)
                .filter(s -> s.equals(26)).collect(Collectors.toList());

        try{
            System.out.println(0/0);// ArithmeticException 오류 발생

            for (int i = 0; i < ageList.size() + 1; i++) {
                System.out.println(ageList.get(i));
            }// 실행 되지 않음, IndexOutOfBoundException 오류 발생

            System.out.println(4);// 실행 되지 않음


        }catch(IndexOutOfBoundsException IE){
            System.out.println("배열이 범위를 벗어 납니다.");
        }catch(ArithmeticException AE){
//            하나의 오류가 실행되면 두 번째 오류는 실행되지 않음
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("----------------THE END-----------------------");
    }

}

