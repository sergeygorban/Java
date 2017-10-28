package thread_18;

/* Будут ли потоки чередоваться? Увидите ли вы их имена
сменяющимися поочередно? С какой частотой они будут
меняться? При каждой итерации? Один раз в пять итераций?
Ответ таков: мы не знаем! Это все на совести планировщика.
На вашей ОС с конкретной версией JVM и вашим же
процессором вы можете получить совсем другие результаты.
Под управлением OS X 10.2 (Jaguar) с максимум пятью
итерациями поток альфа выполняется до конца, затем
завершает свою работу поток бета. Без гарантий, но очень
последовательно.
При увеличении количества итераций до 25 и выше
начинаются колебания. Поток альфа может не успеть завершить все
25 проходов, прежде чем планировщик сделает его
работоспособным и даст шанс потоку бета. */


public class MultipleThreads implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Now running" + threadName);
        }
    }

    public static void main(String[] args) {

        Runnable run = new MultipleThreads();

        Thread alfa = new Thread(run);
        Thread beta = new Thread(run);

        alfa.setName("Thread Alfa");
        beta.setName("Thread Beta");

        alfa.start();
        beta.start();
    }
}
