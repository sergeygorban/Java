package inheritance_10;



public class Wolf extends Canine {

    public String name = "Wolf";


    /*��������������� ������ ������������� ������ Animal*/
    @Override
    public void makeNoise() {
        System.out.println("Method from class Wolf");
    }

    @Override
    public void eat() {
        System.out.println("Method from class Wolf");
    }

    @Override
    public String getName(Animal animal) {
        return name;
    }

    public static void main(String[] args) {

        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.makeNoise();
        wolf.roam();
        wolf.sleep();


        /* ����������� �������� ����� ����. ���, ��� ��������� ���
        ����������� ��������� ����������, ����� ���� �� ���������. */

        Animal animal = new Wolf();

        /* ���������� ����� �� ������ Canine, ��� ��� Wolf ��
        �������� ������ ������ */
        System.out.println(animal.roam() + " Polymorphism");

        /* ������ ����� �� Wolf, ��� ��� Wolf �������� ����� �����*/
        animal.eat();

        /* ������ ����� �� Animal, ��� ��� �� Wolf, �� Canine
        ����� ����� �� ��������*/
        animal.sleep();

        /* ���� �������� ������ �������� � ������� ������������� ������,
        �� �� ����� ���������� ��������� ����� ���������� ������ ������
        ��������� ������*/
        System.out.println(animal.getName(new Wolf()));

        /* ��� ������������ ����� ������� ���� �� ������� ������������
        ����� � �����*/

        /* ��������� ����� */
        Animal animal1 = new Animal();
        Wolf wolf1 = new Wolf();
        Wolf wolf2 = new Wolf();


        /* ������ ��� ����������� ���������. ���������� ���� �� �������
        ������������ ��������� */
        //wolf1 = (Wolf) animal1;

        /* ����� �� ������� ���������*/
        Animal animal2 = wolf2;

    }
}


