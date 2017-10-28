package creatingFile_27;

/* ����� java.io.File ������������ ���� �� �����, ��
���������� �� ������������ ���������� ����� �����.
������� �� ������� File ��� � ���� � ����� (��� ����
��������), � �� ��� � ����� �����. � ������ File,
��������, ��� ������� ��� ������ � ������. ���� �����
�������� ����������� ������� File ������� � ���, ���
�� ���������� ����� ���������� ������ �����������
����, ��� ������� �������� ����� ����� � ����
������. ��������, ����������� �������, �����������
��������� ��� ����� � ���� ����������� (��������,
File Writer ��� FitelnputStream), ����� ������ �����
����� ������ File. �� ������ ������� ���, ���������,
��� ���� ��������, � ����� ������������ ������ File
������� FileWriter ��� FilelnputStream.
*/


import java.io.File;

public class CreatingFile {

    public static void main(String[] args) {

        // �������� �����
        File file = new File("File.txt");

        //�������� ��������
        File dir = new File("For File");
        dir.mkdir();

        //�����  ����������� ��������
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();

            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }

        // �������� ���������� ���� ����� ��� ��������:
        System.out.println(dir.getAbsolutePath());

        /* ������� ����� ��� ������� (��� ����������
        ���������� �������� true): */
        boolean isDeleted = file.delete();
        System.out.println(isDeleted);


    }







}
