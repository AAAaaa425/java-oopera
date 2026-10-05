import people.*;
import shows.*;

import java.util.ArrayList;
public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Алексей", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Петрова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Дмитрий", "Сидоров", Gender.MALE, 165);

        Director director1 = new Director("Иван", "Смирнов", Gender.MALE, 15);
        Director director2 = new Director("Анна", "Кузнецова", Gender.FEMALE, 8);

        Person musicAuthor = new Person("Петр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Чай", "Петровский", Gender.MALE);

        ArrayList<Actor> actorsForShow = new ArrayList<>();

        Show ordinaryShow = new Show("Спектакля", 120, director1, new ArrayList<>());

        Opera opera = new Opera("Оперы", 150, director2, new ArrayList<>(), musicAuthor, "Текст либретто оперы", 40);

        Ballet ballet = new Ballet("Балета", 130, director1, new ArrayList<>(), musicAuthor, "Текст либретто балета", choreographer);

        ordinaryShow.addActor(actor1);
        ordinaryShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        ordinaryShow.printActors();

        opera.printActors();

        ballet.printActors();

        ballet.replaceActor("Иванов", actor2);

        ballet.printActors();

        opera.replaceActor("Ермаков", actor1);

        opera.printLibretto();

        ballet.printLibretto();
    }
}
