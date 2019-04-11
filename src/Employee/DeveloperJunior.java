package Employee;

import Position.Developer;
import Grade.Junior;

public class DeveloperJunior extends Employee {

    public DeveloperJunior() {
        position = new Developer();
        grade = new Junior();
    }
    // Метод вычисления зарплаты
    public double getSalary() {
        return position.rate() + (position.award() * grade.bonus());
    }
}
