import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DatagramSocketServer datagramSocketServer = new DatagramSocketServer();
        datagramSocketServer.init(5555);
        datagramSocketServer.runServer();
    }
}
//192.168.22.117