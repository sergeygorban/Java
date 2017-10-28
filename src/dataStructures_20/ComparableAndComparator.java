package dataStructures_20;


/* Когда в списках необходимо отсортировать объекты, то необходимо
реализовать интерфейс Comparable или же создать метод compare из
интерфейса Comparator

Свойства compareTo:
    1. Любое отрицательное число означает, что объект, переданный в качестве
    аргумента, больше объекта, из которого вызывался метод.
    2. Возвращая положительное число, вы подразумеваете, что экземпляр,
    из которого вызывался compareTo(), больше переданного ему аргумента.
    3. Ноль означает, что объекты равны (по крайней мере с точки зрения
    сортировки).

sort() свойства:
    1. Вызов метода sort(List о) с одним аргументом означает, что порядок
    определяют методы compareTo() каждого элемента. По этой причине элементы
    списка должны реализовывать интерфейс Comparable.
    2. Вызов sort(List о, Comparator с) означает, что методы compareTo(),
    принадлежащие элементам списка, не будут вызываться. Вместо этого будет
    задействован метод compare() из Comparator. В таком случае элементы
    списка не должны реализовывать интерфейс Comparable.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ComparableAndComparator {



    public static void main(String[] args) {

        ArrayList<ListObg> listObj = new ArrayList<ListObg>();
        listObj.add(new ListObg("Asd",24));
        listObj.add(new ListObg("Dfg",35));
        listObj.add(new ListObg("Rty",100));

        //Без сортировки
        System.out.println(listObj);

        /* Метод sort() принимает Comparable */
        Collections.sort(listObj);
        System.out.println(listObj);

        // Метод sort() принимает Comparator */
        Collections.sort(listObj, new ComparatorMy());
        System.out.println(listObj);

        Collections.sort(listObj);
        System.out.println(listObj);

    }
}
