package generics_11;


/* ѕеременную с обобщенным типом нельз€ использовать в блоке catch
   ѕеременные типа можно использовать в определени€х исключений.

 ак гласит основополагающий принцип обработки исключений в Java, дл€ всех
провер€емых исключений должны быть предоставлены обработчики. Ќо это ограничение можно
преодолеть, использу€ обобщени€. » главным средством дл€ достижени€ этой цели служит следующий метод:

@SuppressWarnings("unchecked")
public static <T extends Throwable> void throwAs(Throwable e) throws T
{
throw (T) e;
}
*/

public class GenerAndExcep {

    public <T extends Throwable> void doT(T t) throws T {

    }
}
