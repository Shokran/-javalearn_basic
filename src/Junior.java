public class Junior implements Grade {
    // Коэффициент увеличения базовой премии для данного грейда
    public double bonus() {
        return 1.1;
    }
    // Отсутствие подчинённых
    public int slaves() {
        return 0;
    }
}
