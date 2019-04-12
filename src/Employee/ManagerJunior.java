package Employee;

import Position.Manager;
import Grade.Junior;

public class ManagerJunior extends Employee {

    public ManagerJunior() {
        position = new Manager();
        grade = new Junior();
    }
}
