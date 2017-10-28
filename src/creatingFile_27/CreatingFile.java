package creatingFile_27;

/* Класс java.io.File представляет файл на диске, но
фактически не представляет содержимое этого файла.
Думайте об объекте File как о пути к файлу (или даже
каталоге), а не как о самом файле. У класса File,
например, нет методов для чтения и записи. Одна очень
полезная особенность объекта File состоит в том, что
он предлагает более безопасный способ представить
файл, чем простое указание имени файла в виде
строки. Например, большинство классов, принимающих
строковое имя файла в свой конструктор (например,
File Writer или FitelnputStream), могут вместо этого
взять объект File. Вы можете создать его, проверить,
что путь работает, и затем предоставить объект File
классам FileWriter или FilelnputStream.
*/


import java.io.File;

public class CreatingFile {

    public static void main(String[] args) {

        // Создание файла
        File file = new File("File.txt");

        //Создание каталога
        File dir = new File("For File");
        dir.mkdir();

        //Вывод  содержимого каталога
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();

            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }

        // Получить абсолютный путь файла или каталога:
        System.out.println(dir.getAbsolutePath());

        /* Удалить срайл или каталог (при выполнении
        возвращает значение true): */
        boolean isDeleted = file.delete();
        System.out.println(isDeleted);


    }







}
