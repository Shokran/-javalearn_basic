import Employee.DeveloperSenior;
import Employee.ManagerSenior;
import Employee.ManagerMiddle;
import Employee.InternEmployee;
import Position.Developer;
import Position.Manager;
import Position.Intern;
import Grade.Junior;

/**
 * Спроектировать иерархию органиазации с помощью классов и наследования.
 * <p>
 * В организации работают Position.Manager'ы и Position.Position.Developer'ы и Position.Intern'ы.
 * Как для менеджеров так и для разработчиков  существует 3 грэйда junior, middle, senior(у Position.Intern нет).
 * Каждый грэйд увеличивает базовую ставку премии на 10% (не более 30%)
 * <p>
 * Зп senior рассчитывается исходя из зп + 5% за каждого стажера.
 * При расчёте нужно учитывать, что senior специалисты должны иметь хотя бы 1го стажера.
 */

public class Organization {

    public static void main(String[] args) {
        /*
         Создаём разработчика сеньора Олега с двумя подчинёнными
         ЗП будем выводить после каждого шага
         */
        DeveloperSenior oleg = new DeveloperSenior(2);
        System.out.println("Зарплата Олега по стандартным ставкам с двумя подчинёнными: " + oleg.getSalary());
        /*
         Мы тупанули и поставили манагеру сеньору Диме 0 подчинённых
         Пока логика нам изменит на положенный минимум в 1
         Можем сделать так чтобы программа просто перестала выполняться с ошибкой
         Сделать это можно в блоке обработки ошибок подчинённых в классе Grade.Grade.Senior
         */
        ManagerSenior dima = new ManagerSenior(0);
        System.out.println("Зарплата Димы по стандартным ставкам с автоподстановкой подчинённого: " + dima.getSalary());
        /*
         Решили мы вдруг за заслуги добавить Олегу ЗП, не вопрос
         */
        ((Developer) oleg.position).setRate(50000);
        System.out.println("Зарплата Олега c теми же двумя подчинёнными но с увеличенной зп: " + oleg.getSalary());
        // Давайте Диме тогда немного поднимем премию
        ((Manager) dima.position).setAward(17000);
        System.out.println("Зарплата Димы все также автоисправление на одного подчинённого" +
                " и слегка увеличена ставка премии: " + dima.getSalary());
        /*
         Поработаем с мидлами, рассмотрим какие есть еще фишки
         Им доступны те же самые как и у сеньёров, помимо подчинённых
         А сеньёрам будет доступно то же что провернём здесь
         */
        ManagerMiddle masha = new ManagerMiddle();
        System.out.println("Зарплата мидла манагера Маши: " + masha.getSalary());
        /*
         Но вот незадача Маше хочется чего то изменить в жизни
         Выбрала не самый лёгкий путь, решила податься в разработкчики
         Не беда, мы так умеем
         */
        masha.setPosition(new Developer());
        System.out.println("И вот Маша у нас получает зарплату разраба: " + masha.getSalary());
        /*
         Вот незадача разработчиком то работать сложнее
         Не тянет пока Махыч на мидла, было решено понизить ей грейд
         Но она не унывает, все еще впереди
         */
        masha.setGrade(new Junior());
        System.out.println("И вот Маша получает свою заслуженную джуниорско-разрабческую зп: " + masha.getSalary());
        System.out.println("Всё равно она больше чем у манагера :)");

        /*
         Джуны, собственно, ничем не отличаются, можно также всячески их менять
         */

        /*
         Интерн он и есть интерн с ним ничего не сделаешь, он же Лобанов
         */
        InternEmployee lobanov = new InternEmployee();
        System.out.println("Зарплата Лобанова ни от чего не зависит, голые ставки: " + lobanov.getSalary());
        /*
         Хотя. если сжалиться то можем переопределить базовые ставки зп и премии
         */
        ((Intern) lobanov.position).setRate(26000);
        ((Intern) lobanov.position).setAward(6000);
        System.out.println("Зарплата Лобанова с по-царски поднятыми ставками: " + lobanov.getSalary());
    }
}
