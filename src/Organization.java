/**
 * Спроектировать иерархию органиазации с помощью классов и наследования.
 * <p>
 * В организации работают Manager'ы и Developer'ы и Intern'ы.
 * Как для менеджеров так и для разработчиков  существует 3 грэйда junior, middle, senior(у Intern нет).
 * Каждый грэйд увеличивает базовую ставку премии на 10% (не более 30%)
 * <p>
 * Зп senior рассчитывается исходя из зп + 5% за каждого стажера.
 * При расчёте нужно учитывать, что senior специалисты должны иметь хотя бы 1го стажера.
 */

public class Organization {

    public static void main(String[] args) {
        Employee managerJunior = new ManagerJunior();
        System.out.println(managerJunior);

//        Employee developerSenior = new DeveloperSenior();

    }
}
