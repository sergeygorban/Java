package dataStructures_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by CC on 22.06.2017.
 */
public class ComparatorMy1 implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        ComparatorMy1 comparatorMy1 = new ComparatorMy1();

        if (comparatorMy1.compare("Asdf","df") > 0) {
            System.out.println("!!!!!!!!!!!!");
        }

        ArrayList<String> ar = new ArrayList<>();
        ar.add("asd");
        ar.add("hthdg");
        ar.add("cv");

        Collections.sort(ar,new ComparatorMy1());
        System.out.println(ar);
    }
}
