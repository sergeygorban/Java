package abstractClasses_12;

public class Wolf extends Canine {


    public void jump() {
        System.out.println("Method from class Wolf");
    }

    public static void main(String[] args) {

        Wolf wolf = new Wolf();
        wolf.jump();
    }
}


