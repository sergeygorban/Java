package Reflection_30;

/*���������, ��������� ������������� ����������� �������,
���������� ������������. ��������� � ����� ������ ��������,
������� ����� ��������� ��� ������� ������������� ���� �����:
    1. ������ ������������ ������� � �������� ���������� ���������.
    2. �������� �������� ��� ���������� ���������; ��������, � �������
    ��������� ����� ����������� ����� toString(), ����������� ��
    ����� ��������.
    3. ���������� ����������� ���� ��� ������ � ���������.
    4. ���������� �������� ���� Method, ������� �������� ���������� ����������
    �� ������� � ������, �������� C++.

��������� � �� ������ �����������, �� � ������� ��������. �� ������������ �
�������� ������������ ���������������� �������, ����� ��� ������������,
������� ������� ���������� ���������, �������� �� �� ����������.

������ ���� Class ��������� �������� ����������� ������.

������� ����� � ����, ��� ������ ���� Class ���������� ��������� ���, �������
�� ����������� �������� �������. ��������, ��� int � ��� �� �����, ��, ��������
�� ���, int.class � ��� ������ ���� Class.

� ���������� ������ ������ newInstance() ��������� ����� ��������� ���� �� ������, ��� � �.
��� ������������� ����� ���������� ������� � ������ newlnstance () ������������
����������� ��� ����������. ���� � ������ ����������� ����������� ��� ����������,
������������ ����������.

���� ��� �������� ������� �� ����� ������ ��������� �������� ������������ �����-������
���������, �� ������������ ���������� ����� newlnstance() �� ������ Constructor.

��� ������, Field, Method � Constructor, �� ������ java. lang.reflect ���������
�������������� ����, ������ � ������������ ������.

�������� ������������ Java ��������� ����������, ����� ������ ���� �������� ������, �� �� ����
����������� ��������� �� ����������, ���� ��� ���� ����������.

�� ��������� � ��������� ��������� ����������� ������� �������, ������������� � Java. �� ����
��������� �� �������������� ����������� ������, �� ��� ������� ����� ������. ����� ������� ���,
���������� ������� ����� setAccessible() ��� �������� ���� Field, Method ��� Constructor,

�������� ��������� ��������� ��������� ��������� � ������� �������
����������, ��� ���� � ������ ������������ �� ����� ����������. �����
����������� ����������� ������� ��� ���������� ����������������, ��
��� ����������� � ����������� �� �����. ��������� � ����� ������� ��������, ��������� ����������
�� ����� ������ � ����������� ������. ��� ������ ����������� �� ����� ���������� ��������� � ��������
� ������������� ����������.
*/


import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

    public String name = "Java";

    public void create() {
        int a = 5;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {

        Reflection reflection = new Reflection();

        /* ������� ���������� Class. */
        System.out.println(reflection.getClass());
        System.out.println();

        /*������� ����� ������. ���� �� ����� ��������� �
        ������, �� ��� ������ ���������� � ��� ������ */
        System.out.println(reflection.getClass().getName());
        System.out.println();

        /*��������� ������ ���� Class, ��������������� ����� ������ �
        ��������� �������������*/
        String className = "java.util.Date";
        Class cl = Class.forName(className);

        /* ��������� ������ ���� Class */
        Class c2 = Reflection.class;

        /* �������� ���������� ������ */
        Reflection reflection1 = Reflection.class.newInstance();
        System.out.println(reflection1.name);
        System.out.println();

        /* ��������� ������ forName() � newlnstance(), ����� ��������� ����������
           �������, ����� ������� �������� � ���������� ������� */
        String name = "Reflection_30.Reflection";
        Reflection reflection2 = (Reflection) Class.forName(name).newInstance();
        System.out.println(reflection2.name);
        System.out.println();

        /*����� ����� ������*/
        Field[] cla = Reflection.class.getFields();
        System.out.println(Arrays.toString(cla));
        System.out.println();

        /*����� ����� ������*/
        Method[] cla1 = Reflection.class.getMethods();
        System.out.println(Arrays.toString(cla1));
        System.out.println();

        /*����� ������������ ������*/
        Constructor[] cla2 = Reflection.class.getConstructors();
        System.out.println(Arrays.toString(cla2));
        System.out.println();


        /*  ������ �������� �� ����� ���������� � ������� ���������.
        ��������� �������� �����, ������ public*/
        RefConst refConst = new RefConst("I am Java");
        Object v = refConst.getClass().getDeclaredField("name").get(refConst);
        System.out.println(v.toString());

        /*��������� �������� ����� private*/
        RefConst refConst1 = new RefConst("I am Java");
        Field field = refConst1.getClass().getDeclaredField("age");
        field.setAccessible(true);
        Object v1 = field.get(refConst1);
        System.out.println(v1.toString());

    }
}
