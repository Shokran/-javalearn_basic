public class DeveloperMiddle extends Employee {

    public DeveloperMiddle() {
        position = new Developer();
        grade = new Middle();
    }
    // Метод вычисления зарплаты
    public double getSalary() {
        return position.rate() + (position.award() * grade.bonus());
    }
}
