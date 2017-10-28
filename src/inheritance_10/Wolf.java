package inheritance_10;



public class Wolf extends Canine {

    public String name = "Wolf";


    /*Переопределение метода родительского класса Animal*/
    @Override
    public void makeNoise() {
        System.out.println("Method from class Wolf");
    }

    @Override
    public void eat() {
        System.out.println("Method from class Wolf");
    }

    @Override
    public String getName(Animal animal) {
        return name;
    }

    public static void main(String[] args) {

        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.makeNoise();
        wolf.roam();
        wolf.sleep();


        /* Полиморфизм означает много форм. Все, что расширяет тип
        объявленной ссылочной переменной, может быть ей присвоено. */

        Animal animal = new Wolf();

        /* Вызывается метод из кдасса Canine, так как Wolf не
        содержит такого метода */
        System.out.println(animal.roam() + " Polymorphism");

        /* Вызван метод из Wolf, так как Wolf содеожит такой метод*/
        animal.eat();

        /* Вызван метод из Animal, так как ни Wolf, ни Canine
        такой метод не содержат*/
        animal.sleep();

        /* Если параметр метода объявлен с помощью родительского класса,
        то во время выполнения программы можно передавать объект любого
        дочернего класса*/
        System.out.println(animal.getName(new Wolf()));

        /* При наследовании вызов методов идет по цепочке наследования
        снизу в вверх*/

        /* Прведение типов */
        Animal animal1 = new Animal();
        Wolf wolf1 = new Wolf();
        Wolf wolf2 = new Wolf();


        /* Ошибка при выпполнении программы. Приведение вниз по цепочке
        наследования запрещено */
        //wolf1 = (Wolf) animal1;

        /* Вверх по цепочке разрешено*/
        Animal animal2 = wolf2;

    }
}


