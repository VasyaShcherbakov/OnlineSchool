package OnLIneScool.entyty;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

    public class Server {

        public static void main(String[] args) {

            Server server = new Server();
            server.ReceiveObject();

        }

        private SocketChannel socketChannel = null;

        void ReceiveObject() {
            socketChannel = createChannel();
            try {
                ObjectInputStream is = new ObjectInputStream(socketChannel.socket().getInputStream());
                Student student = (Student) is.readObject();
                System.out.println("Object received: " + student);
                socketChannel.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        private SocketChannel createChannel() {
            try {
                ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
                serverSocketChannel.socket().bind(new InetSocketAddress("localhost", 8080));
                System.out.println("Waiting for client...");
                socketChannel = serverSocketChannel.accept();
                System.out.println("Connect " + socketChannel.getRemoteAddress());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return socketChannel;
        }

    }
        private ArrayList<String> blackList = new ArrayList<>();

        public void loadBlackList(String fileName) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    blackList.add(line.trim());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public Client(String serverIP, String blackListFile) {
            this.serverIP = serverIP;
            loadBlackList(blackListFile);
            try {
                socketChannel = SocketChannel.open(new InetSocketAddress(serverIP, 9999));
                isConnected = true;
                outputStream = new ObjectOutputStream(socketChannel.socket().getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
                isConnected = false;
            }
        }

        public boolean connect() {
            if (isOnBlackList(serverIP)) {
                System.err.println("Connection to " + serverIP + " is blocked.");
                return false;
            }
    }
    }