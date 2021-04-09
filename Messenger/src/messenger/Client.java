package messenger;

import util.NetworkUtil;

import java.util.Scanner;


public class Client implements Runnable{
    Thread t;
    String username="No One ";
    ClientController cc;
    boolean isNameSet=false;
    Client(ClientController c) {
        t=new Thread(this);
        cc=c;


        /*new Thread(new Reader(connection)).start();
        new Thread(new Writer(connection)).start();
        */
        t.start();
    }

    @Override
    public void run() {
        {
                NetworkUtil connection = new NetworkUtil("127.0.0.1", 22222);

            //System.out.println("Enter your username : ");
            //Scanner in = new Scanner(System.in);
           // String username = in.nextLine();
            cc.textArea.setText("Enter your Username \n \n ");
            cc.sent.setOnMouseClicked(event -> {
                 username=cc.textField.getText();
                 isNameSet=true;
                connection.write(username);
                //connection.write(username);
                new ReadThreadClient(connection, cc);
                new WriteThreadClient(connection, username, cc);
            });

            while (true);

            }
        }
    }

