package exceptions_25;

/**
 * Created by CC on 26.06.2017.
 */
public class OwnExceptions extends RuntimeException {

    public OwnExceptions() {

    }

    public OwnExceptions(String message) {
        super(message);
    }

    public static void main(String[] args) {

        int a = 1;

        if (a == 1) {
            throw new OwnExceptions("!!!!!!!!!!!!!!!!!!!!");
        }
    }
}


