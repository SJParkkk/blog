package Enum;

import java.util.ArrayList;

/**
 * 블랙잭 구현하기에서 enum 으로 카드 패턴을 리팩토링 했던 기억이 있어 Card를 생성하는 부분만 구현해 보았다.
 * enum의 개념을 사용해보기 위해 카드에 무늬만 있다고 가정
 * 패턴을 enum으로 생성해보기
 * **/
public class Card {
    private Patterns patterns;

    public Card(Patterns patterns) {
        this.patterns = patterns;
    }

    enum Patterns{
        CLOVER("clover"),
        SPACE("space"),
        HEART("heart"),
        DIAMOND("diamond");
        private String value;
        Patterns(String value) {
            this.value = value;
        }
    }

    public Patterns getPatterns() {
        return patterns;
    }

    public static void main(String[] args) {
        Card card1 = new Card(Card.Patterns.SPACE);
        System.out.println("새로 생성된 카드의 패턴은 :" + card1.getPatterns());
        // 이넘의 모든 값으로 카드 한장씩 생성해보기
//        Patterns arr[] = Patterns.values();
//        ArrayList<Card> cardList = new ArrayList<>();
//        for (Card.Patterns patterns : arr) {
//            cardList.add(new Card(patterns));
//        }

        ArrayList<Card> cardList = new ArrayList<>();
        for(Card.Patterns patterns : Card.Patterns.values()){
            cardList.add(new Card(patterns));
        }
        cardList.forEach(card -> System.out.println(card.getPatterns()));
    }
}
