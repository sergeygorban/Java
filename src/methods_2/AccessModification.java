package methods_2;

/*������ ������� � �����������*/

public class AccessModification {

    private int weight;

    /* ����� ������� ��� ������.
    ������� ������ - ������� ��������*/

    public int getWeight() {
        return weight;
    }

    /* ����� ����������� ��� ������
    ������� ������ - ���������� ��� �������� ��������*/

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {

        AccessModification acc = new AccessModification();
        acc.setWeight(33);
        System.out.println(acc.getWeight());
    }
}
