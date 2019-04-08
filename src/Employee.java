public abstract class Employee {
    Position position;
    Grade grade;
    Subordinates subordinates;

    public Employee() {
    }

    public void performPosition() {
        position.award();
        position.rate();
    }

    public void performGrade() {
        grade.bonus();
    }

    public void performSubordinates() {
        subordinates.slaves();
    }

    public void setSubordinates(Subordinates sb) {
        subordinates = sb;
    }
}
