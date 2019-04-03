public abstract class Employee {
    Position position;
    Grade grade;

    public Employee() {
    }

    public void performPosition() {
        position.award();
        position.rate();
    }

    public void performGrade() {

    }
}
