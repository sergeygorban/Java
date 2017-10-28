package classes_5;

/* Класс - это шаблон, по которому будет сделан объект или другими
словами экземпляр класса. Класс состоит из полей (или другими
словами переменных экземпляра), методов и конструкторов
*/


public class Classes {

    // Поля
    private int weight = 12;
    private String color;

    //Конструктор
    public Classes(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    //Метод
    private void gav() {
        System.out.println("Gav");

    }

}
