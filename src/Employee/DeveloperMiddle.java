package Employee;

import Position.Developer;
import Grade.Middle;

public class DeveloperMiddle extends Employee {

    public DeveloperMiddle() {
        position = new Developer();
        grade = new Middle();
    }
}
