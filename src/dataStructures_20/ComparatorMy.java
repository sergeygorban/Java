package dataStructures_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by CC on 11.06.2017.
 */
public class ComparatorMy implements Comparator<ListObg> {


    @Override
    public int compare(ListObg o1, ListObg o2) {
        return o1.getName().compareTo(o2.getName());
    }




}
