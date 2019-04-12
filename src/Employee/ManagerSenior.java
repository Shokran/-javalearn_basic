package Employee;

import Position.Manager;
import Grade.Senior;

public class ManagerSenior extends Employee {

    public ManagerSenior(int slaves) {
        position = new Manager();
        grade = new Senior(slaves);
    }
}
