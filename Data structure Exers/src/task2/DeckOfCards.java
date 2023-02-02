package task2;

public class DeckOfCards {
    public enum Cards {
        ACE, TWO, THREE, FOUR, FIVE, SEX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Shapes {
        DIAMOND, HEART, CLUB, SPADE
    }

    private Cards num;
    private Shapes shape;

    public DeckOfCards(Cards num, Shapes shape) {
        this.num = num;
        this.shape = shape;
    }

    public Cards getNum() {
        return num;
    }

    public Shapes getShape() {
        return shape;
    }
}
