package thread_18;

/* Для того, чтобы запустить задачу в отдельном потоке необходимо сделать следующее:
    1. Класс методы которого будут выполняться в отдельном потоке должен реализовывать
       интерфейс Runnable
    2. Интерфейс Runnable является функциональным, и его экземпляр можно создать
       с помощью лямбда-выражения следующим образом: Runnable г = () -> { код задачи }
    3. Создать объект типа Thread из объекта типа Runnable
    4. Запустите поток на выполнение, используя метод start()

    */
public class RunnableMy implements Runnable {

    @Override
    public void run() {
        print();
    }

    public void print() {
        System.out.println("RUN!!!!!!!!!!!!!!!!!");
    }



    public static void main(String[] args) {


        Thread thread = new Thread(new RunnableMy());
        thread.start();


        /* Использование лямбда выражения */
        Runnable runnable = ()-> {
            System.out.println("RUN NEW!!!!!!!!!!");

        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }


}
