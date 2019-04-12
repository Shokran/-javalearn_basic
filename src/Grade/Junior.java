package Grade;

public class Junior implements Grade {
    // Название грейда
    public String name() {
        return "Junior";
    }
    // Коэффициент увеличения базовой премии для данного грейда
    public double bonus() {
        return 1.1;
    }
    // Отсутствие подчинённых
    public int slaves() {
        return 0;
    }
}
