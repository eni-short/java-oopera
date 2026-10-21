import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        // Добавляем актеров, режиссеров, автора музыки и хореографа
        Person person1 = new Person("Константин", "Хабенский", Gender.MALE);
        Actor actor1 = new Actor(person1, 174);

        Person person2 = new Person("Евгений", "Миронов", Gender.MALE);
        Actor actor2 = new Actor(person2, 192);

        Person person3 = new Person("Елизавета", "Боярская", Gender.FEMALE);
        Actor actor3 = new Actor(person3, 167);

        Person person4 = new Person("Янош", "Сас", Gender.MALE);
        Director director1 = new Director(person4, 165);

        Person person5 = new Person("Юрий", "Любимов", Gender.MALE);
        Director director2 = new Director(person5, 50);

        Person person6 = new Person("Пётр", "Чайковский", Gender.MALE);

        Person person7 = new Person("Лев", "Иванов", Gender.MALE);

        // Добавляем спектакль, оперу и балет
        ArrayList<Actor> listOfActors1 = new ArrayList<>();
        Show show1 = new Show("Гамлет", 240, director1, listOfActors1);
        show1.addNewActor(actor1);
        show1.addNewActor(actor2);

        ArrayList<Actor> listOfActors2 = new ArrayList<>();
        Show show2 = new Show("Пиковая дама", 220, director2, listOfActors2);
        String librettoText1 =
				"""
						Германн, бедный офицер, одержим тайной трёх карт, которую знает старая графиня.
						Он любит Лизу, но ради выигрыша проникает в дом графини и пугает её до смерти.
						Графиня раскрывает секрет: тройка, семёрка, туз.
						На игре вместо туза приходит пиковая дама; Германн сходит с ума, Лиза погибает.""";
        MusicalShow musicalShow1 = new MusicalShow(show2, person6, librettoText1);
        Opera opera1 = new Opera(musicalShow1, 100);
        opera1.addNewActor(actor2);
        opera1.addNewActor(actor3);

        ArrayList<Actor> listOfActors3 = new ArrayList<>();
        Show show3 = new Show("Щелкунчик", 135, director1,  listOfActors3);

        String librettoText2 =
				"""
						В рождественскую ночь Мари получает в подарок Щелкунчика.
						Ночью игрушки оживают, Щелкунчик сражается с Мышиным королём,
						а Мари спасает его.
						Щелкунчик превращается в принца и уводит Мари в королевство сладостей,
						где Фея Драже и жители празднуют победу.""";
        MusicalShow musicalShow2 = new MusicalShow(show3, person6, librettoText2);
        Ballet ballet1 = new Ballet(musicalShow2, person7);
        ballet1.addNewActor(actor1);
        ballet1.addNewActor(actor3);

        // Выводим список актеров всех спектаклей
        System.out.println("Актеры простого спектакля:");
        show1.printListOfActors();
        System.out.println();

        System.out.println("Актеры оперы:");
        opera1.printListOfActors();
        System.out.println();

        System.out.println("Актеры балета:");
        ballet1.printListOfActors();
        System.out.println();

        // Заменяем актеров и делаем повторный вывод
        System.out.println("Актеры балета после замены:");
        ballet1.switchActor(actor1, actor2);
        ballet1.printListOfActors();
        System.out.println();

        // Заменяем актера на несуществующего
        System.out.println("Замена " + actor1 + " на " + actor3);
        opera1.switchActor(actor1, actor3);
        System.out.println();

        // Выводим либретто
        System.out.println("Либретто балета:");
        System.out.println(ballet1.getLibrettoText());
        System.out.println();

        System.out.println("Либретто оперы:");
        System.out.println(opera1.getLibrettoText());
        System.out.println();

    }
}
