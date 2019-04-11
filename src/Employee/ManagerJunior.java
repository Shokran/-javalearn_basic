package Employee;

import Position.Manager;
import Grade.Junior;

public class ManagerJunior extends Employee {

    public ManagerJunior() {
        position = new Manager();
        grade = new Junior();
    }
    // Метод вычисления зарплаты
    public double getSalary() {
        return position.rate() + (position.award() * grade.bonus());
    }
}
