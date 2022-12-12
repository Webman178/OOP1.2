import transport.Car;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджером");
        maxim.greeting();
        Human anya = new Human(1993, "Аня", "Москва", "методистом образовательных программ");
        anya.greeting();
        Human katya = new Human(1992, "Катя", "Килининград", "продакт-менеджером");
        katya.greeting();
        Human artem = new Human(1995, "Артем", "Москва", "директором по развитию бизнеса");
        artem.greeting();
        Human vladimir = new Human(2001, "Владимир", "Казань", null);
        vladimir.greeting();

        System.out.println("---------------------------------------------------------------");

        Car lada = new Car("Lada", "Granta", 1.7, "желтого",
                2015, "России", "автомат",
                "седан", "У745ВК078",5, 1);
        lada.presentation();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.8, "черный",
                2020, "Германии", "механика", "купе", "а432уц078", 3, 1);
        audi.presentation();
        Car bmw = new Car("BMW", "Z8", 3.0, "черный",
                2021, "Германии", "автомат", "седан", "а213вы178", 5, 4);
        bmw.presentation();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                2018, "Южной Корее", "механика", "кроссовер", "в321ук178", 5, 10);
        kia.presentation();
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южной Корее", "автомат", "седан", "р989вы178",5,12);
        hyundai.presentation();

        System.out.println("---------------------------------------------------------------");

        Flower rose = new Flower("Роза", "Голландии", 35.59, 0);
        System.out.println(rose.toString());
        Flower chrysanthemum = new Flower("Хризантема", null, 15, 5);
        System.out.println(chrysanthemum.toString());
        Flower peony = new Flower("Пион", "Англии", 69.9, 1);
        System.out.println(peony.toString());
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);
        System.out.println(gypsophila.toString());



    }
}