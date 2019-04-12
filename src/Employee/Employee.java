package Employee;

import Position.Position;
import Grade.Grade;

public abstract class Employee {
    public Position position;
    public Grade grade;

    public Employee() {
    }

    public void performPosition() {
        position.name();
        position.award();
        position.rate();
    }

    public void performGrade() {
        grade.name();
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
    // Метод вычисления зарплаты
    public double salary() {
        if (position.name().equals("Intern")) {
            return position.rate() + position.award();
        } else {
            switch (grade.name()) {
                case "Senior":
                    // Обработка информации по подчинённым
                    double slavesAdd = 1.05;
                    for (int i = 1; i < grade.slaves(); i++) {
                        slavesAdd += 0.05;
                    }

                    return (position.rate() + (position.award() * grade.bonus())) * slavesAdd;
                case "Middle":
                    return position.rate() + (position.award() * grade.bonus());
                case "Junior":
                    return position.rate() + (position.award() * grade.bonus());
                default:
                    throw new RuntimeException("Других грейдов быть не может");
            }
        }
    }
}
