package blockInit_26;

/* СТАТИЧЕСКИЙ БЛОК ИНИЦИАЛИЗАЦИИ

Статический блок инициализации запускается
сразу после загрузки класса, перед вызовом любого
статического метода и прежде, чем может быть использована
любая статическая переменная */

public class StaticBlockInit {

    public static final int CONST;

    public StaticBlockInit() {
        System.out.println("Works after static block");
    }

    static {
        System.out.println("static block works first");
        CONST = 123;
    }

    public static void main(String[] args) {

    }
}
