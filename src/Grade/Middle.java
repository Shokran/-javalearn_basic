package Grade;

public class Middle implements Grade {
    // Название грейда
    public String name() {
        return "Middle";
    }
    // Коэффициент увеличения базовой премии для данного грейда
    public double bonus() {
        return 1.2;
    }
    // Отсутствие подчинённых
    public int slaves() {
        return 0;
    }
}
