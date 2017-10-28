package thread_18;

import java.io.IOException;

/* Поток можно прервать принудительно только с помощью метода stop(), не рекомендованного к применению.
Но для запроса на прерывание потока исполнения может быть вызван метод interrupt().
Когда метод interrupt() вызывается  для потока исполнения, устанавливается состояние прерывания данного потока.
Это признак типа boolean, имеющийся у каждого потока исполнения. В каждом потоке исполнения следует
периодически проверять значение данного признака, чтобы знать, когда поток должен быть прерван.
Чтобы выяснить, было ли установлено состояние прерывания потока исполнения, вызывается статический
метод Thread.currentThread(), получающий текущий поток исполнения и вызывающий далее
метод is Interrupted(). Но если поток исполнения заблокирован, то проверить состояние его прерывания нельзя.
И здесь на помощь приходит исключение типа InterruptedException. Когда метод interrupt () вызывается для потока
исполнения, который заблокирован, например, в результате вызова метода sleep() или wait(), блокирующий вызов
прерывается исключением типа InterruptedException. (Существуют блокирующие вызовы ввода-вывода, которые не могут быть
прерваны. В таких случаях следует рассмотреть альтернативные способы прерывания потока исполнения.
В языке Java не существует требования, чтобы прерванный поток прекратил исполнение. Прерывание лишь привлекает
внимание потока. А прерванный поток может сам решить, как реагировать на прерывание его исполнения.
Некоторые потоки настолько важны, что должны обрабатывать исключение и продолжать свое исполнение.
Но зачастую поток должен просто интерпретировать прерывание как запрос на прекращение своего исполнения.

Проверка состояния прерывания потока исполнения вызовом метода islnterrupted() не обязательна и не удобна, если можно
вызвать метод sleep() (или другой прерываемый метод) после каждого рабочего шага цикла. Если же метод sleep()
вызывается, когда установлено состояние прерывания, поток исполнения не переходит в состояние ожидания.
Вместо этого он очищает свое состояние (!) и генерирует исключение типа InterruptedException.
Так, если метод sleep() вызывается в цикле, то проверять состояние прерывания не следует. Вместо этого лучше
организовать перехват исключения типа InterruptedException,

*/
public class InterruptFlow implements Runnable {

    public void sum() {

        Runnable runnable = () -> {

            int s = 0;
            for (int i = 0; i <= 6; i++) {
                try {
                    Thread.sleep(300);
                    System.out.println("Thread number 2: Wait number " + i + " State " + Thread.currentThread().getState());

                    if (i == 5) {
                        Thread.currentThread().interrupt();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("!!!! Thread number 2: InterruptedException " + i);
                }
                s = s + i;
            }

            System.out.println(s);
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }


    @Override
    public void run() {

    }

    public static void main(String[] args) {


        InterruptFlow flow = new InterruptFlow();
        flow.sum();

        for (int i = 0; i <= 10; i++) {

            try {
                System.out.println("Thread number 1: Wait number " + i + " State " + Thread.currentThread().getState());
                Thread.sleep(400);

                //Прерывание потока
                if (i == 2) {
                    Thread.currentThread().interrupt();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("!!!! Thread number 1: InterruptedException " + i);
            }
        }
    }
}
