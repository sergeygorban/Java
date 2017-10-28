package inheritance_10;

/**
 * Created by CC on 05.06.2017.
 */
public class Canine extends Animal {

    public Canine() {
        System.out.println("Constructor from Canine");
    }



    @Override
    public String roam() {
        String a = "Method from class Canine";
        return a;
    }
}
