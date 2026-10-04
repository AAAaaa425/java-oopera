import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director,
                ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    @Override
    public String toString() {
        return "Режиссёр: " + director.getName() + " " + director.getSurname();
    }

    public void printActors() {
        System.out.println("Актёры " + title + ":");

        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в спектакль.");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);

            if (currentActor.getSurname().equalsIgnoreCase(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surname + " заменён на " + newActor + ".");
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден.");
    }
}
