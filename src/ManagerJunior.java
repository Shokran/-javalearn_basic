public class ManagerJunior extends Employee {
    public ManagerJunior() {
        position = new Manager();
        grade = new Junior();
    }
    public double salary() {
        double bounty = position.award() * grade.bonus();
        double salary = position.rate() + bounty;
        return salary;
    }
}
