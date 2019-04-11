package Position;

public class Manager implements Position {
    // Базовая ставка зарплаты по умолчанию для этого грейда
    private double rate = 35000;
    // Базовая ставка премии по умолчанию для этого грейда
    private double award = 10000;

    // Метод для изменения ставки зарплаты по умолчанию
    public void setRate(double rate) {
        this.rate = rate;
    }
    // Метод для изменения ставки премии по умолчанию
    public void setAward(int award) {
        this.award = award;
    }

    public double rate() {
        return rate;
    }
    public double award() {
        return award;
    }
}
