package anno;

public class PrivateClass {
    public PrivateClass(String name) {
        System.out.println("생성자 생성");
        this.name = name;
    }

    public PrivateClass() {
        System.out.println("생성자 생성");

    }

    public PrivateClass(Integer age) {
        System.out.println("integer 생성자 생성");
        this.age = age;
    }

    private String name ;
    private int age;
    private void printAge(int age){
        System.out.println("제 나이는"+ age);
    }
}
