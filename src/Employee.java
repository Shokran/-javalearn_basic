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
        grade.bonus();
        grade.slaves();
    }
    // Метод для изменения занимаемой должности
    public void setPosition(Position newPosition) {
        position = newPosition;
    }
    // Метод для изменения полученного грейда
    public void setGrade(Grade newGrade) {
        grade = newGrade;
    }
}
