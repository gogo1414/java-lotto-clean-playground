package domain.lotto;

public class Lotto {
    private static final int PRICE_UNIT = 1000;
    private static final int MINIMUM_PRICE = 999;
    private final int lottoMoney;

    public Lotto(String lottoMoney) {
        int money = Integer.parseInt(lottoMoney);
        validate(money);
        this.lottoMoney = money;
    }

    public int getLottoMoney() {
        return this.lottoMoney;
    }

    public void validate(int lottoMoney) {
        validateRage(lottoMoney);
        validateUnit(lottoMoney);
    }

    public void validateRage(int lottoMoney) {
        if(lottoMoney <= MINIMUM_PRICE)
            throw new IllegalArgumentException("천원 미만의 돈을 입력받을 수 없습니다.");
    }

    public void validateUnit(int lottoMoney) {
        if(lottoMoney % PRICE_UNIT != 0)
            throw new IllegalArgumentException("돈은 천원 단위로만 입력 가능합니다.");
    }
}
