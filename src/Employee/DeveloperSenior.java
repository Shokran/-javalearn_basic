package Employee;

import Position.Developer;
import Grade.Senior;

public class DeveloperSenior extends Employee {

    public DeveloperSenior(int slaves) {
        position = new Developer();
        grade = new Senior(slaves);
    }
}
