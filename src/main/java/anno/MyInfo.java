package anno;

/**
 * 어노테이션
 * 추상 메서드 abstract 반환 타입만 있는 default 설정 가능**/
public @interface MyInfo {
    int age();// 원시 타입 데이터
    String name();// 참조 타입 데이터
    String[] hobby();
    TestType testType();// enum 타입데이터
//    DateTime testDate();

}
