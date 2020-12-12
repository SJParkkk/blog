package src_4weeks;

public class ex_003 {
    public static void main(String[] args) {
        String menu = "Americano";
        switch(menu){
            case "Americano":
                System.out.println("4100원 입니다");
                break;
            case "Latte":
                System.out.println("4600원 입니다.");
                break;
            case "Cappuccino":
                System.out.println("4700원 입니다");
                break;
            default:
                System.out.println("죄송하지만, 없는 메뉴입니다!");

        }
    }
}
