package Grade;

public class Senior implements Grade {
    // Название грейда
    public String name(){
        return "Senior";
    }
    // Коэффициент увеличения базовой премии для данного грейда
    public double bonus() {
        return 1.3;
    }
    // Количество подчинённых
    public int slaves() {
        return slaves;
    }

    public int slaves;
    // Конструктор для ввода количества подчинённых
    public void setSlaves(int slaves) {
        this.slaves = slaves;
    }
    // Обработка возможных ошибок с количеством подчиненных
    public Senior(int slaves) {
        if (slaves < 1) {
            // Если раскомментировать, то программа прекратит выполнение в случае если подчиненных меньше 1
            // В этом случае нужно закомментировать строку 25
//            throw new RuntimeException("У Grade.Grade.Senior'а не может быть подчинённых менее одного");
            // Возвращает по умолчанию значение подчиненного 1 если было введено меньше
            slaves = 1;
        }
        this.slaves = slaves;
    }
}

