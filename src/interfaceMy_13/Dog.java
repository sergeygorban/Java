package interfaceMy_13;

/**
 * Created by CC on 05.06.2017.
 */
public class Dog extends Animal {

    public void love() {
        System.out.println("I love");
    }



    public static void main(String[] args) {

        /* ��� ����� ���������� �������� ������
        ������ ����������� � ���������� Pet */
        Pet dog = new Dog();

        dog.beFriendly();
        dog.play();


        /* ����� ��������� */
        System.out.println(ID);

        /*����� ������������ ������ ���������� */
        System.out.println(Pet.createRation("A", "S", "W"));

        /* ����� ������ �� ��������� */
        dog.print();

    }
}
