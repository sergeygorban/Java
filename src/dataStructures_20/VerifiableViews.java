package dataStructures_20;

/* Проверяемые представления предназначены для поддержки отладки ошибок, сопутствующих применению обобщенных типов в прикладном коде. Как пояснялось
в главе 8, существует возможность незаконно внедрить в обобщенную коллекцию элементы неверного типа.

ListMy<String> safeStrings =
Collections.checkedList(strings, String.class);
Затем в методе представления add () проверяется принадлежность объекта, вводимого в коллекцию, заданному классу.
 И если обнаружится несоответствие, то немедленно сгенерируется исключение типа ClassCastException,

 */


import java.util.BitSet;
import java.util.Stack;
import java.util.prefs.Preferences;

public class VerifiableViews {

}
