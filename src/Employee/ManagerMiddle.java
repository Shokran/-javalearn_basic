package Employee;

import Position.Manager;
import Grade.Middle;

public class ManagerMiddle extends Employee {

    public ManagerMiddle() {
        position = new Manager();
        grade = new Middle();
    }
}
