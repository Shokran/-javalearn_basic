public class InternEmployee extends Employee {
    public InternEmployee() {
        position = new Intern();
    }
    // Метод вычисления зарплаты
    public double getSalary() {
        return position.rate() + position.award();
    }
}
