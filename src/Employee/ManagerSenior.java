package Employee;

import Position.Manager;
import Grade.Senior;

public class ManagerSenior extends Employee {

    public ManagerSenior(int slaves) {
        position = new Manager();
        grade = new Senior(slaves);
    }

    // Метод вычисления зарплаты
    public double getSalary() {
        // Обработка информации по подчинённым
        double slavesAdd = 1.05;
        for (int i = 1; i < grade.slaves(); i++) {
            slavesAdd += 0.05;
        }

        return (position.rate() + (position.award() * grade.bonus())) * slavesAdd;
    }
}
