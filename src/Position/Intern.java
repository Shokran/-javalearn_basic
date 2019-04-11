package Position;

public class Intern implements Position {
    // Базовая ставка зарплаты по умолчанию
    private double rate = 25000;
    // Базовая ставка премии по умолчанию
    private double award = 5000;

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
