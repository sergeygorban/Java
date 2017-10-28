package dataStructures_20;

/**
 * Created by CC on 12.06.2017.
 */
public class ListObg implements Comparable<ListObg>{

    private String name;
    private int age;

    public ListObg (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ListObg o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "ListObg{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListObg listObg = (ListObg) o;

        if (age != listObg.age) return false;
        if (name != null ? !name.equals(listObg.name) : listObg.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
