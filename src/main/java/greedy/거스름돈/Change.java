package greedy.거스름돈;

public class Change {
    private int money;
    private int coinCount;

    public Change(int money, int coinCount) {
        this.money = money;
        this.coinCount= coinCount;
    }

    public int getMoney() {
        return money;
    }

    public int getCoinCount() {
        return coinCount;
    }
}
