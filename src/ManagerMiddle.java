public class ManagerMiddle extends Employee {

    public ManagerMiddle() {
        position = new Manager();
        grade = new Middle();
    }
    // Метод вычисления зарплаты
    public double getSalary() {
        return position.rate() + (position.award() * grade.bonus());
    }
}
