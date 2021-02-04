package anno;

public @interface MyInfo {
    int age();
    String name();
    String[] hobby();
    TestType testType();// enum을 요소로 가질 수 있다.
//    DateTime testDate();

}
