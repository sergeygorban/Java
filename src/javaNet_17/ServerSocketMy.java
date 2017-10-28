package javaNet_17;


/* ServerSocket - это создание серверного соккета,
который будет принимать запросы сос стороныы клиента */


import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketMy {

    public static void main(String[] args) throws IOException {

        /* сервер начинает отслеживать входящие клиентские запросы
        на порту 4242 */
        ServerSocket serverSocket = new ServerSocket(4242);

    }
}
