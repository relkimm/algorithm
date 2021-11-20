package greedy.거스름돈;

public enum Coin {
    KR_500(500),
    KR_100(100),
    KR_50(50),
    KR_10(10);

    private int value;

    Coin(int value) { this.value = value; }

    public boolean canChange(int money) {
        return money >= this.value;
    }

    public int giveChange(int money) {
        if(this.canChange(money) == false) {
            throw new IllegalArgumentException("Cannot change money with Coin " + this.value);
        }
        return money - this.value;
    }

    public static Coin getChangeable(int money) {
        if(Coin.KR_500.canChange(money)) {
            return Coin.KR_500;
        }
        if(Coin.KR_100.canChange(money)) {
            return Coin.KR_100;
        }
        if(Coin.KR_50.canChange(money)) {
            return Coin.KR_50;
        }
        return Coin.KR_10;
    }
}
