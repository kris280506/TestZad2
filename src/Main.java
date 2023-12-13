public class Main {



    public static void main(String[] args) {
        Fish fish = new Fish();
        Snake snake = new Snake();

        AnimalHouse<Animal> animalHouse = new AnimalHouse<>();
        animalHouse.animal = fish;
        animalHouse.animal = snake;

        AnimalHouse<Fish> fishHouse = new AnimalHouse<Fish>();
        fishHouse.animal = fish;
        AnimalHouse<Snake> snakeHouse = new AnimalHouse<Snake>();
        snakeHouse.animal = snake;


    }
}
