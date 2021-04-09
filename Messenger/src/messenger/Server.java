package messenger;

import util.NetworkUtil;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server implements Runnable{

    ServerSocket servSocket;
    boolean start=false;
    Thread t;
    ServerController serverController;
    //ClientController clientController;
    Server(ServerController s) {
        serverController=s;
        t=new Thread(this);
        t.start();

    }
    @Override
    public void run() {
        while (!start) {
            serverController.btn.setOnMouseClicked(event -> {
                start = true;
                serverController.textArea.appendText("Server Started Successfully \n \n");
            });
        }
            try {
                servSocket = new ServerSocket(22222);
                    while (true) {
                        Socket clientSocket = servSocket.accept();
                        NetworkUtil connection = new NetworkUtil(clientSocket);

                        serverController.textArea.appendText((String) connection.read() + " has joined \n \n");
                        new ReadThreadServer(connection, serverController);
                        //new ReadThreadClient(connection, clientController);
                        new WriteThreadServer(connection, "Message  ", serverController);
                        //new Thread(new CreateClientConnection(clientList,connection)).start();
                    }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


